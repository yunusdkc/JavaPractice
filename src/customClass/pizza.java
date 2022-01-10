package customClass;

public class pizza {

    public char size;
    public int numberOfCheeseTopping,numberOfPepperoniTopping;

    public pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public  double calcCost(){
    double startingPrice = (size=='S')? 10 : (size=='M')? 12 : 14;

    double totalPrice = startingPrice + (numberOfCheeseTopping)*2+ (numberOfPepperoniTopping)*2; //each of them $2

    return totalPrice;
    }

    public String toString() {
        return "pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price = $" + calcCost() +
                '}';

    }
}
