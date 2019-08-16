public class ArraysTest {

    public static void main (String[] args) {

        ArraysTest test = new ArraysTest();
        int arr[]={2,3,4,5,6};//6,8,15,24,30
        int[] brr = test.reArrangeByMultiplication(arr);
        for(int j=0;j<arr.length; j++){
            System.out.print(" "+brr[j]);
        }


        int n= 6; //false, 64 true
        boolean isPowserOf2 = test.isPowerOf2Exist(n);
        System.out.println(isPowserOf2);

         int a[]={16,17,4,3,5,2};//16,17,4,3,5,2
        a = test.reArrangeByGreatestOnRight(a);


    }


    private int[] reArrangeByMultiplication (int[] arr) {
        int temp = arr[0];
        arr[0] = arr[0]*arr[1];
        for (int i = 1; i < arr.length-1; i++) {
            int currTemp = arr[i];
            arr[i] = temp*arr[i+1];
            temp = currTemp;

        }
        arr[arr.length-1] = arr[arr.length-1]*temp;
        return arr;
    }

    private boolean isPowerOf2Exist (int n) {
        if(n==1)
            return true;
        if(n%2==0)
            return  isPowerOf2Exist(n/2);
        else
            return false;
    }

    private int[] reArrangeByGreatestOnRight (int[] arr) {

        int maxValue = arr[arr.length - 1];
        if (arr[arr.length - 2] > arr[arr.length - 1])
            maxValue = arr[arr.length - 2];
        arr[arr.length - 2] = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 3; i >= 0; i--) {
            int temp= arr[i];
            arr[i] = maxValue;
            if (temp > maxValue)
                maxValue = temp;
        }
        return arr;
    }



}
