package chapter5;

class Bot extends Pie {
    Pie rem(Object o) {
        return remFn.forBot(o);
    }
    Pie subst(Object n, Object o) {
        return substFn.forBot(n, o);
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
