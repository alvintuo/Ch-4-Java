package Car;

/*
 * 	Project 4.5
 *  Write a class called Car that contains instance data that represents the make, model, and
 *	year of the car. Define the Car constructor to initialize these values. Include getter and setter
 *	methods for all instance data, and a toString method that returns a one-line description of the
 *	car. Create a driver class called CarTest, whose main method instantiates and updates several
 *	Car objects.
 */

public class Car {

    private String make, model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void setCarMake(String make) {
        this.make = make;
    }

    public String getCarMake() {
        return make;
    }

    public void setCarModel(String model) {
        this.model = model;
    }

    public String getCarModel() {
        return model;
    }

    public void setCarYear(int year) {
        this.year = year;
    }

    public int getCarYear() {
        return year;
    }

    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Acura", "MDX", 2005);
        Car car2 = new Car("Mercedes-Benz", "ML350", 2013);
        Car car3 = new Car("Tesla", "Model 3", 2020);

        System.out.println(car1);
        System.out.println(car1.getCarYear());

        System.out.println(car2);
        System.out.println(car2.getCarMake());

        System.out.println(car3);
        System.out.println(car3.getCarModel());

        car1.setCarMake("Ford");
        car1.setCarModel("Model T");
        car1.setCarYear(1968);

        System.out.println(car1);

    }
}