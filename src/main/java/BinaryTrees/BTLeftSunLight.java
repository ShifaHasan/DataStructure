package BinaryTrees;

public class BTLeftSunLight {
    static int  max=0;

    public static void main (String[] args) {
        BTTraversalRecursion btTraversal = new BTTraversalRecursion();
        BTUtilBuilder btUtil = new BTUtilBuilder();
        BT bt = btUtil.createFullBT();
        BTLeftSunLight btLeftSunLight = new BTLeftSunLight();
        btLeftSunLight.findOnlyLighNodeSection(bt,1);
    }

    private void findOnlyLighNodeSection (BT bt,int level) {

        if(bt==null)
            return;

        if(level>max){
            System.out.println(bt.getData());
            max=level;
        }
        findOnlyLighNodeSection(bt.getLeft(),level+1);
        findOnlyLighNodeSection(bt.getRight(),level+1);


    }

     /*                    A1

                B2              C3

           D4        E5      F6      G7
                                        I9
*/
}
