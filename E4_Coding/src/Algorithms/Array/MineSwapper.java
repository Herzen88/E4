package Algorithms.Array;

import java.util.Arrays;

public class MineSwapper {

    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[][] bombs1 = {{0, 2}, {2, 0}};
        mineSweeper(bombs1, 3, 3); //should return:
        // [[0, 1, -1],
        //  [1, 2, 1],
        //  [-1, 1, 0]]
        System.out.println();
        int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
        mineSweeper(bombs2, 3, 4); //should return:
        // [[-1, -1, 2, 1],
        //  [2, 3, -1, 1],
        //  [0, 1, 1, 1]]
        System.out.println();
        int[][] bombs3 = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
        mineSweeper(bombs3, 5, 5); //should return:
        // [[1, 2, 2, 1, 0],
        //  [1, -1, -1, 2, 0],
        //  [1, 3, -1, 2, 0],
        //  [0, 1, 2, 2, 1],
        //  [0, 0, 1, -1, 1]]
    }

    // Implement your solution below.
    public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
        int[][] field = new int[numRows][numCols];
        for (int i = 0; i < bombs.length; i++) {
            field[bombs[i][0]][bombs[i][1]] = -1;
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    if (j + 1 < field[i].length) if (field[i][j + 1] != -1) field[i][j + 1]++;
                    if (j - 1 >= 0) if (field[i][j - 1] != -1) field[i][j - 1]++;
                    if (i + 1 < field.length) if (field[i + 1][j] != -1) field[i + 1][j]++;
                    if (i + 1 < field.length && j + 1 < field[i].length)
                        if (field[i + 1][j + 1] != -1) field[i + 1][j + 1]++;
                    if (i + 1 < field.length && j - 1 >= 0) if (field[i + 1][j - 1] != -1) field[i + 1][j - 1]++;
                    if (i - 1 >= 0) if (field[i - 1][j] != -1) field[i - 1][j]++;
                    if (i - 1 >= 0 && j < field[i].length) if (field[i - 1][j + 1] != -1) field[i - 1][j + 1]++;
                    if (i - 1 >= 0 && j - 1 >= 0) if (field[i - 1][j - 1] != -1) field[i - 1][j - 1]++;
                }
            }
        }
        Arrays.stream(field).forEach(ar -> Arrays.stream(ar).forEach(System.out::print));

        return field;
    }
}

