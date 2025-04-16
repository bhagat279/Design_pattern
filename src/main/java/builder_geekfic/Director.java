package builder_geekfic;

public class Director  {

    public void buildBulero(CarBuilder carBuilder,String carName)
    {

        Car build = carBuilder.setBrand("bulero")
                .setId(101)
                .setModel("788555")
                .setColor("blue")
                .build();

    }

    public void buildMarshal(CarBuilder carBuilder, String carName)
    {
        if(carName.equals("marshal")) {
            carBuilder.setBrand("marshal")
                    .setId(101)
                    .setModel("788555")
                    .setColor("blue")
                    .build();
        }
    }
}
