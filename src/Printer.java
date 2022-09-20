public class Printer {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape oval = new Oval();
        Shape hexagon = new Hexagon();
        Shape pentagon = new Pentagon();
        Shape quad = new Quad();

        circle.printFigureName();
        oval.printFigureName();
        hexagon.printFigureName();
        pentagon.printFigureName();
        quad.printFigureName();

    }
}
