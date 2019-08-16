public class Assingment2PracticeQuestionMetrix {

    public static void main (String[] args) {

        System.out.println("Akherat");

        int[][] arr= new int[3][3];
        //using extra space
        int[][] brr= new int[3][3];

        arr[0][0] = 3;
        arr[0][1] = 7;
        arr[0][2] = 0;

        arr[1][0] = 2;
        arr[1][1] = 6;
        arr[1][2] = 1;

        arr[2][0] = 1;
        arr[2][1] = 5;
        arr[2][2] = 2;

        for (int i=0;i<arr.length;i++) {
            System.out.println();
            for (int j=0;j<arr.length;j++) {
                System.out.print(" "+arr[i][j]);
            }
        }

        //using extra space
        for (int i=0;i<arr.length;i++) {
            System.out.println();
            for (int j=0;j<arr.length;j++) {
               brr[j][i]=arr[i][arr.length-1-j];
            }
        }

        //without using extra space


    }
}
