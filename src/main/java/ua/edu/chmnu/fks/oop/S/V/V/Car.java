package ua.edu.chmnu.fks.oop.S.V.V;

public class Car {
    private int yearModel;
    private String brand;
    private int priceModel;
    private int numberModel;

    public Car(String b, int year, int price, int number) {
        yearModel = year;
        brand = b;
        priceModel = price;
        numberModel = number;


    }

    public Car(String CarModel, int Years, int Sellprice) {
    }

    public int getYear() {
        return yearModel;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return priceModel;
    }

    public int getNumber() {
        return numberModel;
    }

    public void setYear(int year) {
        yearModel = year;
    }

    public void setBrand(String carBrand) {
        brand = carBrand;
    }

   // @SuppressWarnings("unused")
    public void setPrice(int price) {
        priceModel = price;

    }
    public void setNumber(int number){
        numberModel = number ;
    }
}

