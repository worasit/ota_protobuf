import com.nongped.protobuf.example.AddressBookProtos
import com.nongped.protobuf.example.AddressBookProtos.{AddressBook, Person}

/**
  * Created by wdaimongkol on 8/6/2017 AD.
  */
object ReadingAddressBook extends App {

  import com.nongped.protobuf.example.AddressBookProtos.AddressBook
  import java.io.FileInputStream

  if (args.length != 1) {
    System.err.println("Usage:  ListPeople ADDRESS_BOOK_FILE")
    System.exit(-(1))
  }

  // Read the existing address book.
  val addressBook = AddressBook.parseFrom(new FileInputStream(args(0)))

  ListPeople.print(addressBook)
}


object ListPeople {
  def print(addressBook: AddressBook) = {
    import scala.collection.JavaConversions._
    for (person <- addressBook.getPeopleList) {
      System.out.println("Person ID: " + person.getId)
      System.out.println("  Name: " + person.getName)
      if (person.hasEmail) System.out.println("  E-mail address: " + person.getEmail)
      import scala.collection.JavaConversions._
      for (phoneNumber <- person.getPhonesList) {
        phoneNumber.getType match {
          case Person.PhoneType.Mobile =>
            System.out.print("  Mobile phone #: ")
          case Person.PhoneType.Home =>
            System.out.print("  Home phone #: ")
          case Person.PhoneType.Work =>
            System.out.print("  Work phone #: ")
        }
        System.out.println(phoneNumber.getNumber)
      }
    }
  }
}