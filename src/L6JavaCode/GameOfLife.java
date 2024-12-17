package L6JavaCode;

public class GameOfLife {
    private static final int DIM1 = 20;
    private static final int DIM2 = 10;

    // Initialize world with 60% alive cells (1 for alive, 0 for dead)
    public static int[][] initWelt() {
        int[][] welt = new int[DIM1][DIM2];
        for (int y = 1; y < DIM2 - 1; y++) {
            for (int x = 1; x < DIM1 - 1; x++) {
                welt[x][y] = Math.random() > 0.4 ? 1 : 0;
            }
        }
        return welt;
    }

    // Display the world
    public static void zeigeWelt(int[][] welt) {
        StringBuilder sb = new StringBuilder(); // Use StringBuilder to optimize printing
        for (int y = 1; y < DIM2 - 1; y++) {
            for (int x = 1; x < DIM1 - 1; x++) {
                sb.append(welt[x][y] == 1 ? 'X' : ' ');
            }
            sb.append("\n");
        }
        System.out.print(sb.toString()); // Print the whole generation at once
    }

    // Count neighbors of a cell
    public static int anzNachbarn(int[][] welt, int x, int y) {
        int ret = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (!(i == 0 && j == 0)) {
                    ret += welt[x + i][y + j];
                }
            }
        }
        return ret;
    }

    // Apply rules to the world and return the next state
    public static int[][] wendeRegelnAn(int[][] welt) {
        int[][] weltNeu = new int[DIM1][DIM2];

        for (int y = 1; y < DIM2 - 1; y++) {
            for (int x = 1; x < DIM1 - 1; x++) {
                int nachbarn = anzNachbarn(welt, x, y);
                weltNeu[x][y] = (nachbarn == 3 || (welt[x][y] == 1 && nachbarn == 2)) ? 1 : 0;
            }
        }
        return weltNeu;
    }

    // Main execution method
    public static void main(String[] args) {
        int[][] welt = initWelt();
        System.out.println("Startkonstellation");
        zeigeWelt(welt);

        for (int i = 1; i <= 10; i++) {
            welt = wendeRegelnAn(welt);
            System.out.println("Generation " + i);
            zeigeWelt(welt);
        }
    }
}
