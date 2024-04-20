package itmo.lab3;

import java.time.Year;

public class Home {

    Integer colFloors;
    Integer yearConstruction;
    String name;

    public Home(Integer colFloors,   Integer  yearConstruction, String name) {
        this.colFloors = colFloors;
        this.yearConstruction = yearConstruction;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Home{" +
                "colFloors=" + colFloors +
                ", yearConstruction=" + yearConstruction +
                ", name='" + name + '\'' +
                '}';
    }

    public  Integer getDifferentYearConstruction() {
        int currentYear = Year.now().getValue();
        int i = currentYear - this.yearConstruction;
        return i;
    }
}
