package chapter6;

abstract class Pie {
    abstract Pie rem(RemV remFn,
            Object o);
    abstract Pie subst(SubstV substFn,
            Object n,
            Object o);
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
