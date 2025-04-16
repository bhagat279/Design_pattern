package builder_geekfic;

public class CarBuilder {
    private  int id;
    private  String brand;
    private  String model;
    private  String color;



    public CarBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public CarBuilder setBrand(String brand) {
        this.brand = brand;

       return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;

        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }



    public Car build()
    {
        return new Car(id,brand,model,color);
    }
}
