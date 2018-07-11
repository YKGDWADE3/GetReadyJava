package DiamondExercises;

public class DiamondWithName {
    private static final String NAME = "YKG";

    public DiamondWithName() {
    }

    public void draw(int n) {
        Diamond diamond = new Diamond();
        for (int i = 1; i < n; i++) {
            diamond.drawAsteriskAndSpace(n, i);
        }
        System.out.println(NAME);
        for (int i = n - 1; i > 0; i--) {
            diamond.drawAsteriskAndSpace(n, i);
        }
    }
}
