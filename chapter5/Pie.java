package chapter5;

abstract class Pie {
    RemV remFn = new RemV();
    abstract Pie rem(Object o);
    SubstV substFn = new SubstV();
    abstract Pie subst(Object n, Object o);
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
