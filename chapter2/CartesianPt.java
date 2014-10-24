package chapter2;

public class CartesianPt extends PointD {
    CartesianPt(int _x, int _y) {
        super(_x, _y);
    }

    int distanceToO() {
        return (int) Math.round(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

}

