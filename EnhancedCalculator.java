import java.util.Scanner;

public class EnhancedCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("\n===============================================================================================");
            System.out.println("ENHANCED JAVA CALCULATOR");
            System.out.println("=================================================================================================");
            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Sqaure Root");
            System.out.println("6.Power");
            System.out.println("7.Temperature Conversion");
            System.out.println("8.Exit");
            System.out.println("8.Exit");
            System.out.println("Enter your choice:");
            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter first number:");
                    double a=sc.nextDouble();
                    System.out.println("Enter second number:");
                    double b=sc.nextDouble();
                    System.out.println("Result:"+(a+b));
                    
                    break;
            
                default:
                    break;
            }
        }
    }
}
