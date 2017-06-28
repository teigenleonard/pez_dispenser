/**
 * Created by teigenleonard on 6/28/17.
 */
public class PezDispenser {
    public static void main(String[] args) {
        // Your amazing code goes here...
        DispenserConstructor dispenser = new DispenserConstructor("Teigen"); {
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


