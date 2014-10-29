package chapter5;

class RemIntV {
    Pie forBot(Integer i) {
        return new Bot();
    }
    Pie forTop(Object t, Pie r, Integer i) {
        if (i.equals(t)) {
            return r.remInt(i);
        } else {
            return new Top(t, r.remInt(i));
        }
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
