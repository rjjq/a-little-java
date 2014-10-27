package chapter3;

abstract class Pizza {
    abstract Pizza remA();
    abstract Pizza topAwC();
    abstract Pizza subAbC();
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
