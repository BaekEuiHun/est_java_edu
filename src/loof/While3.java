package loof;

public class While3 {
    public static void main(String[] args){
        int k = 0;
        int sum = 0;
        int[] numbers = {5,2,9,1,7,4,6,3,8};
        while(k < numbers.length) {
            sum += numbers[k];
            k++;
        }
    System.out.println(sum / numbers.length);
    }
}
