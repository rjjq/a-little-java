package chapter6;

class SubstV implements PieVisitorI {
    Object n;
    Object o;
    SubstV(Object _n, Object _o) {
        n = _n;
        o = _o;
    }
    public Pie forBot() {
        return new Bot();
    }
    public Pie forTop(Object t, Pie r) {
        if (o.equals(t)) {
            return new Top(n, r.accept(this));
        } else {
            return new Top(t, r.accept(this));
        }
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + n.toString() + "," + o.toString() + ")";
    }
}
