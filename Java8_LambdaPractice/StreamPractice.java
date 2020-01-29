import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        printSeparateLine(0);
        List<String> ls = new ArrayList<String>();
        for (int i = 1; i <= 5; i++) {
            ls.add(String.valueOf(i));
        }
        ls.stream().filter(S -> Integer.valueOf(S) < 3).forEach(S -> System.out.println(S));

        printSeparateLine(1);
        List<String> ls2 = ls.stream().filter(S -> Integer.valueOf(S) < 3).collect(Collectors.toList());
        ls2.add("7");
        ls2.forEach(S -> System.out.println(S));

        printSeparateLine(2);
        System.out.println(ls.stream().mapToInt(S -> Integer.valueOf(S)).sum());

        printSeparateLine(3);
        System.out.println(ls.stream().filter((S -> Integer.valueOf(S) < 3)).mapToInt(S -> Integer.valueOf(S)).average()
                .getAsDouble());
    }

    public static void printSeparateLine(int i) {
        System.out.println("\n========= " + i + " =========");
    }
}