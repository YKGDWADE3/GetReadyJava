package TriangleExercises;

public class HorizontalLine {
    public HorizontalLine() {
    }

    public void drawHorizontalLine(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println("\n");
        } else {
            return;
        }
    }
}
