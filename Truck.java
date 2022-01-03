/*
* The "Truck" class
*
* @author Myles Trump
* @version 1.0
* @since 2022-01-01
*/

public class Truck extends Vehicle {

    /**
    * 18.
    */
    public static final int C18 = 18;

    /**
    * Calling methods from its superclass (Vehicle).
    */
    public Truck() {
        super();
    }

    /**
    * Defining and setting number of wheels.
    */
    int numOfWheels = C18;

    // Methods
    /**
    * The provideAir() method changes the rpm of the bike.
    */
    public void provideAir() {
        System.out.println("\nYou have recycled your air!");
    }
    /**
    * The numberOfWheels() method lets the user check the number of wheels.
    */
    public void numberOfWheels() {
        System.out.println("\nYour truck has " + numOfWheels + " wheels.");
    }
}
