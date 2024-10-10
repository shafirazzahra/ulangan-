package Vehicle;

public class Vehicle {
    private int numWheels;
    private double price;

    //Constructor parameter

    public Vehicle() {
        super();
        numWheels = 0;
        price = 0;
    }

    public int getNumWheels() {
        return this.numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print() {
        System.out.println("numWheels" + numWheels);
        System.out.println("price "+price);
    }

}
