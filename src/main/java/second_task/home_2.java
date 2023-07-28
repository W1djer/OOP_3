package second_task;


import java.util.ArrayList;
import java.util.List;

public class home_2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", 3, "Валера", 7);
        Cat cat2 = new Cat();
        Cat cat3 = new Cat("Вася", 7, "Леха", 9);

        cat2.setName("Кузя");
        cat2.setAge(4);
        cat2.setOwner("Маргарита");
        cat2.setAwards(6);


        cat1.greet();
        cat2.greet();
        cat3.greet();
        System.out.println();

        List<Cat> kitties = new ArrayList<>();
        kitties.add(cat1);
        kitties.add(cat2);
        kitties.add(cat3);

        kitties.sort((kitty1, kitty2) -> kitty2.getAwards() - kitty1.getAwards());
        System.out.println("Рейтинг котиков: ");
        for (Cat kitty : kitties
             ) {
            System.out.println(kitty);
        }


    }

}
