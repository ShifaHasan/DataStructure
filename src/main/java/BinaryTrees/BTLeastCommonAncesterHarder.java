package BinaryTrees;

public class BTLeastCommonAncesterHarder {

    public static void main (String[] args) {
        System.out.println("Hello Akhrat");
        BTUtilBuilder btUtil = new BTUtilBuilder();
        BT bt = btUtil.createFullBT();
        BTLeastCommonAncesterHarder btLeastCommonAncester = new BTLeastCommonAncesterHarder();
        int immediateParent = btLeastCommonAncester.leastCommonAncestor(bt, 2, 3, -1, -1);
        System.out.println(immediateParent);
    }

    private int leastCommonAncestor (BT bt, int data1, int data2, int ls, int rs) { ////initial ls and rs as -1,-1

        if (bt == null)
            return -1;

        if (bt.getNumData() == data1) {
            ls = bt.getNumData();
            return ls;
        }

        if (bt.getNumData() == data2) {
            rs = bt.getNumData();
            return rs;
        }

        ls = leastCommonAncestor(bt.getLeft(), data1, data2, ls, rs);
        rs = leastCommonAncestor(bt.getRight(), data1, data2, ls, rs);

        if(ls == data1 && rs == -1) //left node found
            return ls;

        if(ls == -1 && rs == data2) //right node found
            return rs;

        if(ls ==data1 && rs == data2)//we found parent node, so pass it to upper node
            return bt.getNumData();

        if(ls != -1) //we've already found and passed it to parent node that's why it doesn't match with data , and we simply pass its value to upper parent node
            return ls;

        if(rs != -1) //we've already found and passed it to parent node that's why it doesn't match with data , and we simply pass its value to upper parent node
            return rs;

        return -1;
    }
}

/*                    A1                           
                                                   
                B2              C3                 
                                                   
           D4        E5      F6      G7            
                                        I9        

*/ 