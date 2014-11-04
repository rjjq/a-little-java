package chapter6;

public class Main {
    public static void main(String args[]) {
        Pie p = new Top(new Anchovy(),
                new Top(new Integer(3),
                    new Top(new Zero(),
                        new Bot())))
            .accept(new RemV(new Zero()));
        System.out.println(p.toString());

        Pie p1 = new Top(new Integer(3),
                new Top(new Integer(2),
                    new Top(new Integer(3),
                        new Bot())))
            .accept(new SubstV(new Integer(5),
                    new Integer(3)));
        System.out.println(p1.toString());


        Pie p2 = new Top(new Anchovy(),
                new Top(new Tuna(),
                    new Top(new Anchovy(),
                        new Top(new Tuna(),
                            new Top(new Anchovy(),
                                new Bot())))))
            .accept(new LtdSubstV(2,
                        new Salmon(),
                        new Anchovy()));
        System.out.println(p2.toString());
    }
}
