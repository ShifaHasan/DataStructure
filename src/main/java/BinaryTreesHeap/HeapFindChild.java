package BinaryTreesHeap;

public class HeapFindChild {

    public static void main(String[] args) {
        System.out.println("Hello Akhrat");
        Heap heap = BuildHeap.buildHeap();
        int childData = leftChild(heap,1);
        System.out.println(childData);
        int rightChild = rightChild(heap,1);
        System.out.println(rightChild);
    }


    public static int leftChild (Heap heap, int index) {
        if (index <= 0 || index >= heap.count)
            return -1;
        int indexOfLeftChild = index * 2+1;
        if(indexOfLeftChild<heap.count) {
            //int leftData = heap.heapArry[indexOfLeftChild];
            //return leftData;
            return  indexOfLeftChild;
        }else{return -1;}
    }

    public static int rightChild (Heap heap, int index) {
        if (index <= 0 || index >= heap.count)
            return -1;
        int indexOfrightChild = index * 2+2;
        if(indexOfrightChild<heap.count) {
            //int leftData = heap.heapArry[indexOfLeftChild];
            //return leftData;
            return indexOfrightChild;
        }else{return -1;}
    }
}
