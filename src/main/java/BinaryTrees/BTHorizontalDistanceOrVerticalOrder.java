package BinaryTrees;

import java.util.*;

public class BTHorizontalDistanceOrVerticalOrder {
    public static void main (String[] args) {
        System.out.println("Hello Akhrat");
        BTUtilBuilder btUtil = new BTUtilBuilder();
        BT bt = btUtil.createFullBT();
        BTHorizontalDistanceOrVerticalOrder btHorizentalDistance = new BTHorizontalDistanceOrVerticalOrder();
        Map<Integer, List<BT>> horizontalDistMap = new HashMap<Integer, List<BT>>();
        horizontalDistMap = btHorizentalDistance.horizontalDistance(bt, 0, horizontalDistMap);
        System.out.println(horizontalDistMap);
    }

    private Map<Integer, List<BT>> horizontalDistance (BT bt, int horizontalLenght, Map<Integer, List<BT>> horizontalDistMap) {

        if (bt == null)
            return horizontalDistMap;

        if (horizontalDistMap.containsKey(horizontalLenght)) {
            List<BT> listBT = horizontalDistMap.get(horizontalLenght);
            listBT.add(bt);
        } else {
            List<BT> listBt = new LinkedList<BT>();
            listBt.add(bt);
            horizontalDistMap.put(horizontalLenght, listBt);
        }
        horizontalDistance(bt.getLeft(), horizontalLenght - 1, horizontalDistMap);
        horizontalDistance(bt.getRight(), horizontalLenght + 1, horizontalDistMap);

        return horizontalDistMap;
    }
}

 /*                    A1

            B2              C3

      D4        E5      F6        G7
                                        I9

-(-2)-----(-1)--------0------+1---+2----+3---------------------------
  D4       B2     A1,E5,F6   C3   G7    I9  --vertical order

0=[BT{data='A', numData=1}, BT{data='E', numData=5}, BT{data='F', numData=6}],
-1=[BT{data='B', numData=2}],
-2=[BT{data='D', numData=4}],
1=[BT{data='C', numData=3}],
2=[BT{data='G', numData=7}],
3=[BT{data='I', numData=9}]}

all list contain in vertical order
sort and print list in order
*/
