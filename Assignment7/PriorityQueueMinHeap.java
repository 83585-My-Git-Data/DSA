import java.util.ArrayList;

class PriorityQueueMinHeap {
    private ArrayList<Integer> heap;

    public PriorityQueueMinHeap() {
        heap = new ArrayList<>();
    }

    public void add(int value) {
        heap.add(value);
        int current = heap.size() - 1;

        while (current > 0) {
            int parent = (current - 1) / 2;
            if (heap.get(current) >= heap.get(parent)) {
                break;
            }
            swap(current, parent);
            current = parent;
        }
    }

    public int poll() {
        if (heap.size() == 0) {
            throw new IllegalStateException("Heap is empty");
        }

        int rootValue = heap.get(0);
        int lastValue = heap.remove(heap.size() - 1);

        if (heap.size() == 0) {
            return rootValue;
        }

        heap.set(0, lastValue);
        int current = 0;

        while (true) {
            int leftChild = 2 * current + 1;
            int rightChild = 2 * current + 2;
            int smallest = current;

            if (leftChild < heap.size() && heap.get(leftChild) < heap.get(smallest)) {
                smallest = leftChild;
            }

            if (rightChild < heap.size() && heap.get(rightChild) < heap.get(smallest)) {
                smallest = rightChild;
            }

            if (smallest == current) {
                break;
            }

            swap(current, smallest);
            current = smallest;
        }

        return rootValue;
    }

    public int peek() {
        if (heap.size() == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap.get(0);
    }

    public int size() {
        return heap.size();
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public static void main(String[] args) {
        PriorityQueueMinHeap pq = new PriorityQueueMinHeap();
        pq.add(10);
        pq.add(15);
        pq.add(20);
        pq.add(17);
        System.out.println("Top element (peek): " + pq.peek());
        System.out.println("Removed element (poll): " + pq.poll());
        System.out.println("Top element after poll (peek): " + pq.peek());
    }
}
