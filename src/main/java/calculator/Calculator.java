package calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Calculator {

        private static final Logger logger = LogManager.getLogger(Calculator.class);

        public Calculator(){
        }
        public static void main(String[] args)
        {
            int choice , flag=0;
            double num1,num2;
            Scanner scan = new Scanner(System.in);
            System.out.println("----------------Calculator-----------------");
            do {
                System.out.println("1 for Square Root\n2 for Factorial\n3 for Natural Logarithm\n4 for Power Function\n");
                System.out.print("Enter your choice: ");
                choice = scan.nextInt();
                if (choice > 4 || choice <1) {
                    flag = 1;
                    System.out.println("Invalid choice, exiting\n");
                }
                else if (flag != 1){
                    System.out.println("Enter the number");
                    System.out.print("Enter number x: ");
                    num1 = scan.nextDouble();


                    switch(choice) {
                        case 1: System.out.println("Square root of "+num1+" = "+ root(num1));
                            break;
                        case 2: System.out.println("Factorial of "+num1 +" = "+factorial(num1));
                            break;
                        case 3: System.out.println("Natural Log(base e) of "+num1+" = "+log(num1));
                            break;
                        case 4:
                            System.out.println("Enter the power value: ");
                            num2=scan.nextDouble();

                            System.out.println("Power Function of"+ num1+"to power"+num2+" = "+power(num1,num2));
                            break;
                        default: System.out.println("Exiting, Bye");
                            flag=1;
                    }
                }
                System.out.println("\n");
            }while(flag==0);
        }

        public static double root(double a) {
            logger.info("[Square root] - " + a);
            return Math.sqrt(a);
        }
        public  static double factorial(double a) {
            if(a==0||a==1)
                return a;
            else
            {
                return a*factorial(a-1);
            }
        }
        public  static double log(double a) {
            logger.info("[log] - " + a);
            return Math.log(a);
        }
        public static double power(double a, double b) {
            logger.info("[power] - " + a);
            return Math.pow(a,b);
        }


    }



