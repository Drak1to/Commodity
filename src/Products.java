import java.util.*;

public class Products {
    Set<Products> setProduct = new TreeSet<>(new ComparatorOfProducts());
    private String name;
    private int length;
    private int weight;
    private int width;
    private String type;

    public Products(String name, int length, int weight, int width) {
        this.name = name;
        this.length = length;
        this.weight = weight;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", weight=" + weight +
                ", width=" + width +
                '}';
    }

    public void addProducts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name of product ");
        String name = scanner.nextLine();
        System.out.println("Write length of product");
        int length = scanner.nextInt();
        System.out.println("Write weight of product");
        int weight = scanner.nextInt();
        System.out.println("Write width of product");
        int width = scanner.nextInt();
        Products products = new Products(name, length, weight, width);
        setProduct.add(products);
        System.out.println("Product " + products.toString() + " has been added");
    }

    public boolean isProductExist(String name, String type) {
        for (Products p : setProduct) {
            if (p.getName().equalsIgnoreCase(name) && p.getType().equalsIgnoreCase(type)) {
                return true;

            }
        }
        return false;
    }

    public void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name");
        String name = scanner.next();
        System.out.println("Write type of product");
        String type = scanner.next();
        if (isProductExist(name, type)) {
            Iterator<Products> iterator = setProduct.iterator();
            while (iterator.hasNext()) {
                Products nextProduct = iterator.next();
                if (nextProduct.getName().equalsIgnoreCase(name) && nextProduct.getType().equalsIgnoreCase(type)) {
                    iterator.remove();
                    System.out.println("Deputy" + name + type + " has been deleted");
                }
            }
        }


    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void replaceProduct() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Write name");
        String name = scanner1.next();
        System.out.println("Write type of product");
        String type = scanner1.next();
        if (isProductExist(name, type)) {
            Iterator<Products> iterator = setProduct.iterator();
            while (iterator.hasNext()) {
                Products nextProduct = iterator.next();
                if (nextProduct.getName().equalsIgnoreCase(name) && nextProduct.getType().equalsIgnoreCase(type)) {
                    iterator.remove();
                    System.out.println("Deputy" + name + type + " has been deleted");
                    System.out.println("Write product to add him");
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Write name of product ");
                    String name2 = scanner.nextLine();
                    System.out.println("Write length of product");
                    int length = scanner.nextInt();
                    System.out.println("Write weight of product");
                    int weight = scanner.nextInt();
                    System.out.println("Write width of product");
                    int width = scanner.nextInt();
                    Products products = new Products(name2, length, weight, width);
                    setProduct.add(products);
                    System.out.println("Product " + products.toString() + " has been added");
                }
            }
        }

    }
    public void showProducts() {
        for (Products p : setProduct) {
            System.out.println(p);

        }
    }
}



