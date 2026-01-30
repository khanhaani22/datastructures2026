import java.util.Scanner;

public class cellPhoneDemo {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String manuf;
        int mod;
        double price;

        System.out.print("Cell Phone Class \nEnter Manufacturer: ");
        manuf = scan.nextLine();

        System.out.print("Enter Model #: ");
        mod = scan.nextInt();

        System.out.print("Enter Retail Price: ");
        price = scan.nextDouble();

        cellPhone phone = new cellPhone(manuf, mod, price);
        System.out.print("\n" + phone.toString());
    }
}
