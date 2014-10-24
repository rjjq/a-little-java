package chapter3;

class Olive extends Pizza {
    Pizza p;
    Olive(Pizza _p) {
        p = _p;
    }
    Pizza remA() {
        return new Olive(p.remA());
    }
    Pizza topAwC() {
        return new Sausage(p.topAwC());
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + p.toString() + ")";
    }
}

