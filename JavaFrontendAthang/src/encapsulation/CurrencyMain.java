package encapsulation;

import java.util.Scanner;

public class CurrencyMain {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in USD to convert into Ngultrum");
        float USD = sc.nextFloat();
        converter.setAmountInUSD(USD);
        System.out.println("The converted rate of 100 USD in Nu is = "+ converter.getAmountInNu());
    }
}
