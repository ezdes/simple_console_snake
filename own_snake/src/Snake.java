import java.util.Scanner;

public class Snake {
    private char snake;
    private int x;
    private int y;
    private Scanner scanner;
    private String movement;
    private int count = 1;
    private boolean hasTail;
    boolean isAte;
    public Snake(){
    }

    public Snake(char snake){
        this.snake = snake;
    }

    void move(char[][] matrix, int h, int w){
        scanner = new Scanner(System.in);
        movement = scanner.nextLine();


        if (x != w)
            if (movement.equals("right")) {

                matrix[y][x] = '.';
                matrix[y][x + 1] = '*';
                x++;
            }
        if (x != 0)
            if (movement.equals("left")){
                matrix[y][x] = '.';
                matrix[y][x - 1] = '*';
                x--;
            }

        if (y != h)
            if (movement.equals("down")){
                matrix[y][x] = '.';
                matrix[y + 1][x] = '*';
                y++;
            }

        if (y != 0)
            if (movement.equals("up")){
                matrix[y][x] = '.';
                matrix[y - 1][x] = '*';
                y--;
        }

        if (movement.equals("exit")){
            System.exit(0);
        }
    }

    boolean isAte(char[][] snakeMatrix,  int h, int w, Food food, int x, int y){
        isAte = snakeMatrix[this.y][this.x] == snakeMatrix[y][x];

        return isAte;
    }


    public char getSnake(){
        return snake;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getCount(){
        return count;
    }

    public boolean isHasTail(){
        return hasTail;
    }
}
