package ru.job4j.condition;

public class ChessBoardLadya {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 == x2 || y1 == y2) {
            rsl = Math.abs(x1 - x2);
            rsl = rsl == 0 ? Math.abs(y1 - y2) : rsl;
        }
           return rsl;

    }
}
