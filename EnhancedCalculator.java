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
                case 2:
                    System.out.println("Enter first number:");
                    a=sc.nextDouble();
                    System.out.println("Enter second number:");
                    b=sc.nextDouble();
                    System.out.println("Result:"+ (a-b));
                    break;
                case 3:
                    System.out.println("Enter first number:");    
                    a=sc.nextDouble();
                    System.out.println("Enter second number:");
                    b=sc.nextDouble();
                    System.out.println("Result:"+ (a*b));
                    break;
                case 4:
                    System.out.println("Enter first number:");    
                    a=sc.nextDouble();
                    System.out.println("Enter second number:");
                    b=sc.nextDouble();
                    if(b!=0){
                        System.out.println("Result:"+ (a/b));
                    } else{
                        System.out.println("Cannot divide by zero");
                        }
                    break;
                case 5:
                    System.out.println("Enter number:");    
                    double num=sc.nextDouble();
                    System.out.println("Square Root:"+ Math.sqrt(num));
                    break;
                case 6:
                    System.out.println("Enter base:");    
                    double base=sc.nextDouble();
                    System.out.println("Enter exponent:");
                    double power=sc.nextDouble();
                    System.out.println("Result:"+ Math.pow(base,power));
                    break;
                case 7:
                    System.out.println("1.Celsius to Fahrenhit");    
                    System.out.println("2.Fahrenheit to Celsius");
                    int option=sc.nextInt();
                    if(option==1){
                         System.out.println("Enter Celcius:");   
                         double c=sc.nextDouble();
                         double f=(c*9/5)+32;
                         System.out.println("Fahrenheit:"+ f);
                    } else if(option==2){
                        System.out.println("Enter Fahrenheit:");
                        double f=sc.nextDouble();
                        double c=(f-32)*5/9;
                        System.out.println("Celcius:"+ c);
                    } 
                    else {
                        System.out.println("Invalid option");
                    }
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;    
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
