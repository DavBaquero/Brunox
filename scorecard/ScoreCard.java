package scorecard;

import round.Round;

public class ScoreCard {
    private String color;
    private String redCorner = "";
    private String blueCorner = "";
    private Round numRounds;

    public ScoreCard(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRedCorner() {
        return redCorner;
    }

    public void setRCorner(String redCorner) {
        this.redCorner = redCorner;
    }

    public String getBlueCorner() {
        return blueCorner;
    }

    public void setBCorner(String blueCorner) {
        this.blueCorner = blueCorner;
    }

}
