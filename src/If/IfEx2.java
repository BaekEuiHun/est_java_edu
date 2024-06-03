package If;

public class IfEx2 {
    public static void main(String[] args){
        int year = 2023;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        }
        System.out.println("윤년입니다");
    }
}
