import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromFile {

    // This method is used to read the file where the data for our maze is located.
    public static void read(ArrayList<String> list) {
        try {
            // we use the BufferReader to read the file.
            BufferedReader buff = new BufferedReader(new FileReader("src/Maze Data"));

            // this while loop is used to read all lines and add them to a ArrayList.
            String line = buff.readLine();
            while (line != null) {
                list.add(line);
                line = buff.readLine();
            }
        } catch (IOException e) {
            System.out.println("You got an Input/Output exception!");
        }
    }

    // we use this method to cut every line in the file into values of 1s and 0s.
    public static int[][] cut(int choice)  {
        // we create the ArrayList
        ArrayList<String> list = new ArrayList<>();
        // we call our method read
        read(list);
        // we create 2 values we are going to need.
        int value1 = Integer.parseInt(list.get(0));
        int value2 = Integer.parseInt(list.get(value1 + 1));

        // we cut the string to find how many values our 2D Array is going to need.
        String[] cut = list.get(1).split(", ");
        // we create the first array
        int[][] horizontal = new int[value1][cut.length-1];

        // we do the same again
        cut = list.get(value2 + 1).split(", ");
        int[][] vertical = new int[value2][cut.length-1];


        // if we are given a 1 when calling this method we call this if and returns the horizontal array
        if (choice == 1) {
            for (int i = 1; i <= value1; i++) {
                cut = list.get(i).split(", ");
                for (int j = 1; j <cut.length; j++) {
                    horizontal[i-1][j-1] = Integer.parseInt(cut[j]);
                }
            }
            return horizontal;
        } // if we are given any other value we get this instead and returns the vertical array
        else {
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