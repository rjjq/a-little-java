package chapter4;

class Spinach extends Pizza {
    Pizza p;
    Spinach(Pizza _p) {
        p = _p;
    }
    Pizza remA() {
        return new Spinach(p.remA());
    }
    Pizza topAwC() {
        return new Spinach(p.topAwC());
    }
    Pizza subAbC() {
        return new Spinach(p.subAbC());
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + p.toString() + ")";
    }
}
