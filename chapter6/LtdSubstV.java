package chapter6;

class LtdSubstV implements PieVisitorI {
    int c;
    Object n;
    Object o;
    LtdSubstV(int _c, Object _n, Object _o) {
        c = _c;
        n = _n;
        o = _o;
    }
    public Pie forBot() {
        return new Bot();
    }
    public Pie forTop(Object t, Pie r) {
        if (c == 0) {
            return new Top(t, r);
        } else {
            if (o.equals(t)) {
                return new Top(n,
                        r.accept(
                            new LtdSubstV(c - 1, n, o)));
            } else {
                return new Top(t,
                        r.accept(this));
            }
        }
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + new Integer(c).toString() + "," + n.toString() + "," + o.toString() + ")";
    }
}
