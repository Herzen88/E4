package Arrays;

import java.util.Arrays;

public class Mines {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
//        int[][] bombs1 = {{0, 2}, {2, 0}};
//        mineSweeper(bombs1, 3, 3); //should return:
        // [[0, 1, -1],
        //  [1, 2, 1],
        //  [-1, 1, 0]]

//        int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
//         mineSweeper(bombs2, 3, 4);// should return:
        // [[-1, -1, 2, 1],
        //  [2, 3, -1, 1],
        //  [0, 1, 1, 1]]

        int[][] bombs3 = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
        mineSweeper(bombs3, 5, 5);// should return:
        // [[1, 2, 2, 1, 0],
        //  [1, -1, -1, 2, 0],
        //  [1, 3, -1, 2, 0],
        //  [0, 1, 2, 2, 1],
        //  [0, 0, 1, -1, 1]]
    }

    // Implement your solution below.
    public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
        int[][] field = new int[numRows][numCols];
        return setNumbers(setMines(field, bombs));
    }

    private static int[][] setMines(int[][] field, int[][] bombs) {
        for (int i = 0; i < bombs.length; i++) {
            field[bombs[i][0]][bombs[i][1]] = -1;
        }
        return field;
    }

    private static int[][] setNumbers(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {

                    if (j == field[i].length - 1) {
                        if (i == 0) {
                            if (field[i][j - 1] != -1) field[i][j - 1]++;
                            if (field[i + 1][j - 1] != -1) field[i + 1][j - 1]++;
                            if (field[i + 1][j] != -1) field[i + 1][j]++;
                        } else if (i == field[i].length - 1) {
                            if (field[i][j - 1] != -1) field[i][j - 1]++;
                            if (field[i - 1][j - 1] != -1) field[i - 1][j - 1]++;
                            if (field[i - 1][j] != -1) field[i - 1][j]++;
                        } else {
                            field[i][j - 1]++;
                            if (field[i + 1][j - 1] != -1) field[i + 1][j - 1]++;
                            if (field[i - 1][j - 1] != -1) field[i - 1][j - 1]++;
                            if (field[i + 1][j] != -1) field[i + 1][j]++;
                            if (field[i - 1][j] != -1) field[i - 1][j]++;
                        }
                    } else if (j == 0) {
                        if (i == 0) {
                            if (field[i][j + 1] != -1) field[i][j + 1]++;
                            if (field[i + 1][j] != -1) field[i + 1][j]++;
                            if (field[i + 1][j + 1] != -1) field[i + 1][j + 1]++;
                        } else if (i == field[i].length - 1) {
                            if (field[i][j + 1] != -1) field[i][j + 1]++;
                            if (field[i - 1][j] != -1) field[i - 1][j]++;
                            if (field[i - 1][j + 1] != -1) field[i - 1][j + 1]++;
                        } else {
                            if (field[i][j + 1] != -1) field[i][j + 1]++;
                            if (field[i + 1][j + 1] != -1) field[i + 1][j + 1]++;
                            if (field[i - 1][j + 1] != -1) field[i - 1][j + 1]++;
                            if (field[i + 1][j] != -1) field[i + 1][j]++;
                            if (field[i - 1][j] != -1) field[i - 1][j]++;

                        }
                    } else {
                        if (i == 0) {
                            if (field[i][j - 1] != -1) field[i][j - 1]++;
                            if (field[i][j + 1] != -1) field[i][j + 1]++;
                            if (field[i + 1][j - 1] != -1) field[i + 1][j - 1]++;
                            if (field[i + 1][j + 1] != -1) field[i + 1][j + 1]++;
                            if (field[i + 1][j] != -1) field[i + 1][j]++;


                        } else if (i == field[i].length - 1) {
                            if (field[i][j - 1] != -1) field[i][j - 1]++;
                            if (field[i][j + 1] != -1) field[i][j + 1]++;
                            if (field[i - 1][j - 1] != -1) field[i - 1][j - 1]++;
                            if (field[i - 1][j + 1] != -1) field[i - 1][j + 1]++;
                            if (field[i - 1][j] != -1) field[i - 1][j]++;
                        } else {
                            if (field[i][j - 1] != -1) field[i][j - 1]++;
                            if (field[i][j + 1] != -1) field[i][j + 1]++;
                            if (field[i + 1][j - 1] != -1) field[i + 1][j - 1]++;
                            if (field[i + 1][j + 1] != -1) field[i + 1][j + 1]++;
                            if (field[i + 1][j] != -1) field[i + 1][j]++;
                            if (field[i - 1][j - 1] != -1) field[i - 1][j - 1]++;
                            if (field[i - 1][j + 1] != -1) field[i - 1][j + 1]++;
                            if (field[i - 1][j] != -1) field[i - 1][j]++;
                        }
                    }
                }
            }
        }

        Arrays.stream(field).forEach(array -> Arrays.stream(array).forEach(System.out::print));
        return field;
    }
}
