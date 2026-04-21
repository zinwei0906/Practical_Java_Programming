package P1Q1;

import java.util.*;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class P1Q1 {

    public static void main(String[] args) {
        List<Integer> ScoreList = new ArrayList<>();
        ScoreList.add(100);
        ScoreList.add(50);
        ScoreList.add(80);
        ScoreList.add(70);
        ScoreList.add(90);
        ScoreList.add(60);

        int LowestScore = ScoreList.get(0);
        for (int number = 1; number < ScoreList.size(); number++) {
            if (ScoreList.get(number) < LowestScore) {
                LowestScore = ScoreList.get(number);
            }
        }
        int HighestScore = ScoreList.get(0);
        for (int number = 1; number < ScoreList.size(); number++) {
            if (ScoreList.get(number) > HighestScore) {
                HighestScore = ScoreList.get(number);
            }
        }
        int Total = 0;
        for (int number = 0; number < ScoreList.size(); number++) {
            Total += ScoreList.get(number);
        }
        int AverageScore = Total / ScoreList.size();

//        //Sort || Reverse
//        Collections.sort(ScoreList);
//        int LowestScore = ScoreList.get(0);
//        Collections.reverse(ScoreList);
//        int HighestScore = ScoreList.get(0);

        System.out.println("\n\nScore : " + ScoreList);
        System.out.println("The Lowest Score In The List  : " + LowestScore);
        System.out.println("The Highest Score In The List : " + HighestScore);
        System.out.println("The Total Score In The List   : " + Total);
        System.out.println("The Average Score In The List : " + AverageScore + "\n\n");
    }

}
