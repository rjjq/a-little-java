package chapter5;

class Tuna extends Fish {
    public boolean equals(Object o) {
        return (o instanceof Tuna);
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
