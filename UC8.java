import java.util.*;

class UC8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 50, 30);
        list.stream().filter(x -> x > 20).forEach(System.out::println);
    }
}