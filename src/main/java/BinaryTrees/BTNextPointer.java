package BinaryTrees;

public class BTNextPointer {

    String data;
    Integer numData;
    BTNextPointer left;
    BTNextPointer right;
    BTNextPointer next;

    public String getData () {
        return data;
    }

    public void setData (String data) {
        this.data = data;
    }

    public BTNextPointer getLeft () {
        return left;
    }

    public void setLeft (BTNextPointer left) {
        this.left = left;
    }

    public BTNextPointer getRight () {
        return right;
    }

    public void setRight (BTNextPointer right) {
        this.right = right;
    }

    public Integer getNumData () {
        return numData;
    }

    public void setNumData (Integer numData) {
        this.numData = numData;
    }

    public BTNextPointer getNext () {
        return next;
    }

    public void setNext (BTNextPointer next) {
        this.next = next;
    }
}
