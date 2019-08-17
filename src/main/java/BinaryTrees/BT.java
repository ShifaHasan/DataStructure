package BinaryTrees;

import java.util.List;
import java.util.Map;

public class BT {

    String data;
    Integer numData;
    BT left;
    BT right;
    int level;
    public String getData () {
        return data;
    }

    public void setData (String data) {
        this.data = data;
    }

    public BT getLeft () {
        return left;
    }

    public void setLeft (BT left) {
        this.left = left;
    }

    public BT getRight () {
        return right;
    }

    public void setRight (BT right) {
        this.right = right;
    }

    public Integer getNumData () {
        return numData;
    }

    public void setNumData (Integer numData) {
        this.numData = numData;
    }


    public int getLevel () {
        return level;
    }

    public void setLevel (int level) {
        this.level = level;
    }

    @Override
    public String toString () {
        return "BT{" +
                "data='" + data + '\'' +
                ", numData=" + numData +
                '}';
    }
}
