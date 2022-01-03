/*
* The "Bike" class
*
* @author Myles Trump
* @version 1.0
* @since 2022-01-01
*/

public class Bike extends Vehicle {

    /**
    * Calling methods from its superclass (Vehicle).
    */
    public Bike() {
        super();
    }

    // The Bike class has one unique field

    /**
    * Defining and setting cadence.
    */
    private int cadence = 0;

    // getters
    /**
    * The getter for cadence.
    */
    public void getCadence() {
        System.out.print("Your current cadence is " + cadence + " rpm.");
    }

    // methods
    /**
    * The newCadence() method changes the rpm of the bike.
    * @return nothing
    * @param inputtedCadence user's new cadence amount
    */
    public int newCadence(final int inputtedCadence) {
        cadence = inputtedCadence;
        System.out.println("\nYou cadence was set to " + cadence + " rpm.");
    }

    /**
    * The ringBell() method lets the user ring their bell.
    */
    public void ringBell() {
        System.out.println("\nRing ring!");
    }
}
