package ss8_clean_code_end_refactoring.bai_tap;

public class TennisGame {
    private static final String ALL = "-All";
    private static final String LOVE = "love";
    private static final String FIFTEEN = "Fifteen";
    private static final String THIRTY = "Thirty";
    private static final String FORTY = "Forty";
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;

    public static String getScore(String player1Name, String player2Name, int goalScorer1, int goalScorer2) {
        String score = "";
        if (goalScorer1 == goalScorer2) {
            score = getString(goalScorer1);
        } else if (goalScorer1 >= 4 || goalScorer2 >= 4) {
            score = getString(goalScorer1, goalScorer2);
        } else {
            score = getString(goalScorer1, goalScorer2, score);
        }
        return score;
    }

    private static String getString(int goalScorer1, int goalScorer2, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = goalScorer1;
            else {
                score += "-";
                tempScore = goalScorer2;
            }
            switch (tempScore) {
                case ZERO:
                    score += LOVE;
                    break;
                case ONE:
                    score += FIFTEEN;
                    break;
                case TWO:
                    score += THIRTY;
                    break;
                case THREE:
                    score += FORTY;
                    break;
            }
        }
        return score;
    }

    private static String getString(int goalScorer1) {
        String score;
        switch (goalScorer1) {
            case ZERO:
                score = LOVE + ALL;
                break;
            case ONE:
                score = FIFTEEN + ALL;
                break;
            case TWO:
                score = THIRTY + ALL;
                break;
            case THREE:
                score = FORTY + ALL;
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    private static String getString(int goalScorer1, int goalScorer2) {
        String score;
        int minusResult = goalScorer1 - goalScorer2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
}
