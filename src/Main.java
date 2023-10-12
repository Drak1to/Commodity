import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        Products products = new Products("T-Shirt", "Clothes",50, 2,25);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            String choose = scanner.next();
            scanner.nextLine();
            switch (choose) {
                case "1": {
                   products.addProducts();
                    break;
                }
                case "2": {
                    products.deleteProduct();
                    break;
                }
                case "3" : {
                    products.showProducts();
                    break;
                }
                case "4" : {
                    products.replaceProduct();
                    break;
                }
                case "5" :{
                    System.out.println("You finished");
                    System.exit(0);
                }

            }
        }
    }

    private static void menu() {
        System.out.println("--------------------------------------------");
        System.out.println("Enter 1 to add product");
        System.out.println("Enter 2 to remove product");
        System.out.println("Enter 3 to display all products ");
        System.out.println("Enter 4 to replace product");
        System.out.println("Enter 5 to exit");
    }
}
