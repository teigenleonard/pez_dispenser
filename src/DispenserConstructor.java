/**
 * Created by teigenleonard on 6/28/17.
 */
class DispenserConstructor {
    private String characterName; // declared but not initialized

    // String.contains();
    // public boolean (String matchingText);

    public DispenserConstructor(String name) {
        characterName = name;
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
