public class Labyrinth {

    // we create a 2D array of our box objects
    private Box[][] maze;
    // we also create start and end point for the maze
    private int xStart;
    private int yStart;
    private int xEnd;
    private int yEnd;

    public Labyrinth(int x, int y, int xStart, int yStart, int xEnd, int yEnd) {
        Box[][] boxes = new Box[x][y];
        for (int i = 0; i <= x-1; i++) {
            for (int j = 0; j <= y-1; j++) {

                boxes[i][j] = new Box(i,j);
            }
        }
        this.maze = boxes;
        this.xStart = xStart;
        this.yStart = yStart;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
    }

    public Box[][] getMaze() {
        return maze;
    }

    public void setMaze(Box[][] maze) {
        this.maze = maze;
    }

    public int getxStart() {
        return xStart;
    }

    public void setxStart(int xStart) {
        this.xStart = xStart;
    }

    public int getyStart() {
        return yStart;
    }

    public void setyStart(int yStart) {
        this.yStart = yStart;
    }

    public int getxEnd() {
        return xEnd;
    }

    public void setxEnd(int xEnd) {
        this.xEnd = xEnd;
    }

    public int getyEnd() {
        return yEnd;
    }

    public void setyEnd(int yEnd) {
        this.yEnd = yEnd;
    }
}
