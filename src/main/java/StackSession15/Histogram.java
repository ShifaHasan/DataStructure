package StackSession15;

public class Histogram {

    int[] a = new int[]{6,2,5,4,5,1,6};// o/p 6,10,5,12,5,7,6
    Stack stack = new Stack();

    int[] getRectangularArea() {
        int[] rectangleArea = new int[a.length];
        for (int i = 0; i < a.length; ) {
            if (stack.isEmpty() || a[i] > a[stack.getStackTop()]) {
                stack.push(i);
                i++;
            } else {
                popUpLargerAndCalculateAreaInArray(i,rectangleArea);
                while (!stack.isEmpty() && a[i] < a[stack.getStackTop()]) {
                    popUpLargerAndCalculateAreaInArray(i, rectangleArea);
                }
                stack.push(i);
                i++;

            }
        }
        while(!stack.isEmpty()){
            restAllElementsPopup(rectangleArea);
        }

        return rectangleArea;
    }

    private void popUpLargerAndCalculateAreaInArray (int incomingIndex , int[] areaArray) {
        int popSmaller;
        int areaForPopedUpHeight;
        popSmaller = stack.pop();
        int height = a[popSmaller];
        areaForPopedUpHeight = (incomingIndex - stack.getStackTop() -1 )*height;
        areaArray[popSmaller] = areaForPopedUpHeight;
    }

    private void restAllElementsPopup (int[] areaArray) {
        int popedIndex;
        int areaForPopedUpHeight;
        popedIndex = stack.pop();
        int height = a[popedIndex];
        areaForPopedUpHeight = (areaArray.length - stack.getStackTop()-1)*height;
        areaArray[popedIndex] = areaForPopedUpHeight;
    }

    public static void main (String[] args) {
        Histogram histogram = new Histogram();
        int[] anwer = histogram.getRectangularArea();
        for (int i=0;i<histogram.a.length;i++){
            System.out.print(" "+histogram.a[i]+" ");
        }
        System.out.println("");
        for (int i=0;i<anwer.length;i++){
            System.out.print(" "+anwer[i]+"  ");
        }

    }

}
