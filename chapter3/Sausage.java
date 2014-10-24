package chapter3;

class Sausage extends Pizza {
    Pizza p;
    Sausage(Pizza _p) {
        p = _p;
    }
    Pizza remA() {
        return new Sausage(p.remA());
    }
    Pizza topAwC() {
        return new Sausage(p.topAwC());
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + p.toString() + ")";
    }
}
