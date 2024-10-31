//Vehicle information:
//
//license plate
//colour
//price per day
//Customer information:
//
//check if the vehicle is currently free or rented out
//calculate total rental price for the customer
//get a list of max last 5 rentals per vehicle


import java.util.ArrayList;

public class Vehicle {
    private String licensePlate;
    private String Type;
    private String colour;
    private double pricePerDay;




//This method is called a constructer
    public Vehicle(String licensePlate, String type, String colour, double pricePerDay) {
        this.licensePlate = licensePlate;
        Type = type;
        this.colour = colour;
        this.pricePerDay = pricePerDay;


    }

    ArrayList <String> Vehicle  = new ArrayList<>();

    //Thses are getter and setter
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public String getType() {
        return Type;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }


  public String vehicelIsFree() {
      for (String vehicel : Vehicle) {
          if (vehicel.equals(licensePlate)) {
              System.out.println("The vehicle is currently free");
          }return vehicel;
      }
      return "Rented";
  }
}




