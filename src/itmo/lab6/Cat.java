package itmo.lab6;

public class Cat extends Animal {

    public Cat(int countPaws) {
        this.countPaws = countPaws;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "countPaws=" + countPaws +
                '}';
    }
}
