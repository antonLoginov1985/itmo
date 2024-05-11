package itmo.lab6;

public class BankEmployee extends Human {

    private String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName  = bankName;
    }


    @Override
    public void info() {
        System.out.println("Данные работника банка - " + bankName + "; Имя: " + getFirstName() + ";Фамилия: "+ getLastName());
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
