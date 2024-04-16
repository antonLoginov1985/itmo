package itmo.lab3;

public class Tree {

    Integer Age;
    Boolean isLiving;
    String Name;


    public Tree(Integer age, String name) {
        Age = age;
        Name = name;
    }

    public Tree(Integer age, Boolean isLiving, String name) {
        Age = age;
        this.isLiving = isLiving;
        Name = name;
    }

    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }
}
