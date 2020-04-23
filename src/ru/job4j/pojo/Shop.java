package ru.job4j.pojo;

public class Shop {
    public static Product[] delete(Product[] products, int index) {
        if (index >= products.length || products[index] == null) {
            return products;
        }

        for (int i = index; i < (products.length - 1); i++) {
            if (products[i + 1] == null) {
                products[i] = null;
                break;
            }
            products[i] = products[i + 1];
        }

        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        System.out.println("First loop:");
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();

        Shop.delete(products, 1);

        System.out.println("Second loop:");
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();

        Shop.delete(products, 1);

        System.out.println("Third loop:");
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
