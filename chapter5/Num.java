package chapter5;

abstract class Num {
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
