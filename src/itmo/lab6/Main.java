package itmo.lab6;

public class Main {
    public static void main(String[] args) {

        Human client1 = new Client("Anton", "Loginov", "Alfa bank");
        client1.info();

        Human employee1 = new BankEmployee("Maxim", "Duhno", "Alfa bank");
        employee1.info();

        //Car truck1 = new Truck(3000,"Man", "e[41m", 130, 8, 5000);
        //truck1.outPut();

        Animal Tommy = new Cat(4);
        System.out.println(Tommy.toString());
        System.out.println(Tommy.getCountPaws());

        Teacher teacher1 = new Teacher();
        teacher1.InputInfo();
        teacher1.ShowInfo();
    }
}
