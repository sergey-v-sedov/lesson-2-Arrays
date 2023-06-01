import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[][] field = new byte[][]{
                {0,1,0,0,0,0,0,0,0,0},
                {0,0,1,0,0,0,1,1,1,1},
                {0,0,1,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,1,1,1,0,0,0,0},
                {1,1,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,1,0,0,0,0,1}
        }; // 7

        byte count = 0;

        for(int i=0; i< field.length; i++) {
            for(int j=0; j< field[i].length; j++) {
                byte cell = field[i][j];
                if(cell == 1 && (j==0 || field[i][j-1] == 0) && (i==0 || field[i-1][j] == 0)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}