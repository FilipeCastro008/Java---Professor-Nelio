package Aplicação;
import java.util.Locale;
import java.util.Scanner;
import Entidades.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product prod = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        prod.name = sc.next();
        System.out.println("Price: ");
        prod.price = sc.nextDouble();
        System.out.println("Quantity in Stock: ");
        prod.qtd = sc.nextInt();

        System.out.printf("%s, %.2f, %d", prod.name, prod.price, prod.qtd);
        sc.close();
        
    }
}
