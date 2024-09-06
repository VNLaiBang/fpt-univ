public class getGrade {
    public static double getGrade(int point) {
        if (point < 0 || point > 100) {
            throw new IllegalArgumentException();
        } else if(point < 60) {
            return 0.0;
        } else if(point >= 60 && point < 62) {
            return 0.7;
        } else if(point >= 63 && point < 95) {
            return 0.8 + (point - 63) / 10.;
        } else if(point >= 95 && point <= 100) {
            return 4.0;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(getGrade(50));
        System.out.println(getGrade(60));
        System.out.println(getGrade(70));
        System.out.println(getGrade(80));
        System.out.println(getGrade(90));
        System.out.println(getGrade(95));
        System.out.println(getGrade(100));
        System.out.println(getGrade(101));
    }
}
