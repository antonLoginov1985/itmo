package itmo.lab3;

import java.time.Year;

public class JavaProgram {
    public static void main(String[] args) {
    Study st = new Study();
        st.setCourse("Изучение Java - это просто!");

        System.out.println(st.printCourse());

        Car car1 = new Car("blue", 1450.50);
        Car car2 = new Car("red");
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        Home home1 = new Home(15, 1985, "Караблик");
        Home home2 = new Home(5, 1965, "Сталинка");
        System.out.println(home1.toString());
        System.out.println(home2.toString());

        System.out.println(home1.getDifferentYearConstruction());

        Tree tree1 = new Tree();
        Tree tree2 = new Tree(150, "dub");
        Tree tree3 = new Tree(120,true, "beresa");


    }
}
