package GraphSessionOne;

public class BackTraking {

    public static void main (String[] args) {
        System.out.println("In the Name of Allah");
        BackTraking backTraking = new BackTraking();
        backTraking.foo(5);
    }

    int foo (int n) {
        if (n <= 1)
            return 1;
        for (int i = 0; i < 4; i++)
            foo(--n);
        System.out.print(n);
        return 0;
    }


}
