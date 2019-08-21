package BinaryTreesHeap;

public class CreateHeap {
    static Heap heap = new Heap();

    public static void main (String[] args) {
        System.out.println("Hello Akhrat");
        CreateHeap createHeap = new CreateHeap();
        Heap heap = buildHeap();
        int parentNodeData = createHeap.parent(heap,3);
        System.out.println(parentNodeData);
        int childData = createHeap.leftChild(heap,1);
        System.out.println(childData);
        int rightChild = createHeap.rightChild(heap,1);
        System.out.println(rightChild);
    }
    private static Heap buildHeap () {

        heap.heapType=0;    //min heap
        heap.heapArry[0]=1;
        heap.heapArry[1]=2;
        heap.heapArry[2]=3;
        heap.heapArry[3]=4;
        heap.heapArry[4]=5;
        heap.heapArry[5]=6;
        heap.heapArry[6]=7;
        heap.count=7;
        heap.capacity=heap.heapArry.length;
        return heap;
    }

    private int parent (Heap heap, int index) {
        if (index <= 0 || index >= heap.count)
            return -1;
        int indexOfParent = (index - 1) / 2;
        int data = heap.heapArry[indexOfParent];
        return data;
    }

    private int leftChild (Heap heap, int index) {
        if (index <= 0 || index >= heap.count)
            return -1;
        int indexOfLeftChild = index * 2+1;
        if(indexOfLeftChild<heap.count) {
            //int leftData = heap.heapArry[indexOfLeftChild];
            //return leftData;
            return  indexOfLeftChild;
        }else{return -1;}
    }

    private int rightChild (Heap heap, int index) {
        if (index <= 0 || index >= heap.count)
            return -1;
        int indexOfrightChild = index * 2+2;
        if(indexOfrightChild<heap.count) {
            //int leftData = heap.heapArry[indexOfLeftChild];
            //return leftData;
            return indexOfrightChild;
        }else{return -1;}
    }

    public int getMaxHeap (Heap heap) {
        if (heap == null)
            return -1;
        if (heap.count == 0)
            return -1;
        return heap.heapArry[0];
    }

    public int getMinHeap (Heap heap) {
        if (heap == null)
            return -1;
        if (heap.count == 0)
            return -1;
        return heap.heapArry[0];
    }

    public void percolateDown(Heap heap, int i){
        int max; int temp;
        int l = leftChild(heap,i);
        int r = rightChild(heap,i);
    }


    public Heap addNode (int data) {//assume data is as per heap

        if (heap.count == heap.capacity)
            //resizeHEap();
            heap.count++;
        int i = heap.capacity - 1;
        heap.heapArry[i] = data;
        return heap;
    }


}
/*
            1
    2               3
 4      5       6        7

*/