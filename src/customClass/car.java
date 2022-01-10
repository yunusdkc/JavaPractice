package customClass;

public class car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public double price ;

    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){
      brand = carBrand;
      model = carModel;
      color = carColor;
      year = carYear;
      price =carPrice;


    }

   public void drive(){

       System.out.println("Driving "+ brand + " "+ model);
   }







}
