public class Pacman implements GameConsole{

    @Override
    public void up() {
        System.out.println("Ve arriba");
    }

    @Override
    public void down() {
        System.out.println("Ve abajo");
    }

    @Override
    public void left() {
        System.out.println("Ve a la izquierda");
    }

    @Override
    public void right() {
        System.out.println("Ve a la derecha");
    }
}
