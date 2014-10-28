package chapter4;

class Anchovy extends Pizza {
    Pizza p;
    Anchovy(Pizza _p) {
        p = _p;
    }
    Pizza remA() {
        return remFn.forAnchovy(p);
    }
    Pizza topAwC() {
        return topFn.forAnchovy(p);
    }
    Pizza subAbC() {
        return subFn.forAnchovy(p);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + p.toString() + ")";
    }
}
