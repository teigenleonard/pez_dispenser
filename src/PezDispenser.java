/**
 * Created by teigenleonard on 6/28/17.
 */
public class PezDispenser {
    public static void main(String[] args) {
        System.out.println("We are making a new PEZ dispenser.");
        System.out.printf("There are %d PEZ allowed in each dispenser \n",
                            DispenserConstructor.MAX_PEZ);
        DispenserConstructor dispenser = new DispenserConstructor("Ape"); {
            System.out.printf("This dispenser is %s %n",
                    dispenser.getCharacterName()
            );
        }

        String before = dispenser.swapHead("Darth Vader");
        System.out.printf("It was %s but Chris switched it to %s",
                before,
                dispenser.getCharacterName());
    }

}


