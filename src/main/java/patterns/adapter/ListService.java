package patterns.adapter;

import java.util.List;

public class ListService {
    void processList(List<Integer> list) {
        list.forEach(e -> System.out.println("List Element " + e));
    }
}
