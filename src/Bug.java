public class Bug {

    // we create the fields for our bug
    private String direction;
    private int steps;
    private int x;
    private int y;
    private Labyrinth labyrinth;


    public Bug(Labyrinth labyrinth) {
        this.steps = 0;
        this.direction = null;
        this.labyrinth = labyrinth;
        // we set the x and y values equal to the maze starting point
        this.x = labyrinth.getxStart();
        this.y = labyrinth.getyStart();
    }

    // we create the method run that calls a while loop that runs until the bug reaches the final destination
    public void run() {
        int i = 0;
        while (i == 0) {
            move();
            if ((x == labyrinth.getxEnd()) && (y == labyrinth.getyEnd())) {
                System.out.println("Success you got out of the maze!!");
                System.out.println("The bug moved " + getSteps() + " steps through the maze!");
                System.exit(0);
            }
        }
    }

    // this method calls the methods that move the bug
    public void move() {
        if (steps == 0) {
            moveUp();
        } else {
            String choice = moveDirection();

            switch (choice) {
                case "left":
                    moveLeft();
                    break;
                case "up":
                    moveUp();
                    break;
                case "right":
                    moveRight();
                    break;
                case "down":
                    moveDown();
                    break;
            }
        }
        this.steps = steps+1;
    }

    // this method decides which direction the bug should move
    private String moveDirection() {
        switch (direction) {
            case "up":
                return check("left", "up", "right", "down");
            case "right":
                return check("up", "right", "down", "left");
            case "down":
                return check("right", "down", "left", "up");
            case "left":
                return check("down", "left", "up", "right");

        }
        return null;
    }

    // this method checks to see if it is possible to move a given direction
    private String check(String ... args) {

        for (String direction : args) {
            switch (direction) {
                case "up":
                    if (labyrinth.getMaze()[x][y].getUp()) {
                        return direction;
                    }
                    break;
                case "down":
                    if (labyrinth.getMaze()[x][y].getDown()) {
                        return direction;
                    }
                    break;
                case "left":
                    if (labyrinth.getMaze()[x][y].getLeft()) {
                        return direction;
                    }
                    break;
                case "right":
                    if (labyrinth.getMaze()[x][y].getRight()) {
                        return direction;
                    }
                    break;
            }
        }
        return direction;
    }

    // methods that move the bug in a given direction
    private void moveUp() {
        this.y = y+1;
        this.direction = "up";
        System.out.println("moves up");
    }

    private void moveDown() {
        this.y = y-1;
        this.direction = "down";
        System.out.println("moves down");
    }

    private void moveLeft() {
        this.x = x-1;
        this.direction = "left";
        System.out.println("moves left");
    }

    private void moveRight() {
        this.x = x+1;
        this.direction = "right";
        System.out.println("moves right");
    }

    private String getDirection() {
        return direction;
    }

    private void setDirection(String direction) {
        this.direction = direction;
    }

    private int getSteps() {
        return steps;
    }

    private void setSteps(int steps) {
        this.steps = steps;
    }

    private int getX() {
        return x;
    }

    private void setX(int x) {
        this.x = x;
    }

    private int getY() {
        return y;
    }

    private void setY(int y) {
        this.y = y;
    }

    private Labyrinth getLabyrinth() {
        return labyrinth;
    }

    private void setLabyrinth(Labyrinth labyrinth) {
        this.labyrinth = labyrinth;
    }
}
