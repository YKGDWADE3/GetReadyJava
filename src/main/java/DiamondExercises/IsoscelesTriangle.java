package DiamondExercises;

import TriangleExercises.HorizontalLine;

public class IsoscelesTriangle {
    public IsoscelesTriangle() {
    }

    public void draw(int n) {
        if (n > 0) {
            HorizontalLine horizontalLine = new HorizontalLine();
            Space space = new Space();
            for (int i = 1; i <= n; i++) {
                space.draw(n - i);
                horizontalLine.drawHorizontalLine(i * 2 - 1);
            }
        } else {
            return;
        }
    }
}
