package org.prototype.Example_1.models;

import org.prototype.Example_1.interfaces.IPrototype;

/**
 * Represents a product with properties such as name, price, and amount.
 * Implements the IPrototype interface to support cloning operations.
 */
public final class Product implements IPrototype<Product> {
    private String name;
    private double price;
    private int amount;

    /**
     * Constructs a new Product object with the given name, price, and amount.
     *
     * @param name  the name of the product
     * @param price the price of the product
     * @param amount the amount of the product
     */
    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public Product clone() {
        // Creates a shallow copy of the PriceList.
        return new Product(this.name, this.price, this.amount);
    }

    @Override
    public Product deepClone() {
        // Creates a deep copy of the PriceList.
        return clone();
    }

    // Getters and setters
    /**
     * Returns the name of the product.
     *
     * @return the name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the product.
     *
     * @param name the new name of the product
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the price of the product.
     *
     * @return the price of the product
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the product.
     *
     * @param price the new price of the product
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns the amount of the product.
     *
     * @return the amount of the product
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the amount of the product.
     *
     * @param amount the new amount of the product
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) +"Product: " +
                "name= " + name + "\n" +
                "price= " + price + "\n" +
                "amount= " + amount ;
    }
}