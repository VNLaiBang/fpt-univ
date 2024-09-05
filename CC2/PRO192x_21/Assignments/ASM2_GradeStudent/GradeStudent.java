import java.util.Scanner;

public class GradeStudent {
    public static Scanner read = new Scanner(System.in);

    // Global variable: initWeight - serve the maximum weight
    public static double initWeight = 100;

    public static void begin() {
        System.out.println("This program reads exam/homework scores and reports your overall course/");
    }

    public static double[] scoreInput() {
        // This array contains 2 value: Weight and Score
        double[] weiSco = new double[2];

        // If the remaining coefficients (initWeight) are 0 then all are 0
        if (initWeight == 0) {
            weiSco[0] = 0;
            weiSco[1] = 1;
            return weiSco;
        }

        // General case
        System.out.print("Weight (0-100)? ");
        weiSco[0] = read.nextDouble();

        // Weight always suitable
        while (weiSco[0] > initWeight || weiSco[0] < 0) {
            System.out.println("Unavailble weight! Again? ");
            weiSco[0] = read.nextDouble();
        }

        // If the coefficient is 0 then all are 0
        if (weiSco[0] == 0) {
            weiSco[0] = 0;
            weiSco[1] = 1;
            return weiSco;
        }

        // Else: General case
        initWeight -= weiSco[0];
        System.out.print("Score earned? ");
        weiSco[1] = read.nextDouble();

        return weiSco;
    }

    public static double[] shifted(double[] weiSco) {
        System.out.print("Were scores shifted (1=yes, 2=no)? ");
        int shift = read.nextInt();
        int shift_amount;

        switch (shift) {
            case 1:
                System.out.print("Shift amount? ");
                shift_amount = read.nextInt();

                // Shift can't be negative as well
                while (shift_amount < 0) {
                    System.out.print("Shift can't be negative! Again? ");
                    shift_amount = read.nextInt();
                }

                // General case
                weiSco[1] += shift_amount;
                if (weiSco[1] > 100) {
                    weiSco[1] = 100;
                }
                break;

            case 2:
                break;

            default:
                System.out.println("Unknown answer! We consider no shifted");
                break;
        }

        return weiSco;
    }

    /**
     * @implNote print the total and weighted point
     */
    public static double resultPrint(double wei, double sco, double max) {
        System.out.format("Total points = %.0f / %.0f\n", sco, max);
        double weighted = Math.round((sco / max * 10.0 * wei)) / 10.0;
        System.out.println("Weighted score = " + weighted + "/ " + wei);
        return weighted;
    }

    /**
     * @return Weighted score of mid Term
     */
    public static double midTerm() {
        System.out.println("\nMidterm:");
        double[] weiSco = scoreInput();

        // Weight == 0, nothing to do
        if (weiSco[0] == 0) {
            return 0;
        }

        weiSco = shifted(weiSco);
        double weighted = resultPrint(weiSco[0], weiSco[1], 100);
        return weighted;
    }

    /**
     * @return Weighted score of final Term
     */
    public static double finalTerm() {
        System.out.println("\nFinal:");
        double[] weiSco = scoreInput();

        // Weight == 0, nothing to do
        if (weiSco[0] == 0) {
            return 0;
        }

        weiSco = shifted(weiSco);
        double weighted = resultPrint(weiSco[0], weiSco[1], 100);
        return weighted;
    }

    /**
     * @return Weighted score of homework and section points
     */
    public static double homework() {
        System.out.println("\nHomework: ");
        double weight = initWeight;
        System.out.println("Weight (0-100)? " + weight); /* Default is initweight left */

        // Remaining weight == 0, nothing to do
        if (weight == 0) {
            return 0;
        }

        System.out.println("Number of Assignment? ");
        int numAsm = read.nextInt(); /* Numbers of assignment */
        double[] sumMax = new double[2]; /* Sum of assignment point */

        // Score and max input part
        for (int i = 0; i < numAsm; i++) {
            System.out.format("Assignment %d score and max? ", i + 1);
            double x = read.nextDouble(), y = read.nextDouble();
            sumMax[0] += x;
            sumMax[1] += y;

            // Score is lower than max
            while (x > y) {
                System.out.print("Unavaible input Asm's point! Again? ");
                x = read.nextDouble();
                y = read.nextDouble();
            }
        }

        // Max of assignment can't be higher than 150
        if (sumMax[1] > 150) {
            sumMax[1] = 150;
            if (sumMax[0] > 150) {
                sumMax[0] = 150;
            }
        }

        // Section input
        System.out.print("How many sections did you attend? ");
        double secPoint = read.nextDouble();

        /* Condition to secPoint <= 30 */
        if (secPoint < 6) {
            sumMax[0] += secPoint * 5;
            System.out.format("\nSection points = %.0f\n", secPoint * 5);
        } else {
            sumMax[0] += 30;
            System.out.format("\nSection points = 30\n");
        }
        sumMax[1] += 30;

        double weighted = resultPrint(weight, sumMax[0], sumMax[1]);
        return weighted;
    }

    /**
     * @return none
     * @implNote Print GPA
     */
    public static void report(double mid_point, double final_point, double homework_point) {
        
        double overall = mid_point + final_point + homework_point;
        System.out.println("\nOverall percentage = " + overall);
        
        if (overall < 60) {
            System.out.println("Your grade will be at 0.0");
            System.out.println("Good luck next Semester");
        } else if (overall < 75) {
            System.out.println("Your grade will be at least 1.0");
            System.out.println("Good luck next Semester");
        } else if (overall < 85) {
            System.out.println("Your grade will be at least 2.0");
            System.out.println("Congratulation!");
        } else {
            System.out.println("Your grade will be at least 3.0");
            System.out.println("Congratulation!");
        }

    }

    public static void main(String[] args) {
        /* Condition for weight == 100 */
        // double initWeight = 100;
        begin();
        
        double mid_point = midTerm();  
        double final_point = finalTerm();
        double homework_point = homework();

        report(mid_point, final_point, homework_point);
    }
}