package com.data;

/**
 * Created by Marwan on 12/26/2021 around 7:44 PM
 */
public class Car {
    /**
     *
     *     "id": 1,
     *     "make": "Toyota",
     *     "model": "Highlander",
     *     "price": "23736.62",
     *     "year": 2008,
     *     "color": "Mauv"
     */

    private int id;
    private String make;
    private String model;
    private String price;
    private int year;
    private String color;

    public Car(){

    }

    public Car(int id, String make, String model, String price, int year, String color) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
