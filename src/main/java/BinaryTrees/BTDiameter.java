package BinaryTrees;


public class BTDiameter {
    BTHeight btHeight;

    public static void main (String[] args) {

        System.out.println("Hello Akhrat");
        BTUtilBuilder btUtil = new BTUtilBuilder();
        BT bt = btUtil.createFullBT();
        BTDiameter btDiameter = new BTDiameter();
        btDiameter.btHeight = new BTHeight();
        int dia = btDiameter.findDiameter(bt);
        System.out.println(dia);
    }

    private int findDiameter (BT bt) {

        if (bt == null)
            return 0;
        int lh = btHeight.findHeightBT(bt.getLeft());
        int rh = btHeight.findHeightBT(bt.getRight());

        int heightOfRootNode = 1 + lh + rh;

        int ld = findDiameter(bt.getLeft());
        int rd = findDiameter(bt.getRight());

        int diameter = maxValue(ld, rd) + 1;

        int maxDiameter = maxValue(heightOfRootNode, diameter);
        return maxDiameter;
    }

    int maxValue (int ld, int rd) {
        if (ld > rd)
            return ld;
        else
            return rd;
    }
}
  /*                    A1

                B2              C3

           D4        E5      F6      G7
                                        I9
*/
