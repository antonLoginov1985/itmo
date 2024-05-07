package itmo.lab6;

import java.util.Scanner;

public class Teacher extends User {

    String name;

    @Override
    public void InputInfo() {
        super.InputInfo();
        System.out.println("Введите имя пользователя");
        name = scanner.next();

    }

    public void ShowInfo() {
       System.out.println("Возраст пользователя "+age);
        System.out.println("Имя пользователя "+name);
    }

}
