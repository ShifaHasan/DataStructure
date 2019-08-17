package BinaryTrees;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BTTopView {
    public static void main (String[] args) {
        System.out.println("Hello Akhrat");
        BTUtilBuilder btUtil = new BTUtilBuilder();
        BT bt = btUtil.createFullBT();
        BTTopView btTopView = new BTTopView();
        Map<Integer,BT> topViewMap = new HashMap<Integer,BT>();
        topViewMap = btTopView.topView(bt,topViewMap,0,0);
        System.out.println(topViewMap);
        Set<Map.Entry<Integer, BT>> mappings =  topViewMap.entrySet();
        for(Map.Entry<Integer, BT>  mapping : mappings) {
            System.out.println(mapping.getValue().getData());
        }
    }

    private Map<Integer, BT> topView (BT bt, Map<Integer, BT> topViewMap, int horizentalDis, int level) {
        if (bt == null)
            return topViewMap;

        if (topViewMap.containsKey(horizentalDis)) {
            BT node = topViewMap.get(horizentalDis);
            int levelOfPreviousNode = node.getLevel();
            if(level < levelOfPreviousNode) {
                topViewMap.put(horizentalDis,bt);
            }
        } else {
            bt.setLevel(level);
            topViewMap.put(horizentalDis, bt);
        }
        topView(bt.getLeft(), topViewMap,horizentalDis - 1, level+1);
        topView(bt.getRight(), topViewMap,horizentalDis + 1, level+1);
        return topViewMap;


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
