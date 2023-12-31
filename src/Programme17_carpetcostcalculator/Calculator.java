package Programme17_carpetcostcalculator;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        double area = floor.getArea();
        double costPerSquareMeter = carpet.getCost();
        return area * costPerSquareMeter;
    }
}
