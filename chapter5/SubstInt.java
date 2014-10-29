package chapter5;

class SubstIntV {
    Pie forBot(Integer n, Integer o) {
        return new Bot();
    }
    Pie forTop(Object t,
            Pie r,
            Integer n,
            Integer o) {
        if (o.equals(t)) {
            return new Top(n, r.substInt(n, o));
        } else {
            return new Top(t, r.substInt(n, o));
        }
    }
}
