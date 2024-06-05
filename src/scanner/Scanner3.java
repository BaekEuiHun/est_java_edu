package scanner;

import java.util.Random;
import java.util.Scanner;

public class Scanner3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    int targetNum = rand.nextInt(100) + 1;
    System.out.println("숫자 맞추기 게임");
    System.out.print("1부터 100 사이 숫자를 입력하세요");
    int input = sc.nextInt();
    if (input < targetNum) {
      System.out.println("랜덤 숫자보다 작습니다");
    } else if (input > targetNum) {
      System.out.println("랜덤 숫자보다 큽니다");
    } else {
      System.out.println("정답입니다");
    }
  }
}
