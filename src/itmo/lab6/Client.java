package itmo.lab6;

public class Client extends Human{

    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName  = bankName;
    }

    @Override
    public void info() {
       System.out.println("Данные клиента банка - " + bankName + "; Имя: " + getFirstName() + ";Фамилия: "+ getLastName());
    }

    public String getBankName() {
        return bankName;
    }

}
