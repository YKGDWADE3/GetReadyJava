package DiamondExercises;

import TriangleExercises.HorizontalLine;

public class Diamond {
    public Diamond() {
    }

    public void draw(int n) {
        if (n > 0) {
            IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
            isoscelesTriangle.draw(n);
            for (int i = n -1; i > 0; i--) {
               drawAsteriskAndSpace(n, i);
            }
        }
        return;
    }

    public void drawAsteriskAndSpace(int n, int rowNumber) {
        if (n >= rowNumber) {
            Space space = new Space();
            HorizontalLine horizontalLine = new HorizontalLine();
            space.draw(n - rowNumber);
            horizontalLine.drawHorizontalLine(rowNumber * 2 - 1);
        }
        return;

    }
}
