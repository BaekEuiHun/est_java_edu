package loof;

public class For8 {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++) {
      System.out.println("현재 i 값은 : " + i);
      for (int j = 0 ; j < 10; j++) {
        System.out.println("현재 j의 값은 : " + j);
        if(j==5) {
            break;
        }
      }
        }
    }
}
