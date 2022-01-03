/*
* The "UseVehicle" program lets the user use their vehicle
*
* @author  Myles Trump
* @version 1.0
* @since   2022-01-01
*/

import java.util.Scanner;

/**
* This is a program that blanks.
*/
final class UseVehicle {

    /**
    * 3.
    */
    public static final int C3 = 3;

    /**
    * 4.
    */
    public static final int C4 = 4;

    /**
    * 5.
    */
    public static final int C5 = 5;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private UseVehicle() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        Vehicle vehicleVariable = new Vehicle();
        final Scanner licensePlateChoice = new Scanner(System.in);
        System.out.println("Enter your vehicle's license plate: ");
        String setPlate = licensePlateChoice.nextLine();
        vehicleVariable.setLicensePlate(setPlate);

        int userChoice = 0;

        while (userChoice != C5) {
            final Scanner userInput = new Scanner(System.in);
            try {
                System.out.print("\nWould you like to (input 1) interact with");
                System.out.print(" the vehicle's colour, (input 2) interact ");
                System.out.print("with the vehicles license plate, (input 3)");
                System.out.print(" check how many doors the vehicle has, ");
                System.out.print("(input 4) interact with the vehicle's speed");
                System.out.print(", or (input 5) exit?: ");
                userChoice = userInput.nextInt();

                switch (userChoice) {
                    case 1:
                        final Scanner userChoice3 = new Scanner(System.in);
                        System.out.print("\nThe colour is "
                            + vehicleVariable.getColour()
                            + ", would you like to change it? (y/n): ");
                        switch (userChoice3.nextLine()) {
                            case "y":
                                final Scanner newCol = new Scanner(System.in);
                                System.out.print("\nEnter a new colour: ");
                                vehicleVariable.setColour(newCol.nextLine());
                                break;
                            default:
                                break;
                        }
                        break;

                    case 2:
                        final Scanner userChoice1 = new Scanner(System.in);
                        System.out.print("\nYour license plate is "
                            + vehicleVariable.getLicensePlate()
                            + ", would you like to change it? (y/n): ");
                        switch (userChoice1.nextLine()) {
                            case "y":
                                final Scanner newPlate = new Scanner(System.in);
                                System.out.print("\nEnter a new plate: ");
                                String plateChoice = newPlate.nextLine();
                                vehicleVariable.setLicensePlate(plateChoice);
                                break;
                            default:
                                break;
                        }
                        break;

                    case C3:
                        vehicleVariable.doors();
                        break;

                    case C4:
                        vehicleVariable.currentSpeed();
                        vehicleVariable.maximumSpeed();
                        final Scanner newChoice2 = new Scanner(System.in);
                        System.out.print("\nWould you like to (input 1) ");
                        System.out.print("accelerate, (input 2) use the ");
                        System.out.print("brakes, or (input 3) exit?: ");
                        switch (newChoice2.nextInt()) {
                            case 1:
                                final Scanner accel = new Scanner(System.in);
                                System.out.print("\nHow much do you want to ");
                                System.out.print("accelerate? (mph): ");
                                vehicleVariable.accelerate(accel.nextInt());
                                break;
                            case 2:
                                final Scanner brake = new Scanner(System.in);
                                System.out.print("\nHow much do you want to ");
                                System.out.print("brake? (mph): ");
                                vehicleVariable.brake(brake.nextInt());
                                break;
                            default:
                                System.out.print("\nYou have entered an ");
                                System.out.print("invalid input.");
                                break;
                        }
                        break;

                    case C5:
                        break;

                    default:
                        System.out.print("\nYou have entered an invalid ");
                        System.out.println("integer");
                        break;
                }

            } catch (java.util.InputMismatchException errorCode) {
                System.out.println("\nYou have not entered a valid input.");
            }
        }
        System.out.println("\nDone.");
    }
}
