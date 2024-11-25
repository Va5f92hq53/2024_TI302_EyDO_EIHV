package tema2.estructuraLineal;

public class ArrayQueueTest {

    public static void main(String[] args) {
        ArrayQueues h = new ArrayQueues<>();
        Queue<Integer> S = new ArrayQueues<>();
        h.enqueue(S);
        h.enqueue(3);
        h.size();
        h.deduque();
        h.isEmpty();
    }
}
