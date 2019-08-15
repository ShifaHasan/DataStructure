package BinaryTrees;

public class BTMirrorQ {
    public static void main (String[] args) {
        System.out.println("Hello Akhrat");
        BTMirrorQ btMirrorQ = new BTMirrorQ();
        BTUtilBuilder btUtil = new BTUtilBuilder();
        BT bt = btUtil.createFullBT();
        btMirrorQ.preOrderTraversal(bt);

        //Q1
        btMirrorQ.mirrorTree(bt);
        System.out.println();
        btMirrorQ.preOrderTraversal(bt);
    }

    private void  mirrorTree (BT bt) {

        if (bt == null) {
            return;
        }
        mirrorTree(bt.getLeft());
        mirrorTree(bt.getRight());
        swapTwoNodes(bt,bt.getLeft(), bt.getRight());
    }

    private void swapTwoNodes (BT bt, BT left, BT right) {
        BT temp = left;
        bt.setLeft(right);
        bt.setRight(temp);
    }

    private void preOrderTraversal (BT bt) {

        if (bt == null)
            return;
        System.out.print(bt.getData());
        System.out.print(bt.getNumData());
        preOrderTraversal(bt.getLeft());
        preOrderTraversal(bt.getRight());

    }

 /*                    A1                           |/               A1
                                                    |/
                B2              C3                  |/          C3              B2
                                                    |/
           D4        E5      F6      G7             |/       G7        F6      E5      D4
                                        I9          |/  I9

*/
//mirroring
  /*                    A1

                C3              B2

           G7        F6      E5      D4

        I9

*/
}
