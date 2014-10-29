package chapter5;

class Top extends Pie {
    Object t;
    Pie r;
    Top(Object _t, Pie _r) {
        t = _t;
        r = _r;
    }
    Pie rem(Object o) {
        return remFn.forTop(t, r, o);
    }
    Pie subst(Object n, Object o) {
        return substFn.forTop(t, r, n, o);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + t.toString() + ", " + r.toString() + ")";
    }
}
