package patterns.adapter;

public class ArrayClient {

    public static void main(String[] args) {
        ListService listService = new ListService();
        IArrayClient client = new ListServiceAdapter(listService);

        int[] arr = new int[] {1, 2, 3, 4, 5};

        client.processArray(arr);
    }


}
