package loof;

public class While6 {
    public static void main(String[] args){
        int[] numbers = {4,-2,9,-7,5,1,-3,6,-1,8};
        int i = 0;
        int sum = 0;
        int sum2 = 0;
        while(i<numbers.length) {
            if(numbers[i] > 0 ) {
                sum += numbers[i];
            } else {
                sum2 += numbers[i];
            }
            i++;
        }
    System.out.println("양수의 합은 : " + sum + " 음수의 합은 : " + sum2);
    }
}
