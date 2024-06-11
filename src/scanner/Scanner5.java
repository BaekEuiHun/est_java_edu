package scanner;

import java.util.Scanner;

public class Scanner5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;
    int num1;
    int num2;
    System.out.println("원하는 기능을 선택하세요");
    System.out.println("1.덧셈 / 2.뺄셈 / 3.곱셈 / 4.나눗셈 / 0.종료");
    choice = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
        break;

      case 2:
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
        break;
      case 3:
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
        break;
      case 4:
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
        break;
      case 0:
        System.out.println("종료합니다");
        break;
      default:
        System.out.println("올바른 입력이 아닙니다");
    }
    num1 = sc.nextInt();
    System.out.println("두번째 값을 입력하고 엔터를 누르세요");
    num2 = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        break;
      case 2:
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        break;
      case 3:
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        break;
      case 4:
        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
        break;
    }
    System.out.println("원하는 기능을 선택하세요.");
    System.out.println("1.덧셈 / 2.뺄셈 / 3.곱셈 / 4.나눗셈 / 0.종료");

    choice = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
        break;

      case 2:
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
        break;
      case 3:
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
        break;
      case 4:
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
        break;
      case 0:
        System.out.println("종료합니다");
        break;
      default:
        System.out.println("올바른 입력이 아닙니다");
    }
    System.out.println("원하는 기능을 선택하세요.");
    System.out.println("1.덧셈 / 2.뺄셈 / 3.곱셈 / 4.나눗셈 / 0.종료");
    choice = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
        break;

      case 2:
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
        break;
      case 3:
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
        break;
      case 4:
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
        break;
      case 0:
        System.out.println("종료합니다");
        break;
      default:
        System.out.println("올바른 입력이 아닙니다");
    }
    num1 = sc.nextInt();
    System.out.println("두번째 값을 입력하고 엔터를 누르세요");
    num2 = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        break;
      case 2:
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        break;
      case 3:
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        break;
      case 4:
        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
        break;
    }
  }
}
