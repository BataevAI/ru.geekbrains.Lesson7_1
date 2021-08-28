public class Cat {

    private String name;           // имя кота
    private int appetite;          // аппетит
    private boolean fed = false;   // ссытость

    public Cat(String name, int appetite) {

        this.name = name;
        this.appetite = appetite;

    }

    public String getName() {
        return name;
    }

    public void fedInfo() {

        if (fed) {
            System.out.println("cat " + name + " is not hungry");
        } else System.out.println("cat " + name + " want to eat!!!");
    }

    public void eat(Plate p) {

        if (p.decreaseFood(appetite)) {

            fed = true;
        }


    }

}
