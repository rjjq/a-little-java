package chapter2;

public class Main {
    public static void main(String[] args) {
        CartesianPt c = new CartesianPt(3, 4);
        ManhattanPt m = new ManhattanPt(3, 4);

        System.out.println(c.distanceToO());
        System.out.println(m.distanceToO());

        Boolean closer = new ManhattanPt(1, 5).closerToO(m);

        Onion o = new Onion(new Onion(new Skewer()));
        System.out.println(o.onlyOnions());
    }
}


