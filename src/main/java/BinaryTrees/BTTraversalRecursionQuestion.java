package BinaryTrees;

public class BTTraversalRecursionQuestion {


    public static void main (String[] args) {
        System.out.println("Hello Akhrat");
        BTTraversalRecursionQuestion btTraversalQuestion = new BTTraversalRecursionQuestion();
        BTUtilBuilder btUtil = new BTUtilBuilder();
        BT bt = btUtil.createFullBT();

        //Q1
        //int maxValue = btTraversalQuestion.maxValueNodesInBTUsingProOrder(bt, 0);
        //System.out.println();
        //System.out.println("Node Of max Value  " + maxValue);

        //Q2
        //int sumOfAllNodes = sumOfAllNodesUsingPostOrder(bt);
        //System.out.println(sumOfAllNodes);

        //int sumOfPreOrder = sumOfAllNodesUsingPreOrder(bt, bt.getNumData());
        //System.out.println(sumOfPreOrder);

        //Q3
        //int maxRightNodes = btTraversalQuestion.maxAmongAllRightNodes(bt, 0);
        //System.out.println(maxRightNodes);

        //Q4
        //int levlOfNodes = btTraversalQuestion.findLevelOfGivenNodeUsingRecursion(bt, 0, 7);
        //System.out.println(levlOfNodes);

        int x = btTraversalQuestion.searchNode (bt,4);
        System.out.println(x);
    }

    private int findLevelOfGivenNodeUsingRecursion (BT bt, int level, int data) {

        if (bt.getLeft() == null && bt.getRight() == null && bt.getNumData() != data) {
            return -1;
        }
        if (bt.getNumData() == data) {
            return level;
        }
        if (bt.getLeft() != null) {
            int x = findLevelOfGivenNodeUsingRecursion(bt.getLeft(), level + 1, data);
            if (x != -1)
                return x;
        }
        if (bt.getRight() != null) {
            int y = findLevelOfGivenNodeUsingRecursion(bt.getRight(), level + 1, data);
            if (y != -1)
                return y;
        }
        return -1;
    }
    //Find maximum among all right nodes in Binary Tree
    private int maxValueNodesInBTUsingProOrder (BT bt, int max) {

        if (bt.getLeft() == null && bt.getRight() == null) {
            if (bt.getNumData() > max)
                max = bt.getNumData();
            return max;
        }

        if (bt.getNumData() > max)
            max = bt.getNumData();
        if (bt.getLeft() != null) {
            max = maxValueNodesInBTUsingProOrder(bt.getLeft(), max);
        }
        if (bt.getRight() != null) {
            max = maxValueNodesInBTUsingProOrder(bt.getRight(), max);
        }
        return max;
    }
    //Find maximum among all right nodes in Binary Tree
    private int maxAmongAllRightNodes (BT bt, int maxRight) {
        if (bt.getLeft() == null && bt.getRight() == null) {
            return maxRight;
        }
        if (bt.getLeft() != null) {
            maxRight = maxAmongAllRightNodes(bt.getLeft(), maxRight);
        }
        if (bt.getRight() != null) {
            if (bt.getRight().getNumData() > maxRight)
                maxRight = bt.getRight().getNumData();
            maxRight = maxAmongAllRightNodes(bt.getRight(), maxRight);
        }
        return maxRight;
    }

    //Find sum of all nodes of the given perfect binary tree
    private static int sumOfAllNodesUsingPreOrder (BT bt, int sum) {
        if (bt.getLeft() == null && bt.getRight() == null) {
            return sum;
        }
        if (bt.getLeft() != null) {
            sum = sumOfAllNodesUsingPreOrder(bt.getLeft(), sum + bt.getLeft().getNumData());
        }
        if (bt.getRight() != null) {
            sum = sumOfAllNodesUsingPreOrder(bt.getRight(), sum + bt.getRight().getNumData());
        }
        return sum;
    }

    private static int sumOfAllNodesUsingPostOrder (BT bt) {


        /*if (bt.getLeft() == null && bt.getRight() == null) {
            return bt.getNumData();
        }*/
        if (bt == null)
            return -1;
        int x = sumOfAllNodesUsingPostOrder(bt.getLeft()) + sumOfAllNodesUsingPostOrder(bt.getRight()) + bt.getNumData();
        return x;

    }

    private int searchNode (BT bt, int data) {
        if (bt == null)
            return -1;
        if (bt.getNumData() == data)
            return bt.getNumData();
        else {
            int x = searchNode(bt.getLeft(), data);
            if(x!=data ){
            searchNode(bt.getRight(), data);
            }else
                return x;
        }
        return -1;
    }
}

  /*                    A1

                B2              C3

           D4        E5      F6      G7
                                        I9
*/
