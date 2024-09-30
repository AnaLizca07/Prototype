package org.prototype.Example_1.models;

import org.prototype.Example_1.interfaces.IPrototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a list of products with a name. Implements the IPrototype interface for cloning.
 */
public class PriceList implements IPrototype<PriceList> {

    private String name;
    private List<Product> productList = new ArrayList<>();

    /**
     * Constructs a new PriceList with the given name.
     *
     * @param name The name of the PriceList.
     */
    public PriceList(String name) {
        this.name = name;
    }

    @Override
    public PriceList clone() {
        // Creates a shallow copy of the PriceList.
        PriceList clone = new PriceList(name);
        clone.setProductList(productList);
        return clone;
    }

    @Override
    public PriceList deepClone() {
        // Creates a deep copy of the PriceList.
        PriceList clone = new PriceList(name);
        List<Product> cloneProducts = new ArrayList<>();

        for(Product product : productList){
            Product cloneProduct = (Product) product.clone();
            cloneProducts.add(cloneProduct);
        }

        clone.setProductList(cloneProducts);
        return clone;
    }

    /**
     * Returns the name of the PriceList.
     *
     * @return The name of the PriceList.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the PriceList.
     *
     * @param name The new name of the PriceList.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the list of products in the PriceList.
     *
     * @return The list of products in the PriceList.
     */
    public List<Product> getProductList() {
        return productList;
    }

    /**
     * Sets the list of products in the PriceList.
     *
     * @param productList The new list of products in the PriceList.
     */
    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        // Returns a string representation of the PriceList.
        return Integer.toHexString(System.identityHashCode(this)) +"PriceList: \n" +
                "name=" + name + "\n" +
                "productList= " + productList;
    }
}