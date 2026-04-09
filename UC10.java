import java.util.*;

class UC10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30);
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}