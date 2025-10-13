import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        int animalChoice, menuChoice;

        do {
            animalChoice = animalChoiceMenu(keyboard);

            switch (animalChoice) {
                case 1: // Tiger
                    System.out.println("The animal which is chosen is: " + tigerObject.getNameOfAnimal());
                    menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);
                    handleTiger(menuChoice, tigerObject, keyboard);
                    break;

                case 2: // Dolphin
                    System.out.println("The animal which is chosen is: " + dolphinObject.getNameOfAnimal());
                    menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);
                    handleDolphin(menuChoice, dolphinObject, keyboard);
                    break;

                case 3: // Penguin
                    System.out.println("The animal which is chosen is: " + penguinObject.getNameOfAnimal());
                    menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);
                    handlePenguin(menuChoice, penguinObject, keyboard);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println("Do you want to continue? (Enter 1 for yes / 2 for no)");
        } while (keyboard.nextInt() == 1);
    }

    // ===== Helper Methods =====

    public static int animalChoiceMenu(Scanner sc) {
        System.out.println("\n******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.print("Enter choice of animal (1-3): ");
        return sc.nextInt();
    }

    public static int animalDetailsManipulationMenu(Scanner sc, Animal animal) {
        System.out.println("\n******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");
        System.out.print("Enter choice (1-4): ");
        return sc.nextInt();
    }

    public static void handleTiger(int choice, Tiger tiger, Scanner sc) {
        switch (choice) {
            case 1:
                System.out.print("Enter number of stripes: ");
                tiger.setNumberOfStripes(sc.nextInt());
                System.out.print("Enter speed: ");
                tiger.setSpeed(sc.nextInt());
                System.out.print("Enter roar level: ");
                tiger.setSoundLevelOfRoar(sc.nextInt());
                break;
            case 2:
                System.out.println("Stripes: " + tiger.getNumberOfStripes());
                System.out.println("Speed: " + tiger.getSpeed());
                System.out.println("Roar level: " + tiger.getSoundLevelOfRoar());
                break;
            case 3:
                tiger.walking();
                break;
            case 4:
                tiger.eatingFood();
                tiger.eatingCompleted();
                break;
        }
    }

    public static void handleDolphin(int choice, Dolphin dolphin, Scanner sc) {
        switch (choice) {
            case 1:
                System.out.print("Enter color: ");
                dolphin.setColor(sc.next());
                System.out.print("Enter swimming speed: ");
                dolphin.setSwimmingSpeed(sc.nextInt());
                break;
            case 2:
                System.out.println("Color: " + dolphin.getColor());
                System.out.println("Swimming speed: " + dolphin.getSwimmingSpeed());
                break;
            case 3:
                dolphin.swimming();
                break;
            case 4:
                dolphin.eatingFood();
                dolphin.eatingCompleted();
                break;
        }
    }

    public static void handlePenguin(int choice, Penguin penguin, Scanner sc) {
        switch (choice) {
            case 1:
                System.out.print("Is penguin swimming (true/false)? ");
                penguin.setIsSwimming(sc.nextBoolean());
                System.out.print("Enter walking speed: ");
                penguin.setWalkSpeed(sc.nextInt());
                System.out.print("Enter swimming speed: ");
                penguin.setSwimSpeed(sc.nextInt());
                break;
            case 2:
                System.out.println("Walking Speed: " + penguin.getWalkSpeed());
                System.out.println("Swimming Speed: " + penguin.getSwimSpeed());
                System.out.println(penguin.getIsSwimming() ? "Penguin is swimming." : "Penguin is walking.");
                break;
            case 3:
                if (penguin.getIsSwimming()) penguin.swimming();
                else penguin.walking();
                break;
            case 4:
                penguin.eatingFood();
                penguin.eatingCompleted();
                break;
        }
    }
}
