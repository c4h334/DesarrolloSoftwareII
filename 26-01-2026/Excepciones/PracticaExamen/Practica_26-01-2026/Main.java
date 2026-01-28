public class Main {
    public static void main(String[] args) {
        printMatrix(createFrameMatrix(8, 6));
        int[][] testMatrix = { { 2, 3, 4 }, { 5, 6, 9 }, { 2, 6, 8 } };
        System.out.println("Sum of the inverse diagonal elements: " + sumInverseDiagonal(testMatrix));
        findN(randomElementsMatrix(), 6);
    }

    static int[][] createFrameMatrix(int rows, int columns) {

        int[][] frameMatrix = new int[rows][columns];
        System.out.println("An 8x6 frame matrix: \n");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                frameMatrix[i][j] = (i == 0 || j == 0 || i == frameMatrix.length - 1 || j == frameMatrix[i].length - 1)
                        ? 1
                        : 0;
            }
        }
        return frameMatrix;
    }

    static int sumInverseDiagonal(int[][] matrix) {
        int result = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == matrix.length - 1) {
                    result += matrix[i][j];
                }
            }
        }

        return result;

    }

    static int[][] randomElementsMatrix() {
        int random[][] = new int[10][10];

        for (int i = 0; i < random.length; i++) {
            for (int j = 0; j < random[i].length; j++) {
                random[i][j] = (int) (10 * (Math.random()) + 1);
            }
        }

        return random;
    }

    static void findN(int[][] matrix, int n) {
        String positions = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (n == matrix[i][j]) {
                    positions += "[" + i + "," + j + "]\n";
                }
            }
        }
        printMatrix(matrix);
        System.out.println(positions);
    }

    static void printMatrix(int[][] matrix) {
        String matrixPrinted = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixPrinted += matrix[i][j] + "  ";
            }
            matrixPrinted += "\n";
        }

        System.out.println(matrixPrinted);
    }
}
