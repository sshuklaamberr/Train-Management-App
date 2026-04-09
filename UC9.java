import java.util.*;
import java.util.stream.*;

class UC9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AC", "SL", "AC");
        System.out.println(
            list.stream().collect(Collectors.groupingBy(x -> x))
        );
    }
}