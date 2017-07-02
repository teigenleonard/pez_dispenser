/**
 * Created by teigenleonard on 6/28/17.
 */
public class PezDispenser {
    public static void main(String[] args) {
        System.out.println("We are making a new PEZ dispenser.");
        System.out.printf("There are %d PEZ allowed in each dispenser. \n",
                            DispenserConstructor.MAX_PEZ);
        DispenserConstructor dispenser = new DispenserConstructor("Gonzo"); {
            System.out.printf("This dispenser has the head of %s. %n",
                    dispenser.getCharacterName()
            );
        }

        if (dispenser.isEmpty()) {
            System.out.println("The PEZ dispenser is empty.");
        }

        String before = dispenser.swapHead("Darth Vader");
        System.out.printf("It was %s but I switched it to %s. \n",
                before,
                dispenser.getCharacterName());
        System.out.println("Filling the dispenser...");
        dispenser.fill();

        if (!dispenser.isEmpty()){
            System.out.println("The dispenser is full.");
        }
        while (dispenser.dispense()) {
            System.out.println("Chomp");
        }
        if (dispenser.isEmpty()) {
            System.out.println("Doh! No more PEZ");
        }
        dispenser.fill(4);
        dispenser.fill(1);
        while (dispenser.dispense()) {
            System.out.println("Num Num Num!");
        }
        try {
            dispenser.fill(400);
            System.out.println("Will this print?");
        } catch (IllegalAccessException iae) {
            System.out.printf("The error was %s", iae.getMessage());
        }

    }

}


