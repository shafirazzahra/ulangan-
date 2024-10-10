package Vehicle;

public class Car extends Vehicle {
    private int numDoors;
    private boolean isElectric;

    //constructor parameter

    public Car() {
        super();
        numDoors = 0;
        isElectric = true;
    }

    public int getNumDoors() {
        return this.numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public void print() {
        System.out.println("numDoors "+ numDoors);
        System.out.println("isElectric " +isElectric);

    }



}
