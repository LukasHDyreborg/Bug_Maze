public class Labyrinth {

    private Box[][] maze;

    public Labyrinth(int x, int y/*, String start, String end*/) {
        Box[][] boxes = new Box[x][y];
        for (int i = 0; i <= x-1; i++) {
            for (int j = 0; j <= y-1; j++) {

                boxes[i][j] = new Box(i,j);
            }
        }
        this.maze = boxes;
    }

    public Box[][] getMaze() {
        return maze;
    }

    public void setMaze(Box[][] maze) {
        this.maze = maze;
    }
}
