package itmo.lab3;

public class Car {
    String color;
    Double weight;
    String name;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }



    public Car() {

    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }
}
