package chapter6;

class RemV implements PieVisitorI {
    Object o;
    RemV(Object _o) {
        o = _o;
    }
    public Pie forBot() {
        return new Bot();
    }
    public Pie forTop(Object t, Pie r) {
        if (o.equals(t)) {
            return r.accept(this);
        } else {
            return new Top(t, r.accept(this));
        }
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
