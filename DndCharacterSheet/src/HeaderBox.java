import java.util.ArrayList;

public class HeaderBox {

    public String characterName;
    public ArrayList characterClassNames;
    public String characterBackground;
    public String characterAlignment;
    public String characterRace;
    public String playerName;
    public String expPoints;

    public HeaderBox(String characterName, ArrayList characterClassNames, String characterBackground, String characterAlignment, String characterRace, String playerName, String expPoints) {
        this.characterName = characterName;
        this.characterClassNames = characterClassNames;
        this.characterBackground = characterBackground;
        this.characterAlignment = characterAlignment;
        this.characterRace = characterRace;
        this.playerName = playerName;
        this.expPoints = expPoints;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public ArrayList getCharacterClassNames() {
        return characterClassNames;
    }

    public void setCharacterClassNames(ArrayList characterClassNames) {
        this.characterClassNames = characterClassNames;
    }

    public String getCharacterBackground() {
        return characterBackground;
    }

    public void setCharacterBackground(String characterBackground) {
        this.characterBackground = characterBackground;
    }

    public String getCharacterAlignment() {
        return characterAlignment;
    }

    public void setCharacterAlignment(String characterAlignment) {
        this.characterAlignment = characterAlignment;
    }

    public String getCharacterRace() {
        return characterRace;
    }

    public void setCharacterRace(String characterRace) {
        this.characterRace = characterRace;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getExpPoints() {
        return expPoints;
    }

    public void setExpPoints(String expPoints) {
        this.expPoints = expPoints;
    }
}