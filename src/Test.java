public class Test {
  public static void main(String[] args) {
    int x = 5;
    int y = 5;
    System.out.println("전위 증가 연산자 : " + (++x));
    System.out.println("후위 증가 연산자 : " + (y++));
    System.out.println("=============");
    System.out.println("x는" + x);
    System.out.println("y는" + y);

    int number1 = 10;
    int number2 = 20;

    int sum  = number1 + number2;
    int diff1 = number2 - number1;
    int diff2 = number1 - number2;
    int product = number1 * number2;
    int quot = number1 * number2;
    int remainder = number1 % number2;

    System.out.println("덧셈" + sum);
    System.out.println("뺼셈1" + diff1);
    System.out.println("뺼셈2" + diff2);
    System.out.println("곱셈" + product);
    System.out.println("나눗셈" + quot);
    System.out.println("나머지" + remainder);

    int number3 = 10;
    int number4 = 20;

    System.out.println(number3>number4);
    System.out.println(number3>=number4);
    System.out.println(number3<number4);
    System.out.println(number3<=number4);
    System.out.println(number3==number4);
    System.out.println(number3!=number4);

    System.out.println(true&&true);
    System.out.println(true&&false);
    System.out.println(false&&true);
    System.out.println(false&&false);
  }
}