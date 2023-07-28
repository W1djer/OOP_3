package first_task;


public class home_1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", 3, "Валера", 5);
        Cat cat2 = new Cat();
        Cat cat3 = new Cat("Вася", 7, "Леха", 8);

        cat2.setName("Кузя");
        cat2.setAge(4);
        cat2.setOwner(Inter.OW);
        cat2.setAwards(6);
        /**cat1.greet();
        cat1.setOwner();
         */

        Hello hello;
        hello = () -> "Поприветствуйте наших участников:";
        System.out.println(hello.privet());

        cat1.greet();
        cat2.greet();
        cat3.greet();







    }

}
