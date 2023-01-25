/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public class Fruit {
    private String name,imgSrc,color;
    private double price;

    public Fruit(String name, String imgSrc, String color, double price) {
        this.name = name;
        this.imgSrc = imgSrc;
        this.color = color;
        this.price = price;
    }
    
    public Fruit() {
    }

    public String getName() {
        return name;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    
}
