package DiamondExercises;

public class Space {
    public Space() {
    }

    public void draw(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(" ");
            }
        } else {
            return;
        }
    }
}
