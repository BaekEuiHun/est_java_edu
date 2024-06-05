package scanner;

import java.util.Scanner;

public class Scanner4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String title, userName, userPhoneNumber;
    int people;

    System.out.println("영화 제목: ");
    title = sc.next();
    System.out.println("관람 인원 수: ");
    people = sc.nextInt();
    System.out.println("예매자 성함: ");
    userName = sc.next();
    System.out.println("예매자 전화번호: ");
    userPhoneNumber = sc.next();

    System.out.println("==== 영화 티겟 예매 정보 ====");
    System.out.println("영화 제목: " + title);
    System.out.println("관람 인원: " + people);
    System.out.println("예매자 이름: " + userName);
    System.out.println("예매자 전화번호: " + userPhoneNumber);
    System.out.println("총 결제 금액: " + people * 10000);

    sc.close();
  }
}
