public class Box {

    // we create our fields
    private Boolean up;
    private Boolean down;
    private Boolean right;
    private Boolean left;

    // our constructor
    public Box(int x, int y) {
        // we get our 2D arrays
        int[][] horizontal = ReadFromFile.cut(1);
        int[][] vertical = ReadFromFile.cut(2);

        // we use if statements based on the arrays to decide if the fields are true or false
        if (horizontal[y][x] == 0) {
            this.down = true;
        } else {
            this.down = false;
        }

        if (horizontal[y+1][x] == 0) {
            this.up = true;
        } else {
            this.up = false;
        }

        if (vertical[x][y] == 0) {
            this.left = true;
        } else {
            this.left = false;
        }

        if (vertical[x+1][y] == 0) {
            this.right = true;
        } else {
            this.right = false;
        }
    }

    @Override
    public String toString() {
        return "Box{" +
                "up=" + up +
                ", down=" + down +
                ", right=" + right +
                ", left=" + left +
                '}';
    }

    public Boolean getUp() {
        return up;
    }

    private void setUp(Boolean up) {
        this.up = up;
    }

    public Boolean getDown() {
        return down;
    }

    private void setDown(Boolean down) {
        this.down = down;
    }

    public Boolean getRight() {
        return right;
    }

    private void setRight(Boolean right) {
        this.right = right;
    }

    public Boolean getLeft() {
        return left;
    }

    private void setLeft(Boolean left) {
        this.left = left;
    }
}
