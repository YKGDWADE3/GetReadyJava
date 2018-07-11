package TriangleExercises;

public class VerticalLine {
    public VerticalLine() {
    }

    public void drawVerticalLine(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.println("*");
            }
        } else {
            return;
        }
    }
}
