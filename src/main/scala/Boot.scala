import com.nongped.protobuf.example.AddressBookProtos.Person

/**
  * Created by worasit on 8/5/17.
  */
object Boot extends App {
  val john = Person.newBuilder()
    .setId(1)
    .setName("John Doe")
    .setEmail("jdoe@example.com")
    .addPhones(
      Person.PhoneNumber.newBuilder()
        .setNumber("555-4321")
        .setType(Person.PhoneType.Home)
        .build()
    )
    .build()
}
