package BinaryTreesHeap;

public class HeapFindParent {


    public static void main(String[] args) {
        Heap heap = BuildHeap.buildHeap();
        int parentNodeData = parent(heap,3);
        System.out.println(parentNodeData);
    }

    private static int parent (Heap heap, int index) {
        if (index <= 0 || index >= heap.count)
            return -1;
        int indexOfParent = (index - 1) / 2;
        int data = heap.heapArry[indexOfParent];
        return data;
    }
}
