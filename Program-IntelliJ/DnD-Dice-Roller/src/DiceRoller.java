import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        int numberOfDice, kindOfDie, sumOfRandomRolls = 0, result;
        int[] possibleDice = new int[]{4, 6, 8, 10, 12, 20};
        int modifier, modifierNumber;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Dice Roller game");
        System.out.println("Enter the number of Dice:");

        numberOfDice = sc.nextInt();
        while (numberOfDice > 1000) {
            System.out.println("WTF BOI U WANT ME TO CRASH?");
            System.out.println("Enter again now!");
            numberOfDice = sc.nextInt();
        }
        System.out.println("You choose " + numberOfDice + " number of dice");

        System.out.println("Now Enter the kind of the Die you want to roll: ");
        System.out.println("Possible dice: 4, 6, 8, 10, 12, 20");

        kindOfDie = sc.nextInt();
        while (kindOfDie != 4 && kindOfDie != 6 && kindOfDie != 8 && kindOfDie != 10 && kindOfDie != 12 && kindOfDie != 20) {
            System.out.println(kindOfDie + " is not an existing dice");
            kindOfDie = sc.nextInt();
        }
        for (int i = 0; i < possibleDice.length; i++) {
            if (kindOfDie == possibleDice[i]) {
                System.out.println("\nYou choose: " + numberOfDice + "d" + kindOfDie + "\n");

                System.out.println("Do you want to add a modifier?");
                System.out.println("Enter '1' for YES or '0' for NO");
                modifier = sc.nextInt();
                switch (modifier) {
                    case 0:
                        for (int j = 1; j <= numberOfDice; j++) {
                            int randomRoll = rand.nextInt(kindOfDie) + 1;
                            sumOfRandomRolls += randomRoll;
                            System.out.println("Random roll No." + j + " is: " + randomRoll);
                        }
                        System.out.println("\n");
                        System.out.println("The final result is: " + sumOfRandomRolls);
                        break;

                    case 1:
                        System.out.print("Now Enter the modifier number: ");
                        modifierNumber = sc.nextInt();
                        for (int j = 1; j <= numberOfDice; j++) {
                            int randomRoll = rand.nextInt(kindOfDie) + 1;
                            sumOfRandomRolls += randomRoll;
                            System.out.println("Random roll No." + j + " is: " + randomRoll);
                        }
                        System.out.println("\n");
                        System.out.println("The final result is sum of all rolls: " + sumOfRandomRolls + " + modifier: " + modifierNumber);
                        result = sumOfRandomRolls + modifierNumber;
                        System.out.println("Result: " + result);
                        break;

                    default:
                        break;
                }
            } else {
                continue;
            }
        }
    }
}
