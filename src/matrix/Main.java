package matrix;

public class Main {
    public static void main(String[] args) {
        int[][] M = new int[][]{
                {1,0,0,0,0,0,0,0},
                {0,1,0,0,0,0,0,0},
                {0,1,20,300,0,0,0,0},
                {1,10,100,1000,0,0,0,0},
                {0,0,0,0,1,0,0,0},
                {0,0,0,0,0,1,0,0},
                {0,0,0,0,0,1,20,300},
                {0,0,0,0,1,10,100,1000}
        };
/*        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }*/
        int[][] inverseM = new int[8][8];

    }
    public static double DeterminantOfAMatrix(int[][] M, int n) {
        double determinantOfM = 0;
        if (n == 0) {

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //determinantOfM += Math.pow(-1, i + j) * M[i][j]*
            }
        }
        return determinantOfM;
    }
    public static int[][] MinorOfAMatrix(int[][] M) {
        int[][] MinorOfM = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                //MinorOfM[i][j] =
            }
        }
        return MinorOfM;
    }
    public static double[][] CofactorOfAMatrix(int[][] M) {
        double[][] CofactorOfM = new double[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                CofactorOfM[i][j] = Math.pow(-1, i + j) * M[i][j];
            }
        }
        return CofactorOfM;
    }
    public static int[][] TransposeOfAMatrix(int[][] M) {
        int[][] TransposeOfM = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                TransposeOfM[i][j] = M[j][i];
            }
        }
        return TransposeOfM;
    }

}
