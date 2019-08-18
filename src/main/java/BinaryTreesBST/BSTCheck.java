package BinaryTreesBST;

import BinaryTrees.BT;
import BinaryTrees.BTTraversalRecursion;
import BinaryTrees.BTUtilBuilder;

public class BSTCheck {
    public static void main (String[] args) {
        BSTCheck bstCheck = new BSTCheck();
        BT td = BTUtilBuilder.createBST();
        BTTraversalRecursion btTraversalRecursion = new BTTraversalRecursion();
        btTraversalRecursion.inOrderTraversal(td);
        System.out.println();
        int isValidate = bstCheck.validateBST(td);
        /*if(isValidate==-999)return false;
        else
            return true;*/
        System.out.println(isValidate);
    }

    private int validateBST (BT td) {

        if (td.getLeft() == null && td.getRight() == null) {
            return td.getNumData();
        }
        if (td.getNumData() < td.getLeft().getNumData()) {
            return -99;
        }
        if (td.getLeft() != null && td.getNumData() > td.getLeft().getNumData()) {
            int x = validateBST(td.getLeft());
            if (x > td.getNumData()) {
                return -999;
            }
            return td.getNumData();
        }
        if (td.getNumData() > td.getRight().getNumData()) {
            return -99;
        }
        if (td.getRight() != null && td.getNumData() < td.getRight().getNumData()) {
            int y = validateBST(td.getRight());
            if (y < td.getNumData()) {
                return -99;
            }
            return y;
        }
        return -999;

    }

}
/*                    A200

                B100             C300

           D50       E150     F250      G350

                                              I400
*/

