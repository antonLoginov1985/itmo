package itmo.lab7;

public class Main {

    public static void main(String[] args) {

        Plane plane1 = new Plane("Boing", "747", new Plane.Wing(5000));
        System.out.println(plane1);

        Plane plane2 = new Plane("Tupolev", "154", new Plane.Wing(6000));
        System.out.println(plane2);
    }
}
