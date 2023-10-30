package methodoverriding23;

public class Bike2 extends Vehicle {
    public void run1(){
        System.out.println("Bike is running safely");}
    public static void main(String args[]) {
        Bike2 obj = new Bike2();//creating object
        obj.run();//
        obj.run1();
    }
}
