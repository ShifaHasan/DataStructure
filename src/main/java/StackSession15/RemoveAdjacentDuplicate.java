package StackSession15;

public class RemoveAdjacentDuplicate {

    int[] a = new int[]{5,1, 2,2,1};//input
    Stack stack = new Stack();

    void removeAllAdjacentDuplciate () {
        boolean isAdjecentDuplicateExist = false;
        for (int i = 0; i < a.length; i++) {
            if (stack.isEmpty() || stack.getStackTop() != a[i]) {
                if (isAdjecentDuplicateExist) {
                    stack.pop();
                    if (stack.isEmpty()) {
                        stack.push(a[i]);
                    } else if (!stack.isEmpty() && stack.getStackTop() != a[i]) {
                        stack.push(a[i]);
                        isAdjecentDuplicateExist = false;
                    } else if ((i == a.length - 1) && stack.getStackTop() == a[i]) {
                        stack.pop();
                    }
                } else {
                    stack.push(a[i]);
                }
            } else {
                isAdjecentDuplicateExist = true;
            }
        }
    }

    public static void main (String[] args) {
        RemoveAdjacentDuplicate removeAdjacentDuplicate = new RemoveAdjacentDuplicate();
        removeAdjacentDuplicate.removeAllAdjacentDuplciate();
        while (!removeAdjacentDuplicate.stack.isEmpty()) {
            System.out.print(removeAdjacentDuplicate.stack.pop());
        }
    }

}
