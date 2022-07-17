package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
    return firstSide * secondSide;
    }

    @Override
    void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, firstSide: " + firstSide + " units, secondSide: " + secondSide + " units, color: " + super.color);
    }
}