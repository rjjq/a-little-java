package chapter6;

class Bot extends Pie {
    Pie rem(RemV remFn, Object o) {
        return remFn.forBot(o);
    }
    Pie subst(SubstV substFn,
            Object n,
            Object o) {
        return substFn.forBot(n, o);
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
