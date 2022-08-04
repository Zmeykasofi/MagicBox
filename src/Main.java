public class Main {

    public static void main(String[] args) {

        MagicBox<String> magicBox1 = new MagicBox<>();

        magicBox1.add("Звезда смерти");
        magicBox1.add("Дождик");
        magicBox1.add("Диплом доктора наук");
        magicBox1.add("Улыбка");
        magicBox1.add("Вино из одуванчиков");
        magicBox1.add("Борис Джонсон");
        magicBox1.add("Буква Ы");
        magicBox1.add("Кролик");

        System.out.println("Достали из первой коробки " + magicBox1.pick());
        System.out.println("Достали из первой коробки " + magicBox1.pick());
        System.out.println("Достали из первой коробки " + magicBox1.pick());
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        MagicBox<Integer> magicBox2 = new MagicBox<>();

        magicBox2.add(1_000);
        magicBox2.add(345);
        magicBox2.add(0);
        magicBox2.add(88_888);
        magicBox2.add(15);
        magicBox2.add(9);
        magicBox2.add(2_222);

        System.out.println("Достали из второй коробки " + magicBox2.pick());
        System.out.println("Достали из второй коробки " + magicBox2.pick());
        System.out.println("Достали из второй коробки " + magicBox2.pick());
    }
}
