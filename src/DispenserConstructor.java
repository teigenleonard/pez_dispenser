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
        pezCount = MAX_PEZ;
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
