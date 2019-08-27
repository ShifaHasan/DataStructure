package BinaryTreesHeap;

public class CreateHeap {
    static Heap heap = new Heap();

    public static void main (String[] args) {
        System.out.println("Hello Akhrat");

    }
    public static Heap buildHeap () {

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