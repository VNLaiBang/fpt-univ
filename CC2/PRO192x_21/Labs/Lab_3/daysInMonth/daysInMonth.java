public class daysInMonth {
    public static int daysInMonth(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
            default:
                System.out.println("Unavailable month " + month);
                return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(daysInMonth(1));
        System.out.println(daysInMonth(2));
        System.out.println(daysInMonth(3));
        System.out.println(daysInMonth(4));
        System.out.println(daysInMonth(5));
        System.out.println(daysInMonth(6));
        System.out.println(daysInMonth(7));
        System.out.println(daysInMonth(8));
        System.out.println(daysInMonth(9));
        System.out.println(daysInMonth(10));
        System.out.println(daysInMonth(11));
        System.out.println(daysInMonth(12));
        System.out.println(daysInMonth(13));
    }
}