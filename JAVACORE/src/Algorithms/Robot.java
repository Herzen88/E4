package com.company.Algorithms;

public class Robot {
    static int x = 0;
    static int y = 0;
    static String moves;

    public static void main(String[] args) {
        moveRobot("RRLLUDUD");
        System.out.println("Robot made circle: " + isCricle());
    }

    static String moveRobot(String move) {
        return moves += move;
    }

    static boolean isCricle() {
        for (char mv : moves.toCharArray()) {
            if (String.valueOf(mv).contains("R")) x++;
            else if (String.valueOf(mv).contains("L")) x--;
            else if (String.valueOf(mv).contains("U")) y++;
            else if (String.valueOf(mv).contains("D")) y--;
        }
        return (x == 0 & y == 0);
    }
}
