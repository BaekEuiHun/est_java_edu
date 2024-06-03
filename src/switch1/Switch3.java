package switch1;

public class Switch3 {
    public static void main(String[] args){
        char grade = 'A';
        switch(grade){
            case 'A':
        System.out.println("Excellent");
        break;
        case 'B':
        System.out.println("Godd");
        break;
        case 'C':
        System.out.println("Average");
        break;
        case 'D':
        System.out.println("Below Average");
        break;
        case 'F':
        System.out.println("Fail");
            default:
        System.out.println("다시 입력하세요");
    }
    }
}
