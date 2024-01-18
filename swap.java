import java.util.*;
public class Main {
  public static void main(String[] args) {
     List<String> languages = new ArrayList<String>();
     languages.add("PHP");
     languages.add("Java");
     languages.add("C++");
     languages.add("Python");
     System.out.println("Avant: "+languages);
     Collections.swap(languages, 0, 2); //permutation
     System.out.println("Aprés: "+languages);
   }
}