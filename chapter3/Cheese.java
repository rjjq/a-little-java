package chapter3;

class Cheese extends Pizza {
    Pizza p;
    Cheese(Pizza _p) {
        p = _p;
    }
    Pizza remA() {
        return new Cheese(p.remA());
    }
    Pizza topAwC() {
        return new Cheese(p.topAwC());
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + p.toString() + ")";
    }
}
