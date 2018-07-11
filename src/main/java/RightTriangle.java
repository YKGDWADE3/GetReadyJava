public class RightTriangle {
    public RightTriangle() {
    }

    public void drawRightTriangle(int n) {
        if (n > 0) {
            HorizontalLine horizontalLine = new HorizontalLine();
            for (int i = 0; i < n; i++) {
                horizontalLine.drawHorizontalLine(i + 1);
            }
        } else {
            return;
        }

    }
}
