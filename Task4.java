import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> names = List.of("sinonome", "aduma", "tokimori", "nisizono", "kitano");
        List<String> result = names.stream().filter(name -> name.contains("n")).toList();
        System.out.println(result);
    }
}
