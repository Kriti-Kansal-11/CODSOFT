//Task4: Project On Currency Converter-:

import java.util.*;

public class Task4 {
    public static void main(String args[]){


        Scanner scanner = new Scanner (System.in);
        System.out.println("*****WELCOME TO CURREENCY CONVECTOR*****");
        System.out.println("1. USD to Rupee");
        System.out.println("2. Rupee to USD");
        System.out.println("3. Euro to Rupee");
        System.out.println("4. Rupee to Euro");
        System.out.println("Enter your choice(1 or 2 or 3 or 4 ): ");
        int choice = scanner .nextInt();


        if(choice == 1) {
            System.out.print("Enter the amount in USD: ");
            double USD = scanner.nextDouble();
            double Rupee = usdToRupee(USD);
            System.out.println("Converted amount in Rupee: " + Rupee);


        }else if (choice == 2){
            System.out.print("Enter the amount in Rupee: ");
            double Rupee = scanner.nextDouble();
            double USD = RupeeToUSD(Rupee);
            System.out.println("Converted amount in USD: " +USD);

        }
        else if(choice == 3){
            System.out.print("Enter the amount in Rupee: ");
            double Rupee = scanner.nextDouble();
            double EURO = RupeeToEuro(Rupee);
            System.out.println("converted amount in USD: "+EURO);
        }

        else {
            System.out.println("Invalid choice .please select 1 or 2 or 3 or 4");
        }
        scanner.close();


    }
    public static double usdToRupee(double USD){
        return USD * 85.32;

    }
    public static double RupeeToUSD(double Rupee){
        return Rupee * 0.0119804;


    }
    public static double euroToRupee(double EURO){
        return EURO * 89.10;
    }

    public static double RupeeToEuro(double Rupee){
        return Rupee *0.0113; 
    }
    
}
