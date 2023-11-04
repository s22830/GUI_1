package people;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private static int nextID = 1;
    private int id;
    private String name;
    private String lastName;

    private String address;

    private List<Integer> rentedApartments;
    private List<Integer> rentedParking;

    private List<TenantLetter> tenantLetter;

    public Person(String name, String lastName, String address) {
        this.id = nextID;
        nextID++;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        rentedApartments = new ArrayList<>();
        rentedParking = new ArrayList<>();
        tenantLetter = new ArrayList<>();
    }

    public void rentApartments(int apartmentId) {
        if (rentedApartments.size() < 5) {
            rentedApartments.add(apartmentId);
        }
    }

    public void rentParkingSpace(int parkingSpaceId) {
        if (rentedParking.size() < 5) {
            rentedParking.add(parkingSpaceId);
        }
    }

    public void checkoutApartment(int apartmentId) {
        rentedApartments.remove(Integer.valueOf(apartmentId));
    }

    public void checkoutParkingSpace(int parkingSpaceId) {
        rentedParking.remove(Integer.valueOf(parkingSpaceId));
    }

    public  void addTenantLetter(TenantLetter tenantLetter)
    {
       this.tenantLetter.add(tenantLetter);
    }

    public  void removeTenantLetter(TenantLetter tenantLetter)
    {
        this.tenantLetter.remove(tenantLetter);
    }

    public boolean hasProblematicTenant() {
        return  tenantLetter.size()>=3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Integer> getRentedApartments() {
        return rentedApartments;
    }

    public void setRentedApartments(List<Integer> rentedApartments) {
        this.rentedApartments = rentedApartments;
    }

    public List<Integer> getRentedParking() {
        return rentedParking;
    }

    public void setRentedParking(List<Integer> rentedParking) {
        this.rentedParking = rentedParking;
    }

    public List<TenantLetter> getTenantLetter() {
        return tenantLetter;
    }

    public void setTenantLetter(List<TenantLetter> tenantLetter) {
        this.tenantLetter = tenantLetter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", rentedApartments=" + rentedApartments +
                ", rentedParking=" + rentedParking +
                ", tenantLetter=" + tenantLetter +
                '}';
    }
}
