/*
* The "Vehicle" class
*
* @author  Myles Trump
* @version 1.0
* @since   2022-01-01
*/

public class Vehicle {

    // Constants
    /**
    * 4.
    */
    public static final int C4 = 4;
    /**
    * 180.
    */
    public static final int C180 = 180;

    // the Vehicle class has two fields
    /**
    * Defining license plate.
    */
    private String licensePlate;
    /**
    * Defining and setting colour.
    */
    private String colour = "Really Red";
    /**
    * Defining and setting doors.
    */
    private int numberOfDoors = C4;
    /**
    * Defining and setting current speed.
    */
    private int speed = 0;
    /**
    * Defining and setting maximum speed.
    */
    private int maximumSpeed = C180;
    /**
    * Defining and setting number of wheel.
    */ 
    private int numOfWheels;

    // getters

    /**
    * Getter for license plate.
    * @return license plate
    */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
    * Getter for colour.
    * @return colour
    */
    public String getColour() {
        return this.colour;
    }

    // setters

    /**
    * Setter for license plate.
    * @param newPlate new license plate
    */
    public void setLicensePlate(final String newPlate) {
        this.licensePlate = newPlate;
    }

    /**
    * Setter for colour.
    * @param newColour new vehicle colour
    */
    public void setColour(final String newColour) {
        this.colour = newColour;
    }

    // methods

    /**
    * The doors() method tells the user how many doors the vehicle has.
    */
    public void doors() {
        System.out.println("\nThe vehicle has " + numOfDoors + " doors.");
    }

    /**
    * The currentSpeed() method tells the user the current speed the vehicle is
    * moving.
    */
    public void currentSpeed() {
        System.out.println("\nThe vehicle is moving at " + speed + " mph.");
    }

    /**
    * The maximumSpeed() method tells the user the maximum speed the vehicle is
    * moving.
    */
    public void maximumSpeed() {
        System.out.println("\nThe vehicle's maximum speed is " + maximumSpeed
            + " mph.");
    }

    /**
    * The numberOfWheels() method states the amount of wheels.
    */
    public void numberOfWheels() {
        System.out.println("\nYou vehicle have " + numberOfWheels + " wheels.");
    }

    /**
    * The accelerate() method lets the user speed up the vehicle.
    * @return the new speed
    * @param acceleration add onto speed
    */
    public int accelerate(final int acceleration) {
        if (maximumSpeed <= speed + acceleration) {
            System.out.print("\nYou cannot accelerate that much! Your speed");
            speed = maximumSpeed;
            System.out.println(" was set to " + speed + " mph.");
        } else if (acceleration <= 0) {
            System.out.println("\nYou have to enter a positive integer!");
        } else {
            speed = speed + acceleration;
            System.out.println("\nYour speed was set to " + speed + " mph.");
        }
        return acceleration;
    }

    /**
    * The brake() method lets the user slow down the vehicle.
    * @return the new speed
    * @param brakes subtract from speed
    */
    public int brake(final int brakes) {
        if (brakes <= 0) {
            System.out.println("\nYou have to enter a positive integer!");
        } else if (brakes > speed) {
            System.out.print("\nYou cannot go slower than 0 mph! You speed ");
            speed = 0;
            System.out.println("was set to " + speed + " mph.");
        } else {
            speed = speed - brakes;
            System.out.println("\nYour speed was set to " + speed + " mph.");
        }
        return brakes;
    }
}
