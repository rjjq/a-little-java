package chapter2;

public class ManhattanPt extends PointD {
    public ManhattanPt(int _x, int _y) {
        super(_x, _y);
    }

    int distanceToO() {
        return x + y;
    }


    // ----------------------------
}
