public class Main {


    public static void main(String[] args) {

        Snake snake = new Snake('*');

        Food food = new Food('@');

        Canvas canvas = new Canvas();
        canvas.init(snake.getSnake(), food, false, 0, 0);
        canvas.print();

        while (true) {
            snake.move(canvas.getMatrix(), Canvas.getHEIGHT(), Canvas.getWIDTH());
            boolean isAte = snake.isAte(canvas.getMatrix(),  Canvas.getWIDTH(), Canvas.getHEIGHT(), food, food.getX(), food.getY());
            if (isAte){
                canvas.init(snake.getSnake(), food, isAte, snake.getY(), snake.getX());
            }
            canvas.print();
        }
    }
}
