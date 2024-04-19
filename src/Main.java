import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to my humble Temperature Converter :)");
        System.out.println("---------------------------------------------");
        System.out.println("Please, enter a temperature: ");
        double temp = Double.parseDouble(sc.nextLine());
        System.out.println("Choose the unit.\n(1) -> Celsius, (2) -> Fahrenheit, (3) -> Kelvin:");

        int opt = Integer.parseInt(sc.nextLine());
        switch(opt){
            case 1:
            {
                System.out.println(temp + " C = " + (temp*1.8 + 32) + " F = " + (temp + 273.15) + " K");
                break;
            }
            case 2:
            {
                    System.out.println(temp + " F = " + ((temp-32) / 1.8) + " C = " + (((temp -32)/1.8) + 273.15) + " K");
                    break;
            }
            case 3:
            {
                System.out.println(temp + " K = " + (temp-273.15) + " C = " + (((temp -273.15)*1.8) + 32) + " F");
                break;
            }
        }
    }
}