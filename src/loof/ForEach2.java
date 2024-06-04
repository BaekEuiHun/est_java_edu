package loof;

public class ForEach2 {
  public static void main(String[] args) {
    String[] arr = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};
    for (String name : arr) {
      if (name.length() >= 5) System.out.println(name);
    }
  }
}
