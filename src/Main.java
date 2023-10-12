import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String choose = scanner.next();
            scanner.nextLine();
            switch (choose) {
                case "1": {
                    ;
                    break;
                }
            }
        }
    }
    private static void menu(){
        System.out.println("--------------------------------------------");
        System.out.println("Enter 1 to add product");
        System.out.println("Enter 2 to remove product");
        System.out.println("Enter 3 to display all products ");

    }
}
