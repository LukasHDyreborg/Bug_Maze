import java.io.IOException;

public class main {
    public static void main(String[] args)  {
        Labyrinth labyrinth = new Labyrinth(6,5);

        Bug bug = new Bug(labyrinth);
        bug.run(1, -1, 2, 5);
    }
}
