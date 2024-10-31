//You are tasked with designing a vehicle rental system.
// The system has to manage different types of vehicles
// (cars, trucks and motorcycles). It also needs to save
// information about customers who rent these vehicles.
//
//Vehicle information:
//
//license plate
//colour
//price per day
//Customer information:
//
//Name
//Address
//Age
//When designing this system, have in mind the features that the users will need:
//
//check if the vehicle is currently free or rented out
//calculate total rental price for the customer
//get a list of max last 5 rentals per vehicle


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

Customer customer1 = new Customer("Mundes", "Kamnpal", 25);
Customer customer2 = new Customer("Jack", "Kitende", 28 );
Vehicle vehicle1 = new Vehicle("Ug1232", "Benz", "Black", 25000);
Vehicle vehicle2 = new Vehicle("Ug 334", "Fusso", "white",24000);

vehicle1.vehicelIsFree();

        System.out.println(customer1.getName()+"   Has not rented  " + vehicle1.getType());
        System.out.println(customer2.getName()+" Has rented  " + vehicle2.getType());




        }



    }
