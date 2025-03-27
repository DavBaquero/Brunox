package scorecard;

import round.RegularRound;
import round.Round;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ScoreCard {
    private String color;
    private String redCorner = "";
    private String blueCorner = "";
    private String[] judgeScoreCard;
    private Round[] numRounds;

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

    public void setRedCorner(String redCorner) {
        this.redCorner = redCorner;
    }

    public void setBlueCorner(String blueCorner) {
        this.blueCorner = blueCorner;
    }

    public String[] getJudgeScoreCard() {
        return judgeScoreCard;
    }

    public void setJudgeScoreCard(String[] judgeScoreCard) {
        this.judgeScoreCard = judgeScoreCard;
    }

    public Round[] getNumRounds() {
        return numRounds;
    }

    public void setNumRounds(Round[] numRounds) {
        this.numRounds = numRounds;
    }

    public void loadJudgeScoreCard(Optional<String[]> first) {
        judgeScoreCard = first.orElse(new String[0]);
        List<String> puntuacion = new ArrayList<>();
        for (int i = 0; i < judgeScoreCard.length; i++) {
            judgeScoreCard[i] = judgeScoreCard[i].trim();
            switch (judgeScoreCard[i]){
                case ("10 - 9"):
                    RegularRound rr = new RegularRound(judgeScoreCard[i]);
                    rr.boxerRoundScore();
                    break;
                case ("9 - 10"):
                    RegularRound rr2 = new RegularRound(judgeScoreCard[i]);
                    rr2.boxerRoundScore();
                    break;
                default:
                    break;
            }
            puntuacion.add(judgeScoreCard[i]);
        }
        listar(puntuacion);
    }

    private void listar(List<String> puntuacion) {
        StringBuilder puntuacionBuilder = new StringBuilder();
        for (int i = 0; i < puntuacion.size(); i++) {
            puntuacionBuilder.append(puntuacion.get(i)).append("\n");
        }
        System.out.println(puntuacionBuilder);
    }
}
