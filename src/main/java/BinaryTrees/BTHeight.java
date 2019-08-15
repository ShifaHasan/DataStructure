package BinaryTrees;

public class BTHeight {

    public static void main (String[] args) {
        System.out.println("Hello Akhrat");
        BTUtilBuilder btUtil = new BTUtilBuilder();
        BT bt = btUtil.createFullBT();
        BTHeight btHeight =  new BTHeight();
        int height = btHeight.findHeightBT(bt);
        System.out.println(height);
    }

    public int findHeightBT (BT bt) {

        if(bt==null)
            return -1;

        int ls = findHeightBT (bt.getLeft());
        int hs = findHeightBT (bt.getRight());
        return max(ls, hs);
    }

    private int max (int ls, int hs) {
        if(ls > hs )
            return ls + 1;
        else
            return hs + 1;
    }

    public int findHeightOfTree2ndMethod (BT bt) { // //it seems like post order
        int ls = 0;
        int hs = 0;
        //it seems like post order
        if (bt.getLeft() == null && bt.getRight() == null) {
            return 0;
        }
        if (bt.getLeft() != null) {
            ls = findHeightOfTree2ndMethod(bt.getLeft());
        }
        if (bt.getRight() != null) {
            hs = findHeightOfTree2ndMethod(bt.getRight());
        }
        if (ls > hs)
            return ls + 1;
        else
            return hs + 1;
    }
}
  /*                    A1

                B2              C3

           D4        E5      F6      G7
                                        I9
*/
