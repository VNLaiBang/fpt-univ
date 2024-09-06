public class sphereVolume {
    public static double sphereVolume(double radius) {
        return ((4. / 3.) * Math.PI * Math.pow(radius, 3));
    }
    public static void main(String[] args) {
        System.out.println(sphereVolume(2.0));
    }
}
