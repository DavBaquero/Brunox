package round;

public class RegularRound implements Round {
    private String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    public RegularRound(String roundScore) {
        this.roundScore = roundScore;
    }

    public String getRoundScore() {
        return roundScore;
    }

    public void setRoundScore(String roundScore) {
        this.roundScore = roundScore;
    }

    public byte getRedBoxerScore() {
        return redBoxerScore;
    }

    public void setRedBoxerScore(byte redBoxerScore) {
        this.redBoxerScore = redBoxerScore;
    }

    public byte getBlueBoxerScore() {
        return blueBoxerScore;
    }

    public void setBlueBoxerScore(byte blueBoxerScore) {
        this.blueBoxerScore = blueBoxerScore;
    }


    @Override
    public void boxerRoundScore() {
        String score = getRoundScore();
        switch (score){
            case "10 - 9":
                setRedBoxerScore((byte)(10));
                setBlueBoxerScore((byte)(9));
                break;
            case "9 - 10":
                setRedBoxerScore((byte)(9));
                setBlueBoxerScore((byte)(10));
                break;
            default:
                break;
        }
    }
}
