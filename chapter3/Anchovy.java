package chapter3;

class Anchovy extends Pizza {
    Pizza p;
    Anchovy(Pizza _p) {
        p = _p;
    }
    Pizza remA() {
        return new Crust();
    }
    Pizza topAwC() {
        return new Cheese(
                new Anchovy(
                    p.topAwC()));
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + p.toString() + ")";
    }
}
