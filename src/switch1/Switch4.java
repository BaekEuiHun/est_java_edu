package switch1;

public class Switch4 {
    public static void main(String[] args){
        char operator = '+';
        int num1 = 3, num2 = 1;
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default :
        System.out.println("다시 입력하세요");
    }
    }
}
