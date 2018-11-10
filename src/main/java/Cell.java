public class Cell {
    private boolean isAlive;

    Cell() {
        isAlive = false;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
