package items;

public class Items {

    private String name;
    private double volume;

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public Items(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }
}
