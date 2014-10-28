package chapter4;

class Sausage extends Pizza {
    Pizza p;
    Sausage(Pizza _p) {
        p = _p;
    }
    Pizza remA() {
        return remFn.forSausage(p);
    }
    Pizza topAwC() {
        return topFn.forSausage(p);
    }
    Pizza subAbC() {
        return subFn.forSausage(p);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + p.toString() + ")";
    }
}
