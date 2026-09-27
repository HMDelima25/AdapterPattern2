// Main.java
public class Main {
    public static void main(String[] args) {
        // Create adaptee instances
        Laptop myLaptop = new Laptop();
        Refrigerator myFridge = new Refrigerator();
        SmartphoneCharger myCharger = new SmartphoneCharger();

        // Wrap them in their respective adapters to match the PowerOutlet interface
        PowerOutlet laptopOutlet = new LaptopAdapter(myLaptop);
        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(myFridge);
        PowerOutlet smartphoneOutlet = new SmartphoneAdapter(myCharger);

        // Plug them into the standard power outlets
        System.out.println("Connecting devices to power outlets...");
        laptopOutlet.plugIn();
        fridgeOutlet.plugIn();
        smartphoneOutlet.plugIn();
    }
}