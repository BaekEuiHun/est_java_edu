package loof;

public class For11 {
  public static void main(String[] args) {
    String[] words = {"apple", "banana", "cherry", "durian"};
    for (int i = 0; i < words.length - 1; i++) {
      for (int j = i + 1; j < words.length; j++) {
        System.out.println(words[i] + " " + words[j]);
      }
    }
  }
}
