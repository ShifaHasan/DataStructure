package StackSession15;

public class SpanBuilding {

    int[] a = new int[]{10,4,5,90,120,80};//input
    Stack stack = new Stack();

    int[] geSpan () {
       int[] spanArray = new int[a.length];
        for (int i = 0; i < a.length; ) {
            if (stack.isEmpty() || a[i] < a[stack.getStackTop()]) { //push Taller Tower
                stack.push(i);
                i++;
            } else { //pop up smaller tower
                popUpSmallerAndSetSpanArray(spanArray);
                while (!stack.isEmpty() && a[i] > a[stack.getStackTop()]) {//pop all smallTower
                    popUpSmallerAndSetSpanArray(spanArray);
                }
                stack.push(i);
                i++;
            }
        }
        while (!stack.isEmpty()) {
            popUpSmallerAndSetSpanArray(spanArray);
        }
        return spanArray;
    }

    private void popUpSmallerAndSetSpanArray (int[] spanArray) {
        int popSmaller;
        int spanValueForPopedUpTower;
        popSmaller = stack.pop();
        spanValueForPopedUpTower = popSmaller - stack.getStackTop();
        spanArray[popSmaller] = spanValueForPopedUpTower;
    }

    public static void main (String[] args) {
        SpanBuilding spanBuilding = new SpanBuilding();
        int[] anwer = spanBuilding.geSpan();
        for (int i=0;i<spanBuilding.a.length;i++){
            System.out.print(" "+spanBuilding.a[i]+" ");
        }
        System.out.println("");
        for (int i=0;i<anwer.length;i++){
            System.out.print(" "+anwer[i]+"  ");
        }

    }


}
