package loof;

public class For9 {
  public static void main(String[] args) {
    for (int i = 1; i < 101; i++) {
      if (i == 50) {
      break;
      }
      System.out.println("현재 i 의 값은 : " + i);
      for (int j = 2; j < 101; j++) {
        if (j == 80) {
          break;
        }
        System.out.println("현재 j 의 값은 : " + j);
      }
    }
  }
}
