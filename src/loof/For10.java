package loof;

public class For10 {
  public static void main(String[] args) {

    for (int number = 0; number < 10; number++) {

      if (number == 3) {
        continue;
      }
      System.out.println("현재 값은 : " + number);
    }
  }
}
