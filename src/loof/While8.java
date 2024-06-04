package loof;

public class While8 {
    public static void main(String[] args){
        int number = 0;
        while(number < 10) {
            number++;
            if(number ==3) {
                continue;
            } else {
        System.out.println("현재 값은 : " + number);
            }
        }
    }
}
