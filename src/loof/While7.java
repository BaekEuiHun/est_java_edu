package loof;

public class While7 {
    public static void main(String[] args){
        int number = 0;
        while(number < 10) {
      System.out.println("현재 숫자 : " + number);
      if(number == 5) {
        System.out.println("5가 되어 종료합니다.");
        break;
      }
      number++;
        }
    }
}
