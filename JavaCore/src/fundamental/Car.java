package fundamental;

import java.util.Date;

/**
 * @Company: {Dream Inc.}
 * @Author: {urunov}
 * @Project: {ClassJava}
 * @Date: {2022/02/01 && 8:06 PM}
 */
public class Car {
    // Variables
    private String name; // name of the car
    private String companyName;
    private Date yearOfCar;

    private Double price;

    private int wheels;

    protected int speed; // private

    boolean color = true; // default --> public

    public Car(String name){
        //
        this.name = name;
    }


    public Car(String name, String companyName){
        //
        this.name = name;
        this.companyName = companyName;
    }

    public Car(String name, Date yearOfCar){
        //
        this.name = name;
        this.yearOfCar = yearOfCar;
    }

    public Car(String name, Double price) {
        //
        this.name = name;
        this.price = price;
    }

}


/****
 *  1. Class
 *  2. Object
 *  3. Comment
 *  4. Variables (String, Double, Int, Date )
 *  5. Constructor
 *  6. this
 *  7. public, private, protect, default.
 *  8. Looping (Sikl)
 *  9. Git
 *  10. Java Project Create (IntellJ Idea)
 *
 *  Git ga push qilinadi. (uzbek)
 *  Please, push your code to the Git. (English)
 * */

/**
 * Task: (Zadacha)
 * TimesTable (tablitsa umnajeniya)
 *
 * */

