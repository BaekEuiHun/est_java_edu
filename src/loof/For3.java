package loof;

import java.util.Scanner;

public class For3 {
  public static void main(String[] args)  {
    int sum = 0;
    int n = 20;
    for (int i = 1; i <= n; i++) {
      if ((i % 3 == 0) && (i % 5 == 0)) {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
