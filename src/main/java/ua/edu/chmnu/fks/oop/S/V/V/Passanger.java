package ua.edu.chmnu.fks.oop.S.V.V;

public class Passanger extends Car {
    public Passanger(String CarModel, int Years, int Sellprice) {
        super(CarModel, Years, Sellprice);
    }

    public static void main(String[] args)
    {   Car car1 = new Car("Scania",2015,145000,2);
        Car car2 = new Car("Ford", 2013, 20000,3);
        Car car3 = new Car("Audi", 2012, 25000,1);
        Car car4 = new Car("Cadillac",2014,90424,4);

        car1.setPrice(145000);
        car1.setYear(2015);
        car2.setPrice(22000);
        car2.setYear(2011);
        car3.setPrice(25000);
        car3.setYear(2012);
        car4.setBrand("Cadillac");

        System.out.println("This car is " + car1.getBrand() + ", year " + car1.getYear() + ", price " + car1.getPrice());
        System.out.println("This car is " + car2.getBrand() + ", year " + car2.getYear() + ", price " + car2.getPrice());
        System.out.println("This car is " + car3.getBrand() + ", year " + car3.getYear() + ", price " + car3.getPrice());
        System.out.println("This car is " + car4.getBrand() + ", year " + car4.getYear() + ", price " + car4.getPrice());

        System.out.println("The total car number is: " + car1.getNumber());
        System.out.println("The total car number is: " + car2.getNumber());
        System.out.println("The total car number is: " + car3.getNumber());
        System.out.println("The total car number is: " + car4.getNumber());

    }
}