package chapter2;

public abstract class PointD {
    int x;
    int y;
    PointD(int _x, int _y) {
        x = _x;
        y = _y;
    }
    abstract int distanceToO();
    boolean closerToO(PointD p) {
        return distanceToO() <= p.distanceToO();
    }
}


