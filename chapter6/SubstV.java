package chapter6;

class SubstV {
    Pie forBot(Object n,
            Object o) {
        return new Bot();
    }
    Pie forTop(Object t,
            Pie r,
            Object n,
            Object o) {
        if (o.equals(t)) {
            return new Top(n, r.subst(this, n, o));
        } else {
            return new Top(t, r.subst(this, n, o));
        }
    }
}
