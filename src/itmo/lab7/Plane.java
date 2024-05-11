package itmo.lab7;

public class Plane {
    public String brand;
    public String model;
    private  Wing wing;

    public Plane(String brand, String model, Wing wing) {
        this.brand = brand;
        this.model = model;
        this.wing = wing;
    }


    @Override
    public String toString() {
        return "Plane{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", wing=" + wing +
                '}';
    }

    static class Wing{

        private Integer weight ;

       public Wing(Integer weight) {
           this.weight = weight;
       }

        @Override
        public String toString() {
            return "Wing{" +
                    "weight=" + weight +
                    '}';
        }

        void ShowWeightWing(int weight){

            System.out.println("Вес крыла равен "+ weight);
        }

    }

}
