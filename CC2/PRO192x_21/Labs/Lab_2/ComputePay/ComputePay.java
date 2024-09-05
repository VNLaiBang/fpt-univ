public class ComputePay{
    public static void main(String[] args){
        // Calculate pay at work based on hours worked each day
        int x = 4 + 5 + 8 + 4;
        System.out.println("My total hours worked:\n" + x);
        
        double y = 8.75;
        System.out.println("My hourly salary:\n$" + y);
        
        double z = x * y;
        System.out.println("My total pay:\n" + z);
    
        double tax = 0.2;
        System.out.println("My taxes owed:\n" + (z * tax));// 20% tax
        }
    }