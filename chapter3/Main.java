package chapter3;

class Main {
    public static void main(String args[]) {
        Pizza p = new Cheese(
                new Anchovy(
                    new Cheese(
                        new Crust()))).remA();
        System.out.println(p.toString());

        String p1 = new Olive(
                new Anchovy(
                    new Cheese(
                        new Anchovy(
                            new Crust())))).toString();
        System.out.println(p.toString());

        Pizza p2 = new Olive(
                new Anchovy(
                    new Cheese(
                        new Anchovy(
                            new Crust()))))
            .topAwC()
            .remA();
        System.out.println(p2.toString());

        Pizza p3 = new Spinach(
                new Olive(
                    new Anchovy(
                        new Cheese(
                            new Anchovy(
                                new Crust())))))
            .subAbC();
        System.out.println(p3.toString());
    }
}
