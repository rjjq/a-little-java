package chapter6;

class Top extends Pie {
    Object t;
    Pie r;
    Top(Object _t, Pie _r) {
        t = _t;
        r = _r;
    }
    Pie rem(RemV remFn, Object o) {
        return remFn.forTop(t, r, o);
    }
    Pie subst(SubstV substFn) {
        return substFn.forTop(t, r);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + t.toString() + ", " + r.toString() + ")";
    }
}
