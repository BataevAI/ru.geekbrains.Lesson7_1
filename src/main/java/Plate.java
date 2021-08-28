public class Plate {

    private int food;


    public Plate(int food) {
        this.food = food;
    }


    public void info() {

        System.out.println("plate contains food: " + food);
    }

    public boolean decreaseFood(int n) {

        if (food >= n) {
            food -= n;
            System.out.println("ate food: " + n);
            return true;
        } else {
            System.out.println("not enough food!");
            return false;

        }
    }
        // метод для добавления еды
    public void backEat (int food) {

        this.food = food;
    }

}
