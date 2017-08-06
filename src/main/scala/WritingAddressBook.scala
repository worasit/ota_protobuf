import java.io.{BufferedReader, PrintStream}

import com.nongped.protobuf.example.AddressBookProtos.Person
import com.nongped.protobuf.example.AddressBookProtos.Person.PhoneNumber

/**
  * Created by wdaimongkol on 8/6/2017 AD.
  */
object WritingAddressBook extends App {

  import com.nongped.protobuf.example.AddressBookProtos.AddressBook
  import java.io.BufferedReader
  import java.io.FileInputStream
  import java.io.FileNotFoundException
  import java.io.FileOutputStream
  import java.io.InputStreamReader

  if (args.length == 0) {
    System.err.println("Usage:  AddPerson ADDRESS_BOOK_FILE")
    System.exit(-1)
  }

  val addressBook = AddressBook.newBuilder

  // Read the existing address book.
  try
    addressBook.mergeFrom(new FileInputStream(args(0)))
  catch {
    case e: FileNotFoundException =>
      System.out.println(args(0) + ": File not found.  Creating a new file.")
  }

  // Add an address.
  addressBook.addPeople(AddPerson.PromptForAddress(new BufferedReader(new InputStreamReader(System.in)), System.out))

  // Write the new address book back to disk.
  val output = new FileOutputStream(args(0))
  addressBook.build.writeTo(output)
}


object AddPerson {
  def PromptForAddress(stdin: BufferedReader, stdout: PrintStream): Person = {

    val person = Person.newBuilder()

    stdout.print("Enter person ID: ")
    person.setId(Integer.valueOf(stdin.readLine()))

    stdout.print("Enter name: ")
    person.setName(stdin.readLine())

    stdout.print("Enter email address (blank for none): ")
    val email = stdin.readLine
    if (email.length > 0) person.setEmail(email)

    import com.nongped.protobuf.example.AddressBookProtos.Person

    stdout.print("Enter a phone number (or leave blank to finish): ")
    val number: String = stdin.readLine

    val phoneNumber: PhoneNumber.Builder = Person.PhoneNumber.newBuilder.setNumber(number)
    stdout.print("Is this a mobile, home, or work phone? ")
    val phoneType: String = stdin.readLine
    if (phoneType == "mobile") {
      phoneNumber.setType(Person.PhoneType.Mobile)
    }
    else {
      if (phoneType == "home") {
        phoneNumber.setType(Person.PhoneType.Home)
      }
      else {
        if (phoneType == "work") {
          phoneNumber.setType(Person.PhoneType.Work)
        }
        else {
          stdout.println("Unknown phone type.  Using default.")
        }
      }

      person.addPhones(phoneNumber)
    }

    person.build()
  }
}