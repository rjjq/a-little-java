package chapter6;

abstract class Num {
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
