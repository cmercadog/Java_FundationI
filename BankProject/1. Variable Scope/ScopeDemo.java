/**
 * ScopeDemo
 */
public class ScopeDemo {
    private int x = 11;

    public void f() {
        int y = 2;
        for (int z = 3; z < 10; z++) {
            int a;
            System.out.println(x + y + z);
        }

        //a = 10;
        //Can we use z here? No
        //Can we use x here? Yes
        x = 20;
        //Can we use y here? yes
    }

    public void g4() {
        int y = 7;
        System.out.println(y);

        //Can we use z here? No
        //Can we use x here? Yes
        x = 10;
        //Is y the same y in method f()? No
        //Can we use y here? Yes but is not the same as f()
    }

    public void g3() {
        int y = 7;
        System.out.println(y);

        //Can we use z here? No
        //Can we use x here? Yes
        x = 10;
        //Is y the same y in method f()? No
        //Can we use y here? Yes but is not the same as f()
    }

    public void g2() {
        int y = 7;
        System.out.println(y);

        //Can we use z here? No
        //Can we use x here? Yes
        x = 10;
        //Is y the same y in method f()? No
        //Can we use y here? Yes but is not the same as f()
    }

    public void g1() {
        int y = 7;
        System.out.println(y);

        //Can we use z here? No
        //Can we use x here? Yes
        x = 10;
        //Is y the same y in method f()? No
        //Can we use y here? Yes but is not the same as f()
    }
}