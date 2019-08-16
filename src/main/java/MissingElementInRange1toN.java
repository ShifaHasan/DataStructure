public class MissingElementInRange1toN {
    public static void main (String[] args) {

        MissingElementInRange1toN missingElementInRange1toN = new MissingElementInRange1toN();

        int[] arr={2,1,3,5,6};
        //missingElementInRange1toN.findMissingUsingSummation(arr);

        int[] brr={1,2,3,5,6}; //suppose array is sorted
       // missingElementInRange1toN.findMissingUsingSortingAndIndexMaching(brr);

       // missingElementInRange1toN.findMissingUsingAuxilaryArray(arr);

        missingElementInRange1toN.findMissingUsingXOR(arr);

    }

    private void findMissingUsingXOR (int[] arr) {

        int X = 0;
        int Y = 0;

        for (int i = 0; i < arr.length; i++)
            X = arr[i] ^ X;

        for (int j = 1; j <= arr.length + 1; j++)
            Y = j ^ Y;

        System.out.println(X ^ Y); //o/p 4

    }

    private void findMissingUsingSortingAndIndexMaching (int[] arr) {
        int i = 0;
        while (i < arr.length)
            if (i + 1 != arr[i])
                break;
            else
                i++;
        System.out.print(i + 1);//o/p 4

    }

    private void findMissingUsingAuxilaryArray (int[] arr) {

        int[] brr = new int[arr.length + 2];
        brr[0] = -1;

        for (int i = 0; i < arr.length; i++)
            brr[arr[i]] = 1;

        int index = 0;
        while (index < brr.length)
            if (brr[index] == 0)
                break;
            else
                index++;

        System.out.println(" " + index);//o/p 4
    }

    private void findMissingUsingSummation (int[] arr) {

        int sumOfIndex =0;
        for(int i=1;i<=arr.length+1;i++)
            sumOfIndex=sumOfIndex+i;

        int sumOfElements=0;
        for(int i=0;i<arr.length;i++)
            sumOfElements=sumOfElements+arr[i];


        int x =  sumOfIndex - sumOfElements;
        System.out.println(x);//o/p 4

    }
}
