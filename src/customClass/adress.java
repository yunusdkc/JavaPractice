package customClass;

public class adress {

    /*. Address Task:
	2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012*/


    public int buildingNumber,zipcode;
      public String street, city, state;

    public adress(int buildingNumber, int zipcode, String street, String city, String state) {
        this.buildingNumber = buildingNumber;
        this.zipcode = zipcode;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String toString() {
        return
                " " + buildingNumber +
                " " + street  +
                " " + city +
                " ," + state +
                " " + zipcode ;
    }

}
