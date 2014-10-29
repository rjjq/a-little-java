package chapter5;

public class Main {
    public static void main(String args[]) {
        Pie p = new Top(new Salmon(),
                    new Top(new Anchovy(),
                        new Top(new Tuna(),
                            new Top(new Anchovy(),
                                new Bot()))))
            .remA();
        System.out.println(p.toString());
    }
}
