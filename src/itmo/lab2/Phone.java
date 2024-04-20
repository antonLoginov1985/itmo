package itmo.lab2;

public class Phone {

    String model;
    String manufacturer;
    int index;
    double screenSize;
    double price;
    boolean RTS;

    @Override
    public String toString() {
        return "Phone{" +
                "model=" + model +
                ", index=" + index +
                ", manufacturer=" + manufacturer +
                ", screenSize=" + screenSize +
                ", price=" + price +
                ", RTS=" + RTS +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public Phone() {

    }
    public Phone(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public Phone(String model, String manufacturer, int index , double screenSize, double price, boolean RTS) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.index = index;
        this.screenSize = screenSize;
        this.price = price;
        this.RTS = RTS;
    }
}


