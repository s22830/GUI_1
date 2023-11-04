package housing;

import items.Items;
import items.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpace {

    private static int nextId = 1;
    private  int id;
    private int volume;

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        ParkingSpace.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    private List<Vehicle> vehicles;

    private List<Items> items;
    public ParkingSpace(int volume) {
        this.id = nextId++;
        this.volume = volume;
        this.vehicles = new ArrayList<>();
        this.items = new ArrayList<>();
    }
    public ParkingSpace(int weight, int length, int high) {
        this.id = nextId++;
        this.volume = weight*length*high;
        this.vehicles = new ArrayList<>();
        this.items = new ArrayList<>();
    }



}
