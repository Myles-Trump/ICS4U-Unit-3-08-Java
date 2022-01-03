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

    Bike bikeVariable = new Bike();
    Truck truckVariable = new Truck();
    int userInputted = 0;
    int userInputted1 = 0;

    final Scanner whichVehicle = new Scanner(System.in);
    try {
      System.out.print("\nWould you like to (input 1) use the bike or ");
      System.out.print("(input 2) use the truck?: ");
      switch (whichVehicle.nextInt()) {
        case 1:
          while (userInputted != C4) {
            final Scanner userInput = new Scanner(System.in);
            System.out.print("\nWould you like to (input 1) change your ");
            System.out.print("cadence, (input 2) ring your bell, (input 3) ");
            System.out.print("check how many wheels you have, or (input 4) ");
            System.out.print("exit?: ");
            userInputted = userInput.nextInt();
            switch (userInputted) {
              case 1:
                final Scanner newCadence = new Scanner(System.in);
                bikeVariable.getCadence();
                System.out.print("\nEnter your new cadence: ");
                int newCad = newCadence.nextInt();
                if (newCad < 0) {
                  System.out.println("\nYou can't have a negative cadence!");
                } else {
                  bikeVariable.newCadence(newCad);
                  System.out.println("\nCadence updated!");
                }
                break;
              case 2:
                bikeVariable.ringBell();
                break;
              case C3:
                bikeVariable.numberOfWheels();
                break;
              case C4:
                break;
              default:
                System.out.println("\nYou have entered an invalid input!");
                break;
            }
          }
          break;
        case 2:
          final Scanner licensePlateChoice = new Scanner(System.in);
          System.out.print("\nEnter your truck's license plate: ");
          String setPlate = licensePlateChoice.nextLine();
          truckVariable.setLicensePlate(setPlate);

          while (userInputted1 != C5) {
            final Scanner userInput1 = new Scanner(System.in);
            System.out.print("\nWould you like to (input 1) interact with the");
            System.out.print(" license plate, (input 2) interact with the ");
            System.out.print("truck's speed, (input 3) cycle the air, ");
            System.out.print("(input 4) check the number of doors, or  ");
            System.out.print("(input 5) exit?: ");
            userInputted1 = userInput1.nextInt();
            switch (userInputted1) {
              case 1:
                final Scanner userChoice = new Scanner(System.in);
                System.out.print("\nYour license plate is "
                  + truckVariable.getLicensePlate()
                  + ", would you like to change it? (y/n): ");
                switch (userChoice.nextLine()) {
                  case "y":
                    final Scanner newPlate = new Scanner(System.in);
                    System.out.print("\nEnter a new plate: ");
                    String plateChoice = newPlate.nextLine();
                    truckVariable.setLicensePlate(plateChoice);
                    break;
                  default:
                    break;
                }
                break;
              case 2:
                truckVariable.currentSpeed();
                truckVariable.maximumSpeed();
                final Scanner newChoice2 = new Scanner(System.in);
                System.out.print("\nWould you like to (input 1) ");
                System.out.print("accelerate, (input 2) use the ");
                System.out.print("brakes, or (input 3) exit?: ");
                switch (newChoice2.nextInt()) {
                  case 1:
                    final Scanner accel = new Scanner(System.in);
                    System.out.print("\nHow much do you want to ");
                    System.out.print("accelerate? (mph): ");
                    truckVariable.accelerate(accel.nextInt());
                    break;
                  case 2:
                    final Scanner brake = new Scanner(System.in);
                    System.out.print("\nHow much do you want to ");
                    System.out.print("brake? (mph): ");
                    truckVariable.brake(brake.nextInt());
                    break;
                  default:
                    System.out.print("\nYou have entered an ");
                    System.out.print("invalid input.");
                    break;
                }
                break;
              case C3:
                truckVariable.provideAir();
                break;
              case C4:
                truckVariable.numberOfWheels();
                break;
              case C5:
                break;

              default:
                break;
            }
          }
          break;
        default:
          System.out.println("You have entered an invalid input!");
          break;
     }
    } catch (java.util.InputMismatchException errorCode) {
      System.out.println("\nYou have not entered a valid input.");
    }
  System.out.println("\nDone.");
  }
}
