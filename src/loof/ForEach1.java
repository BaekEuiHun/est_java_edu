package loof;

public class ForEach1 {
  public static void main(String[] args) {

    int sum = 0;
    double avg = 0;

    int[] scores = {1, 30, 20, 80, 15, 20, 30, 22};
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    avg = sum / scores.length;
    System.out.println("합은 : " + sum);
    System.out.println("평균 : " + avg);
  }
}
