package Matrices.Practica;

public class Main {

    public static void main(String[] args) {
        int[][] squareMatrix = {{1, 2, 3}, {6, 6, 6}, {7, 8, 9}};
        printRow(squareMatrix, 1);
        printColumn(squareMatrix, 0);
        sumDiagonal(squareMatrix);
        printInverseDiagonal(squareMatrix);
        sameRowValues(squareMatrix, 0);
        printMatrix(createFrameMatrix());
        printMatrix(identityMatrix());
        // hundredRandomNumbers(6);
        fourCorners();
    }

    static void printRow(int[][] matrix, int row) {
        String rowValues = " ";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == row) {
                    rowValues += matrix[i][j] + " ";

                }
            }

        }
        System.out.println("Row " + row + ": " + rowValues);
    }

    static void printColumn(int[][] matrix, int column) {
        String columnValues = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == column) {
                    columnValues += matrix[i][j] + "";
                }
            }
            columnValues += "\n";
        }
        System.out.println("Column " + column + ":\n" + columnValues);
    }

    static void sumDiagonal(int[][] matrix) {
        int diagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    diagonalSum += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal values: " + diagonalSum);
    }

    static void printInverseDiagonal(int[][] matrix) {
        int inverseDiagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == matrix.length - 1) {
                    inverseDiagonalSum += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of inverse diagonal values: " + inverseDiagonalSum);
    }

    static void sameRowValues(int[][] matrix, int row) {
        boolean same = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[row][j] == matrix[row][j + 1] && j < matrix[row].length - 1) {
                    same = true;
                }
            }
        }
        System.out.println("Does the row " + row + " have the same values? (True/False):\n" + same);
    }

    static int[][] createFrameMatrix() {

        int[][] frameMatrix = new int[8][6];

        for (int i = 0; i < frameMatrix.length; i++) {
            for (int j = 0; j < frameMatrix[i].length; j++) {
                if (i == 0 || j == 0 || i == frameMatrix.length - 1 || j == frameMatrix[i].length - 1) {
                    frameMatrix[i][j] = 1;
                } else {
                    frameMatrix[i][j] = 0;
                }
            }
        }

        return frameMatrix;
    }

    static void printMatrix(int[][] matrix) {
        String matrixString = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixString += matrix[i][j] + "";
            }
            matrixString += "\n";
        }

        System.out.println(matrixString);
    }

    static int[][] identityMatrix() {
        int[][] identity = new int[7][7];
        for (int i = 0; i < identity.length; i++) {
            for (int j = 0; j < identity[i].length; j++) {
                if (i == j) {
                    identity[i][j] = 1;
                } else {
                    identity[i][j] = 0;
                }
            }
        }
        return identity;
    }

    static void hundredRandomNumbers(int n) {
        int[][] matrix = new int[100][100];
        String positions = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (1 + Math.random() * 10);

                if (n == matrix[i][j]) {
                    positions += "[" + i + "," + j + "]\n";
                }
            }
            positions += "\n";
        }

        System.out.println("The positions in which " + n + " is included in the matrix are:\n" + positions);
    }

    static void fourCorners() {
        int[][] matrix = new int[5][5];
        matrix[0][0] = 5;
        matrix[0][4] = 6;
        matrix[4][0] = 9;
        matrix[4][4] = 5;

        int cornersSum = 0;
        int highestValue = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (i == 0 && j == 0) {
                    cornersSum += matrix[i][j];
                } else if (i == 0 && j == matrix[i].length) {
                    cornersSum += matrix[i][j];
                } else if (j == 0 && i == matrix.length) {
                    cornersSum += matrix[i][j];
                } else if (i == matrix.length && j == matrix[i].length) {
                    cornersSum += matrix[i][j];
                }

                if (i + 1 < matrix.length && j + 1 < matrix[i].length && matrix[i][j] > matrix[i + 1][j + 1]) {
                    highestValue = matrix[i][j];
                }

            }
        }

        System.out.println("The sum of the matrix's corners equals " + cornersSum + "\nand its highest value is " + highestValue);
    }

}
