package chapter6;

class Bot extends Pie {
    Pie accept(PieVisitorI ask) {
        return ask.forBot();
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
