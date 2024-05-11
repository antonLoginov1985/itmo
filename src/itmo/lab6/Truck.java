package itmo.lab6;

public class Truck extends Car{

    public int сountWheels;
    public int maxWeight;

    public void setСountWheels(int сountWheels) {
        this.сountWheels = сountWheels;
        System.out.println(this.сountWheels);
    }

    public Truck(int w, String m, char c, float s, int сountWheels, int maxWeight) {
        super(w, m, c, s);
        this.сountWheels = сountWheels;
        this.maxWeight = maxWeight;
    }


}
