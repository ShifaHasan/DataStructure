public class Assingment2PracticeQuestion1 {

    public static void main (String[] args) {
        System.out.println("Akherat");
        Assingment2PracticeQuestion1 assingment2Practice = new Assingment2PracticeQuestion1();

        int arr[] = {10,3,5,6,2};
        // 10,30,150,900,1800

        assingment2Practice.multiPlicationExceptIndex(arr);

        int brr[]={1,3,0,2};
        assingment2Practice.swapValuesWithIndex(brr);
    }

    private void swapValuesWithIndex (int[] arr) {

        int tempValue = arr[arr[0]];
        for (int i=1; i<arr.length;i++){

        }

    }

    private void multiPlicationExceptIndex (int[] arr) {

        int multiple =1;
        for(int i=0;i< arr.length;i++)
            System.out.print(" "+arr[i]);

        System.out.println();

        for(int i=0;i< arr.length;i++)
            multiple = multiple*arr[i];

        //It is O(n) but by division
       /* for(int i=0;i< arr.length;i++)
             arr[i]= multiple/arr[i];*/

        int[] leftMul   =   new int[arr.length];
        int rightMul[]  =   new int[arr.length];

        int multipleOfLeft=1;

        leftMul[0]=1;

        for(int i=1;i< arr.length;i++){
            leftMul[i]=leftMul[i-1]*arr[i-1];
        }

        for(int i=0;i< arr.length;i++)
            System.out.print("    "+leftMul[i]);

        System.out.println();

        rightMul[arr.length-1]=  1;

        for(int j=arr.length -2 ; j>=0; j--)
            rightMul[j]=rightMul[j+1]*arr[j+1];

        for(int i=0;i< arr.length;i++)
            System.out.print("   "+rightMul[i]);


        for(int i=0;i<arr.length;i++)
            leftMul[i]=leftMul[i]*rightMul[i];

        System.out.println();

        for(int i=0;i< arr.length;i++)
            System.out.print("    "+leftMul[i]);

    }
}
