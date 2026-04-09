import java.util.*;

class UC7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(40, 10, 20);
        list.sort((a, b) -> a - b);
        System.out.println(list);
    }
}