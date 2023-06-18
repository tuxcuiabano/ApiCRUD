/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ficdev.apicrud;

/**
 *
 * @author pedroclarindodasilvaneto
 */
public class Product {
    private int id;
    private String name;
    private float price;
 
    public Product(int id) {
        this.id = id;
    }
 
    public Product() {
    }
 
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
 
        // getters and setters are not shown for brevity
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + getId();
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (getId() != other.getId())
            return false;
        return true;
    }  

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
}
