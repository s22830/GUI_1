package items;

public class Vehicle {



    private String name;
    private int volume;
    private int engineCapacity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Vehicle(String name, int volume, int engineCapacity) {
        this.name = name;
        this.volume = volume;
        this.engineCapacity = engineCapacity;
    }
}
