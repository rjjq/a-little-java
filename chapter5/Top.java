package chapter5;

class Top extends Pie {
    Object t;
    Pie r;
    Top(Object _t, Pie _r) {
        t = _t;
        r = _r;
    }
    Pie remA() {
        return raFn.forTop(t, r);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + t.toString() + ", " + r.toString() + ")";
    }
}
