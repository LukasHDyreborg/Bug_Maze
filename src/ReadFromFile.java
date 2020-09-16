import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromFile {

    public static void read(ArrayList<String> list) {
        try {
            BufferedReader buff = new BufferedReader(new FileReader("src/Maze Data"));

            String line = buff.readLine();
            while (line != null) {
                list.add(line);
                line = buff.readLine();
            }

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } catch (IOException e) {
            System.out.println("You got an Input/Output exception!");
        }
    }

    public static int[][] cut(int choice)  {
        ArrayList<String> list = new ArrayList<>();
        read(list);
        int value1 = Integer.parseInt(list.get(0));
        int value2 = Integer.parseInt(list.get(value1 + 1));

        System.out.println(value1);
        System.out.println(value2);

        String[] cut = list.get(1).split(", ");

        int[][] horizontal = new int[value1][cut.length-1];

        cut = list.get(value2 + 1).split(", ");

        int[][] vertical = new int[value2][cut.length-1];


        if (choice == 1) {
            for (int i = 1; i <= value1; i++) {
                cut = list.get(i).split(", ");
                for (int j = 1; j <cut.length; j++) {
                    horizontal[i-1][j-1] = Integer.parseInt(cut[j]);
                }
            }
            return horizontal;
        } else {
            for (int i = value2+1; i <= value1 + value2 + 1; i++) {
                cut = list.get(i).split(", ");
                for (int j = 1; j <cut.length; j++) {
                    vertical[i-(value2+1)][j-1] = Integer.parseInt(cut[j]);
                }
            }
            return vertical;
        }
    }
}
