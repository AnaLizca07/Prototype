/**
 * This is the main class that demonstrates the usage of the PriceList class.
 * It creates a PriceList object, adds products to it, clones the PriceList,
 * and creates a deep clone of the PriceList. It then modifies the price of products in the deep clone.
 */
package org.prototype.Example_1;

import org.prototype.Example_1.models.PriceList;
import org.prototype.Example_1.models.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a new PriceList with the name "Normal List"
        PriceList priceList = new PriceList("Normal List");

        // Create a list of products
        List<Product> productList = List.of(new Product("Labial", 2000, 5),
                new Product("Rubor", 30000, 2),
                new Product("Pestañina", 10000, 2),
                new Product("Corrector", 25000, 3));

        // Add the product list to the PriceList
        priceList.setProductList(productList);

        // Print the PriceList
        System.out.println(priceList);

        // Clone the PriceList and change its name to "Second Price List"
        PriceList priceList2 = priceList.clone();
        priceList2.setName("Second Price List");

        // Print the cloned PriceList
        System.out.println(priceList2);

        // Create a deep clone of the PriceList and change its name to "Third price list"
        PriceList priceList3 = priceList.deepClone();
        priceList3.setName("Third price list");

        // Reduce the price of each product in the deep clone by 10%
        for(Product product: priceList3.getProductList()){
            product.setPrice(product.getPrice() * 0.9);
        }

        // Print the deep cloned PriceList
        System.out.println(priceList3);
    }
}