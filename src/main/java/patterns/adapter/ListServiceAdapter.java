package patterns.adapter;

import java.util.Arrays;
import java.util.List;

public class ListServiceAdapter implements IArrayClient {

    private final ListService listService;

    public ListServiceAdapter(ListService listService) {
        this.listService = listService;
    }

    @Override
    public void processArray(int[] arr) {
        this.listService.processList(convertArrayToList(arr));
    }

    private List<Integer> convertArrayToList(int[] arr) {
        return Arrays
                .stream(arr)
                .boxed()
                .toList();
    }
}
