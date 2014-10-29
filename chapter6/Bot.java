package chapter6;

class Bot extends Pie {
    Pie rem(RemV remFn, Object o) {
        return remFn.forBot(o);
    }
    Pie subst(SubstV substFn) {
        return substFn.forBot();
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
