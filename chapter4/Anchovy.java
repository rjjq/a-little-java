package chapter3;

class Anchovy extends Pizza {
    Pizza p;
    Anchovy(Pizza _p) {
        p = _p;
    }
    Pizza remA() {
        return p.remA();
    }
    Pizza topAwC() {
        return new Cheese(
                new Anchovy(
                    p.topAwC()));
    }
    Pizza subAbC() {
        return new Cheese(
                p.subAbC());
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + p.toString() + ")";
    }
}
