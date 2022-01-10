package encapsulation;

public class carpet{
    private double width,lenght,unitPrice;
    private boolean isPersian;


    public void setWidth(double width) {
        if(width<0){
            return;
        }
        this.width = width;
    }

    public void setLenght(double lenght) {
        if(lenght<0){
            return;
        }
        this.lenght = lenght;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<0){
            return;
        }
        this.unitPrice = unitPrice;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public double calcCost(){
        double totalCost= (width*lenght)*unitPrice;
        if(isPersian){
        totalCost  =  totalCost+200;
        }
        return totalCost;
    }
    public carpet(double width,double lenght,double unitPrice, boolean isPersian){
       setWidth(width);
        setLenght(lenght);
        setUnitPrice(unitPrice);
        setPersian(isPersian);

    } //constructor with setter

    public String toString() {
        return "carpet{" +
                "width=" + width +
                ", lenght=" + lenght +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalCost= $" + calcCost()  +
                '}';
    }
    /*. Carpet Task
3.1create a class named Carpet:
private variables:
width, length, unitPrice, isPersian (boolean)
Encapsulate all the fields:
Conditions:
width can not be negative
width can not be negative
unit price can not be negative
Add a constructor to set all the instances
instance methods:
calcCost(): should be able to calculate the total
cost of the carpet and return it as double
toString(): should be able to display all the info
of the carpet including the total cost of the carpet as calculated by
calcCost()
total price of carpet = (width*length)*unitPrice
if the carpet is persian  carpet, add 200$ to the totalPrice*/
}
