public class Main {
    public static void main(String[] args) {

        MagicBox<String> magicBox1 = new MagicBox<>(3);
        MagicBox<Double> magicBox2 = new MagicBox<>(2);
        magicBox1.add("Игрушка");
        magicBox1.add("Ручка");
        //magicBox1.pick();
        magicBox1.add("Шарик");
        magicBox1.pick();
        magicBox2.add(2.5);
        //magicBox2.pick();
        magicBox2.add(3.5);
        magicBox2.pick();
    }
}