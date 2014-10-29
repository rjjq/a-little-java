package chapter6;

class Anchovy extends Fish {
    public boolean equals(Object o) {
        return (o instanceof Anchovy);
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

