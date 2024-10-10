package Vehicle;

public class Convertible extends Car {
    private String roofType;
   
    //Constructor parameter
    public String getRoofType() {
        return this.roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public Convertible() {
        super();
        roofType ="";
    }

    public void print(){
        System.out.println("roofType "+ roofType);
    }
}
