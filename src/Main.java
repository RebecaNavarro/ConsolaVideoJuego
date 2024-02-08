public class Main {

    public static void main(String[] args) {

        System.out.println("Video console game!");

//        MarioGame game = new MarioGame();
//        SuperContraGame game = new SuperContraGame();
        Pacman game = new Pacman();

        GameRunner gameRunner = new GameRunner(game);

        gameRunner.run();

//        game.up();
//        game.down();
//        game.left();
//        game.right();

    }
}