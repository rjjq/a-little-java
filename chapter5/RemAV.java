package chapter5;

class RemAV {
    Pie forBot() {
        return new Bot();
    }
    Pie forTop(Object t, Pie r) {
        if (new Anchovy().equals(t)) {
            return r.remA();
        } else {
            return new Top(t, r.remA());
        }
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
