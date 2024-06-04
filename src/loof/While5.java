package loof;

public class While5 {
    public static void main(String[] args){
        int[] numbers = {10,5,8,20,3,15,9,2};
        int max = numbers[0];
        int i = 1;
        while(i<numbers.length) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
            i++;
        }
    System.out.println(max);
    }
}
