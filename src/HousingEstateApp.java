import housing.Apartment;
import housing.ParkingSpace;
import items.Vehicle;
import people.Person;

import java.util.List;

public class HousingEstateApp {
    public static void main(String[] args) {
        HousingEstateApp housingEstateApp= new HousingEstateApp();

        Person person1 = new Person("Bob", "Marlley","Kuuuhah 23");
        Person person2 = new Person("Bob", "Marlley","Kuuuhah 23");
        Person person3 = new Person("Bob", "Marlley","Kuuuhah 23");

        Apartment apartment1 = new Apartment(40,120,10);
        Apartment apartment2 = new Apartment(50);
        Apartment apartment3 = new Apartment(50);
        Apartment apartment4 = new Apartment(50);
        Apartment apartment5 = new Apartment(50);
        Apartment apartment6 = new Apartment(50);

        ParkingSpace parkingSpace1 = new ParkingSpace(10,20,30);
        ParkingSpace parkingSpace2 = new ParkingSpace(20);
        ParkingSpace parkingSpace3 = new ParkingSpace(20);

        Vehicle vehicle1 = new Vehicle("BMW",20,900);
        Vehicle vehicle2 = new Vehicle("BMW",20,900);
        Vehicle vehicle3 = new Vehicle("BMW",20,900);
        Vehicle vehicle4 = new Vehicle("BMW",20,900);

        housingEstateApp.rentParkingPlace(person1,parkingSpace1);
        housingEstateApp.rentApartment(person1,apartment1);
        housingEstateApp.rentApartment(person1,apartment6);
        System.out.println(person1);
    }
   public void rentApartment(Person person, Apartment apartment){
       person.rentApartments(apartment.getId());
   }
   public void rentParkingPlace(Person person, ParkingSpace parkingSpace){
        person.rentParkingSpace(parkingSpace.getId());
   }

}
