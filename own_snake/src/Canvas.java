
public class Canvas {
    private final static int HEIGHT = 6;
    private final static int WIDTH = 6;
    private char[][] matrix = new char[HEIGHT][WIDTH];
    private int points;

    void init(char snake, Food food, Boolean isAte, int y, int x){
        for (int i = 0; i < HEIGHT; i++){
            for (int j = 0; j < WIDTH; j++){
                matrix[i][j] = '.';
            }
        }

        if (!isAte) {
            matrix[0][0] = snake;


            food.foodInit(matrix, HEIGHT, WIDTH, y, x);
        }

        if (isAte){
            points += 10;
            matrix[y][x] = snake;

            food.foodInit(matrix, HEIGHT, WIDTH, y, x);
        }
    }

    void print(){

        if (points == 100){
            System.out.println("Congratulations! You won");
            System.exit(1);
        }

        System.out.println("Points: " + points);
        for (int i = 0; i < HEIGHT; i++){
            for (int j = 0; j < WIDTH; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

    public static int getWIDTH() {
        return WIDTH;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }

    public int getPoints(){
        return points;
    }
}
