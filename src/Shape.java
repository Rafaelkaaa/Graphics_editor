public class Shape implements GeometricObjects{

    private String name;
    public void printFigureName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
