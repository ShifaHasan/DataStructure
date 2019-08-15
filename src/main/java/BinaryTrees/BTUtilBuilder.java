package BinaryTrees;

public class BTUtilBuilder {



    public BT createFullBT () {


        BT bt = new BT();
        bt.setData("A");
        bt.setNumData(1);

        BT leftl1 = new BT();
        leftl1.setData("B");
        leftl1.setNumData(2);
        bt.setLeft(leftl1);
        BT rightl1 = new BT();
        rightl1.setData("C");
        rightl1.setNumData(3);
        bt.setRight(rightl1);

        BT leftl2 = new BT();
        leftl2.setData("D");
        leftl2.setNumData(4);
        BT rightl2 = new BT();
        rightl2.setData("E");
        rightl2.setNumData(5);

        leftl1.setRight(rightl2);
        leftl1.setLeft(leftl2);


        BT leftl22 = new BT();
        leftl22.setData("F");
        leftl22.setNumData(6);
        BT rightl22 = new BT();
        rightl22.setData("G");
        rightl22.setNumData(7);

        rightl1.setLeft(leftl22);
        rightl1.setRight(rightl22);

        BT rightl223 = new BT();
        rightl223.setData("I");
        rightl223.setNumData(9);
        rightl22.setRight(rightl223);

        return bt;

    }

  /*                    A1

                B2              C3

           D4        E5      F6      G7

                                        I9
*/

}
