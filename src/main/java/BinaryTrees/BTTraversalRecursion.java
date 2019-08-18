package BinaryTrees;

public class BTTraversalRecursion {


    public static void main (String[] args) {
        BTTraversalRecursion btTraversal = new BTTraversalRecursion();
        BTUtilBuilder btUtil = new BTUtilBuilder();
        BT bt = btUtil.createFullBT();
        btTraversal.inOrderTraversal(bt);
        System.out.println();

        //Q1
        btTraversal.preOrderTraversal(bt);
        System.out.println();

        //Q2
        btTraversal.postOrderTraversal(bt);
        System.out.println();

        //Q3 //count number of nodes
        int x = btTraversal.countNumberOfNodes(bt);
        System.out.println("No. of nodes " + x);

        //Q4
        int x2 = btTraversal.countNumberOfNodesUsingPreOrder(bt, 1);
        System.out.println("No. of nodeCount " + x2);

    }

    public void preOrderTraversal (BT bt) {

        if (bt == null)
            return;
        System.out.print(bt.getData());
        System.out.print(bt.getNumData());
        preOrderTraversal(bt.getLeft());
        preOrderTraversal(bt.getRight());

    }

    public void inOrderTraversal (BT bt) {

        if (bt == null)
            return;
        inOrderTraversal(bt.getLeft());
        System.out.print(" ");
        System.out.print(bt.getNumData());
        inOrderTraversal(bt.getRight());
    }

    public void postOrderTraversal (BT bt) {

        if (bt == null)
            return;
        postOrderTraversal(bt.getLeft());
        postOrderTraversal(bt.getRight());
        System.out.print(bt.getData());
    }

    public int countNumberOfNodes (BT bt) {

        if(bt.getLeft() ==null && bt.getRight() ==null )
            return 1;
        int x = countNumberOfNodes(bt.getLeft()) +  countNumberOfNodes(bt.getRight()) +1;
        return x;
        /*if (bt == null)//nishant method
            return 0;
        int x3 = countNumberOfNodes(bt.getLeft()) + countNumberOfNodes(bt.getRight()) + 1;
        return x3;*/
    }




    public int countNumberOfNodesUsingPreOrder (BT bt, int nodeCount) {

        if (bt.getLeft() == null && bt.getRight() == null) {
            return nodeCount;
        }
        if (bt.getLeft() != null) {
            nodeCount = countNumberOfNodesUsingPreOrder(bt.getLeft(), ++nodeCount);
        }
        if (bt.getRight() != null) {
            nodeCount = countNumberOfNodesUsingPreOrder(bt.getRight(), ++nodeCount);
        }
        return nodeCount;
    }
  /*                    A1

                B2              C3

           D4        E5      F6      G7
                                        I9
*/

}

