package chapter5;

class Salmon extends Fish {
    public boolean equals(Object o) {
        return (o instanceof Salmon);
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
