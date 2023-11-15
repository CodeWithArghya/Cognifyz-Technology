//Task:-1 (Temperature Converter App [Level-1]
import java.util.Scanner;

class Temp {
    double celsius;
    double fahrenheit;

    public double getCelsiusToFahrenheit() {
        return celsius * (9/5) + 32;
    }

    public double getFahrenheitToCelsius() {
        return (fahrenheit - 32) * 5 / 9;
    }
}

public class Temperature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Temp temp1 = new Temp();
        System.out.println("Welcome to Temperature Converter App");
        String decesion;
        do {


            System.out.println("Enter 1 for Converting Celsius -> Fahrenheit & Enter 2 for Converting Fahrenheit to Celsius & Enter 3 for Exit");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You choose to Convert Temperature from Celsius to Fahrenheit");
                    System.out.println("Enter Temperature in Celsius : ");
                    double celsius = s.nextDouble();
                    temp1.celsius = celsius;
                    System.out.println("Temperature in Celsius : " + celsius);
                    System.out.println("Temperature in Fahrenheit (Converted) : " + temp1.getCelsiusToFahrenheit());
                    break;

                case 2:
                    System.out.println("You choose to Convert Temperature from Fahrenheit to Celsius");
                    System.out.println("Enter Temperature in Fahrenheit : ");
                    double fahrenheit = s.nextDouble();
                    temp1.fahrenheit = fahrenheit;
                    System.out.println("Temperature in Fahrenheit : " + fahrenheit);
                    System.out.println("Temperature in Celsius (Converted) : " + temp1.getFahrenheitToCelsius());
                    break;

                case 3:
                    System.out.println("Thanks for Using our Temperature Converter App");
                    System.out.println("Hope you like it...");
                    System.out.println("Kindly Give us a rating out of 5 where 0 -> very bad and 5-> very good; it will help us improve our system");
                    int rating = s.nextInt();
                    if (rating <= 1) {
                        System.out.println("Sorry to hear!! Your experience was not good. Next time we will try to improve our system");
                    } else if (rating >= 4 && rating < 5) {
                        System.out.println("Thanks for Rating..... We are happy to hear that you enjoyed our app.");
                    } else if (rating == 5) {
                        System.out.println("Wow!! That's great... We are very happy to hear that you enjoyed our system. Thanks for the Rating.");
                    } else {
                        System.out.println("Invalid input.... Enter Valid input for a rating from 0 to 5");
                    }
                    break;
                default:
                    System.out.println("Sorry... Something went wrong... Please try again...");
                    break;
            }
            System.out.println("Press Yes to Continue else press No to Close");
             decesion = s.next();
        }while (!decesion.equals("no"));
        s.close();
    }
}
