package itmo.lab6;

import java.util.Scanner;

public class User {

    protected Scanner scanner = new Scanner(System.in);
    protected int age;

    public void InputInfo(){
        System.out.println("Введите возраст пользователя");
        age = scanner.nextInt();
    }


}
