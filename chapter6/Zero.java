package chapter6;

class Zero extends Num {
    public boolean equals(Object o) {
        return o instanceof Zero;
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
