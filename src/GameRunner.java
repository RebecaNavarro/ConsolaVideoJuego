public class GameRunner {

    GameConsole game;

    public GameRunner(GameConsole game){
        this.game = game;
    }

    public void run(){
        System.out.println("Running game: " + game);
        game.left();
        game.down();
        game.right();
        game.up();
    }

}
