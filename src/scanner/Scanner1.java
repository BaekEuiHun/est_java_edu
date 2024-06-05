package scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("정수를 입력하세요");
    int n = sc.nextInt();
    System.out.println("입력한 정수는 : " + n);
    sc.close();
  }
}
