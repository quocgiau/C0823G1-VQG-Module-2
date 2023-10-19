package ss8_clean_code_end_refactoring.bai_tap;

public class Test {
    public static void main(String[] args) {
        TennisGame tennisGame = new TennisGame();
        String tennisGame1 = TennisGame.getScore("cuong", "giau", 3, 5);
        String tennisGame2 = TennisGame.getScore("cuong", "giau", 1, 2);
        String tennisGame3 = TennisGame.getScore("cuong", "giau", 3, 1);
        System.out.println(tennisGame1);
        System.out.println(tennisGame2);
        System.out.println(tennisGame3);
    }
}
