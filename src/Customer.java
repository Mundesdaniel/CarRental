//Customer information:
//
//Name
//Address
//Age
//When designing this system, have in mind the features that the users will need:
//check if the vehicle is currently free or rented out
//calculate total rental price for the customer
//get a list of max last 5 rentals per vehicle

public class Customer {
    private  String name;
    private  String address;
    private int age;



    public Customer(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
}
