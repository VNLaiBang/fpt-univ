public class evaluatingExpressions {

    public static void main(String[] args) {

        /* 2.1 */
        /* Answer: -1, 22, -6875309 */

        /* 2.2 */
        System.out.println("2.2 evaluatingExpressions:\n" + (1 + 2 * 3 + 7 * 2 % 5));

        /* 2.3 */
        System.out.println("\n2.3 expressions2:\n" + (2 + 3 * 4 - 6));
        System.out.println(14 / 7 * 2 + 30 / 5 + 1);
        System.out.println((12 + 3) / 4 * 2);
        System.out.println((238 % 10 + 3) % 7);
        System.out.println((18 - 7) * (43 % 10));
        System.out.println(2 + 19 % 5 - (11 * (5 / 2)));
        System.out.println(813 % 100 / 3 + 2.4);
        System.out.println(26 % 10 % 4 * 3);
        System.out.println(22 + 4 * 2);
        System.out.println(23 % 8 % 3);
        System.out.println(12 - 2 - 3);
        System.out.println(6 / 2 + 7 / 3);
        System.out.println(6 * 7 % 4);
        System.out.println(3 * 4 + 2 * 3);
        System.out.println(177 % 100 % 10 / 2);
        System.out.println(89 % (5 + 5) % 5);
        System.out.println(392 / 10 % 10 / 2);
        System.out.println(8 * 2 - 7 / 4);
        System.out.println(37 % 20 % 3 * 4);
        System.out.println(17 % 10 / 4);

        /* 2.4 */
        System.out.println("\n2.4 expressions2:\n" + (4.0 / 2 * 9 / 2));
        System.out.println(2.5 * 2 + 8 / 5.0 + 10 / 3);
        System.out.println(12 / 7 * 4.4 * 2 / 4);
        System.out.println(4 * 3 / 8 + 2.5 * 2);
        System.out.println((5 * 7.0 / 2 - 2.5) / 5 * 2);
        System.out.println(41 % 7 * 3 / 5 + 5 / 2 * 2.5);
        System.out.println(10.0 / 2/4);
        System.out.println(8 / 5 + 13 / 2 / 3.0);
        System.out.println((2.5 + 3.5) / 2);
        System.out.println(9 / 4 * 2.0 - 5/4);
        System.out.println(9 / 2.0 + 7 / 3 - 3.0 / 2);
        System.out.println(813 % 100 / 3 + 2.4);
        System.out.println(27 / 2 / 2.0 * (4.3 + 1.7) - 8 / 3);
        System.out.println(53 / 5 / (0.6 + 1.4) / 2 + 13 / 2);
        System.out.println(2 * 3 / 4 * 2 / 4.0 + 4.5 - 1);
        System.out.println(89 % 10 / 4 * 2.0 / 5 + (1.5 + 1.0 / 2) * 2);

        /* 2.5 */
        System.out.println("\n2.5 expressions3:\n" + (2 + 2 + 3 + 4));
        System.out.println("2 + 2 " + 3 + 4);
        System.out.println(2 + " 2 + 3 " + 4);
        System.out.println(3 + 4 + " 2 + 2");
        System.out.println("2 + 2 " + (3 + 4));
        System.out.println("(2 + 2) " + (3 + 4));
        System.out.println("hello 34 " + 2 * 4);
        System.out.println(2 + "(int) 2.0" + 2 * 2 + 2);
        System.out.println(4 + 1 + 9 + "." + (-3 + 10) + 11 / 3);
        System.out.println(8 + 6 * -2 + 4 + "0" + (2 + 5));
        System.out.println(1 + 1 + "8 - 2" + (8 - 2) + 1 + 1);
        System.out.println(5 + 2 + "(1 + 1)" + 4 + 2 * 3);
        System.out.println("1" + 2 + 3 + "4" + 5 * 6 + "7" + (8 + 9));

        /* 2.6: declareRealNumberSystax */
        System.out.println("\n2.6 declareRealNumberSyntax:");
        double grade = 4.0;
        System.out.println("grade : " + grade);

        /* 2.7 fitness Variables */
        /* Answer:
         * int age = 19;
         * String gender = "male";
         * double height = 1.78;
         * int weight = 80;
         */

        /* 2.8 studentVariables */  
        /* Answer:
         * int year;
         * int cours;
         * double gpa;
         */      

        /* 2.9 lastDigitExpression */
        /* Answer:
         * number % 10
         */

        /* 2.10 Oops2-errors */
        
        /* 2.11 digitExpressions */
        /* Answer: 
         * (number/10) % (10)
         * number/100 % 10
         */

        /* 2.12 valueOfX */
        int x = 3;
        x = x + 2;
        x = x + x;
        

        System.out.println("2.12 valueOfX\nx = " + x);

        /* 2.13 valuesOfABC */
        int a = 5;
        int b = 10;
        int c = b;
        a = a + 1;
        b = b - 1;
        c = c + a;
        

        System.out.println("\n2.13 valueOfABC\na = " + a + "\nb = " + b + "\nc = " + c);

        /* 2.14 firstSecond */
        int first = 8;
        int second = 19;
        first = first + second;
        second = first - second;
        first = first - second;
        
        
         System.out.println("2.13 firstSecond\nfirst = " + first + "\nsecond = " + second);
        
        /* 2.15 fisrtSecond2 */
        /* Answer:
         * int first = 8, second = 19;
         * first += second;
         * second = first - second;
         * first-=second;
         */
        
        /* 2.16 valuesOfIJK */
        int i = 2, j = 3, k = 4;
        x = i + j + k;
        i = x - i - j;
        j = x - j - k;
        k = x - i - k;
        System.out.println("\n2.13 valuesOfIJK\ni = " + i + "\nj = " + j + "\nk = " + k);

        /* 2.17 maxMin */
        System.out.println("\n2.17 maxMin");
        int max;
        int min = 10;
        max = 17 - 4 / 10;
        max += 6;
        min = max - min;
        System.out.println(max * 2);
        System.out.println(max + min);
        System.out.println(max);
        System.out.println(min);

        /* 2.18 timesOperator */
        double y = (((12.3*x - 9.1)*x + 19.3)*x - 4.6)*x + 34.2;
        System.out.println("y = " + y);

        /* 2.19 ComputePay */
        
        /* 2.20 Receipt */

        /* done */
    }
}
