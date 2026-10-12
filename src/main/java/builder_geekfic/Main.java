package builder_geekfic;

public class Main {
    public static void main(String[] args) {

       /* CarBuilder carBuilder = new CarBuilder();
        Car build = carBuilder.setId(205)
                .setModel("8999")
                .setBrand("bulero")
                .setColor("green")
                .build();

        System.out.println(build);*/

       Director director = new Director();
       CarBuilder carBuilder = new CarBuilder();

       director.buildBulero(carBuilder,"bulero");
       Car car1 = carBuilder.build();

       System.out.println(car1);





    }
}
