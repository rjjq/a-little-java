package chapter5;

abstract class Pie {
    RemAV raFn = new RemAV();
    abstract Pie remA();
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
