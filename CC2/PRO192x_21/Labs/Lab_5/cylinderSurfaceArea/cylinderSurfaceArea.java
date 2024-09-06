public class cylinderSurfaceArea {
    public static double cylinderSurfaceArea(double radius, double height) {
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
    public static void main(String[] args) {
        System.out.println(cylinderSurfaceArea(3.0, 4.5));
    }
}
