package Vehicle;

public class Bicycle extends Vehicle  {
    private String bikeType;

    //constructor parameter

    public String getBikeType() {
        return this.bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public Bicycle() {
        super();
        bikeType = "";
    }

public void print() {
    System.out.println("bikeType "+ bikeType);
}    

}
