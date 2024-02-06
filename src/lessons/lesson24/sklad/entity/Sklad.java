package lessons.lesson24.sklad.entity;

import java.util.Arrays;

public class Sklad {

    Product[] products;

    int databaseCursor = 0;

    public Sklad(int capacity) {
        this.products = new Product[capacity];
    }

    public Product[] getProducts() {
        return products;
    }

    public void addProduct(Product newProduct){
//        for (int i = 0; i < products.length; i++) {
//            if (products[i] == null) {
//                products[i] = newProduct;
//                return;
//            }
//        }

        // альтернативный вариант

        if (databaseCursor < products.length) {
            products[databaseCursor] = newProduct;
            databaseCursor++;
        } else {
            System.out.println("DATABASE FULL");
        }
    }

    @Override
    public String toString() {
        return "Sklad{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}
