package chapter6;

class SubstV {
    Object n;
    Object o;
    SubstV(Object _n, Object _o) {
        n = _n;
        o = _o;
    }
    Pie forBot() {
        return new Bot();
    }
    Pie forTop(Object t, Pie r) {
        if (o.equals(t)) {
            return new Top(n, r.subst(this));
        } else {
            return new Top(t, r.subst(this));
        }
    }
}
