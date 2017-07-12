/**
 * Created by teigenleonard on 6/28/17.
 */
class DispenserConstructor {
    public static final int MAX_PEZ = 12;
    private String characterName; // declared but not initialized
    private int pezCount;

    public DispenserConstructor(String name) {
        characterName = name;
        pezCount = 0;
    }

    public void fill() {
        fill (MAX_PEZ);
    }

    public void fill(int pezAmount) {
        int newAmount = pezCount + pezAmount;
        if (newAmount > MAX_PEZ) {
            throw new IllegalArgumentException("PEZ overload!!!");
        }
        pezCount = newAmount;
    }


    public boolean isEmpty() {
        return  pezCount == 0;
    }

    public boolean dispense() {
        boolean wasDispensed = false;
        if (!isEmpty()) {
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }

    public String getCharacterName(){
        return characterName;

    }

    public String swapHead(String characterName) {
        String originalCharacterName = this.characterName;
        this.characterName = characterName;
        return originalCharacterName;
    }

}
