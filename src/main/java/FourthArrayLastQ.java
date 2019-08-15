public class FourthArrayLastQ {

    public static void main (String[] args) {
        FourthArrayLastQ fourthArrayLastQ = new FourthArrayLastQ();
        int[][] array = {{0, 0, 0, 0}, {0, 0, 1, 1}, {0, 1, 1, 1}, {0, 0, 1, 1}};//o/p 2
        int maxOnes = fourthArrayLastQ.findRowsOfMaxOnes(array);
        System.out.println("Total no. of one's "+maxOnes);
    }

    private int findRowsOfMaxOnes (int[][] array) {
        int col = array[0].length - 1;
        int rowsValue =0 ;
        for (int row = 0; row < array.length; row++) {
            while (col >= 0) {
                if (array[row][col] == 0) {
                    break;
                }else {
                    col--;
                    rowsValue = row;
                }
            }
        }
        System.out.println("row's number of max ones "+rowsValue);
        return array[0].length - (col + 1);
    }
}
