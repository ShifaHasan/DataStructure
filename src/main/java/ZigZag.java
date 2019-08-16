public class ZigZag {
    public static void main (String[] args) {
        System.out.println("Hello Akherat");

        int[] arr = {4, 3, 7, 8, 6, 2, 1};
        ZigZag zigZag = new ZigZag();
        zigZag.zizZag(arr);
    }

    private void zizZag (int[] arr) {

        //i/p {4, 3, 7, 8, 6, 2, 1};
        //o/p  3 7 4 8 2 6,1

        for (int i = 0; i < arr.length-1 ; i++) {
            if (i % 2 == 0) {
                if (arr[i] > arr[i + 1]) {
                    int x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;

                }
            }
            else {
                if (arr[i] < arr[i + 1]) {
                    int x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;

                }
            }
        }

        // o/p  3 7 4 8 2 6,1
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }
}
