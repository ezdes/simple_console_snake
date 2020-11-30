import java.util.Random;
public class Food {
    private char food;
    private final Random random = new Random();

    private int x;
    private int y;
    public Food(){

    }

    public Food(char food){
        this.food = food;

    }

    void foodInit(char[][] matrix, int h, int w, int ySnake, int xSnake){

        boolean areSamePlace = true;

        while (areSamePlace) {
            y = random.nextInt(h);
            x = random.nextInt(w);
            if (matrix[y][x] != matrix[ySnake][xSnake]) {
                matrix[y][x] = food;
                areSamePlace = false;
            }
            else {
                areSamePlace = true;
            }
        }

    }

    public char getFood() {
        return food;
    }

    public void setFood(char food) {
        this.food = food;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
