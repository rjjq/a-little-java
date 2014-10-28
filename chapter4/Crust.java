package chapter4;

class Crust extends Pizza {
    Pizza remA() {
        return remFn.forCrust();
    }
    Pizza topAwC() {
        return topFn.forCrust();
    }
    Pizza subAbC() {
        return subFn.forCrust();
    }
}
