package abstractexample21;

public class TestAbstraction1 {
    public static void main(String args[]){
        Shape s=new Circle();//In a real scenario, object is provided through m ethod, e.g., getShape() method
        s.draw();
    }

}
