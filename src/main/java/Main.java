

public class Main {


    public static void main(String[] args) {

//        Cat cat = new Cat("Kuzya", 50);
//
//        Plate plate = new Plate(30);
//
//        cat.fedInfo();
//        plate.info();
//        System.out.println();
//        cat.eat(plate);
//        plate.info();
//        cat.fedInfo();
        System.out.println();
        System.out.println("Подбираем в подвале несколько котов и начинаем их кормить");
        System.out.println();

        // Подбираем в подвале несколько котов и начинаем их кормить

        Plate plate1 = new Plate(110);

        Cat[] cats = new Cat[]{

                new Cat("Vaska", 20),

                new Cat("Shurka", 30),

                new Cat("Vovka", 45),

                new Cat("Abramchik", 56)
        };

        plate1.info();
        System.out.println();
        for (Cat t : cats
        ) {

            System.out.print(t.getName() + " ");
            t.eat(plate1);

            plate1.info();
            System.out.println("cat " + t.getName() + " want to eat?");
            System.out.println();
            t.fedInfo();
            System.out.println();

        }

        System.out.println("накладываем снова еды");
        System.out.println();

        plate1.backEat(100);
        System.out.println("сколько появилось еды?");
        plate1.info();
        System.out.println();

        System.out.print(cats[3].getName() + " ");
        cats[3].eat(plate1);
        plate1.info();
        System.out.println("cat " + cats[3].getName() + " want to eat?");
        System.out.println();
        cats[3].fedInfo();
        System.out.println();


    }


}
