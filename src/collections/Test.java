package collections;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(1000);
        List<String> list2 = new ArrayList<>();
        list.add("asd");
        list.add(1, "asdaaa");
        int size = list.size();
        String s = list.get(1);
        String s1 = list.get(9);
        boolean empty = list.isEmpty();

    }
}
