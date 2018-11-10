public class Grid {

    private int gridSize_x;
    private int gridSize_y;
    private Cell cells[][];

    Grid(int gridSize_x, int gridSize_y) {

        this.gridSize_x = gridSize_x;
        this.gridSize_y = gridSize_y;

        cells = new Cell[gridSize_x][gridSize_y];

        for(int i=0; i<gridSize_x; i++) {
            for (int j=0; j<gridSize_y;j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public void display() {
        for(int i=0; i<gridSize_x; i++) {
            for (int j=0; j<gridSize_y;j++) {
                if(cells[i][j].isAlive()) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public boolean getCell(int x, int y) {
        return cells[x][y].isAlive();
    }

    public void setCell(boolean value, int x, int y) {
        cells[x][y].setAlive(value);
    }

    public void update(int x, int y) {

        for(int i= -1; i<2 ; i++ ) {
            for(int j=-1; i<2;j++) {
                if(cells[(x+i)%gridSize_x][(y+j)%gridSize_y].isAlive()) {

                }
            }
        }
    }
}
