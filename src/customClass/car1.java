package customClass;

public class car1 {
    public String model;
    public String brand;
    public String year;
    public String color;

    public String toString() {
        return "car1{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year='" + year + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void carInfo(String model, String brand, String year, String color) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public void drive(){
        System.out.println(brand+" "+ model+ " is driving");
    }


}
