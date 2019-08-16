import java.util.HashSet;

public class FindPairElementsWhoseSumK {
    public static void main (String[] args) {

        FindPairElementsWhoseSumK findPairElements = new FindPairElementsWhoseSumK();
        int[] arr={2,9,6,3,1,10,4};

        int[] brr={1,2,3,4,6,9,10};
        int value=9;
       // findPairElements.usingSortingTravelLetRight(brr,value);
        //findPairElements.usingSortingTravelRecursion(brr,0,brr.length-1,value);

        findPairElements.usingHashMethod(arr,value);

    }

    private void usingHashMethod (int[] arr, int value) {

        HashSet hashVaue = new HashSet<Integer>();
        int i = 0;
        while (i < arr.length)
            if (!hashVaue.contains(value - arr[i])) {
                hashVaue.add(arr[i]);
                i++;
            } else
                break;

        System.out.println(+arr[i] + "," + (value - arr[i]));
    }

    private void usingSortingTravelLetRight (int[] arr,int value) {

        int i=0;int j=arr.length-1;
        while(i<arr.length && j>=0)

            if(arr[i]+arr[j] == value)
                break;
            else if (arr[i]+arr[j] > value)
                j--;
            else if (arr[i]+arr[j] < value)
                i++;

        System.out.println("Pair value "+arr[i] + ","+arr[j]);//1,6
    }
    private boolean usingSortingTravelRecursion (int[] arr,int i, int j , int value) {

            if(arr[i]+arr[j] == value) {
                System.out.println("Pair Value "+ arr[i]+","+arr[j]);
                return true;
            }
            else if (arr[i]+arr[j] > value)
                return usingSortingTravelRecursion (arr,i, --j , value);
            else if (arr[i]+arr[j] < value)
                return usingSortingTravelRecursion (arr,++i, j , value);
            else
                    return false;

    }
}
