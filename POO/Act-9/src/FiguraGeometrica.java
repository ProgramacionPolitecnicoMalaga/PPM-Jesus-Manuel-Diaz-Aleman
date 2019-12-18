public abstract class  FiguraGeometrica {
   double area;
   String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public abstract double calcularArea();


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "area=" + area +
                ", color='" + color + '\'' +
                '}';
    }
}
