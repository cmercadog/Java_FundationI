public class Test {
    private static int x;
    private int y;

    public Test(int val) {
        x = val;
        y = val;
    }

    public void print() {
        System.out.println("{Static} X:" + x + " {Non-Static} Y: " + y);
    }
}