public class Assingment2PracticeQuestionIndexSwap {

    public static void main (String[] args) {
        int[] arr ={1,3,0,2};
        swapIndex(arr);
    }

    private static void swapIndex (int[] arr) {
        int[] brr=new int[arr.length];

        for (int i=0;i<arr.length;i++)
            brr[i]=0;

        for (int i=0;i<arr.length;i++){
           int x = arr[i];
           brr[x]=i;
        }

        for (int i=0;i<arr.length;i++)
            System.out.printf(""+brr[i]);


    }
}
