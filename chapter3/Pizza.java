package chapter3;

abstract class Pizza {
    abstract Pizza remA();
    abstract Pizza topAwC();
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
