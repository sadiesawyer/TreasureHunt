import java.util.Arrays;
import java.util.Scanner;

public class TreasureHunt {

    public static void main(String [] args) {
        boolean found = false;
        int dug = 0;
        int treY;
        int treX;
        int b1Row;
        int b1Col;
        int b2Row;
        int b2Col;
        int b3Row;
        int b3Col;
        String [][] gameBoard;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Treasure Hunter! Try and guess the coordinates of the buried treasure without hitting a land mine!");
        System.out.println("Choose your game size: 3x3 (1), 5x5 (2), 8x8(3)\n");
        int gameboardChoice = scanner.nextInt();
        System.out.println("Do you want play a one player (click 1) or two player (click 2) game?\n");
        int playerChoice = scanner.nextInt();
        if (playerChoice == 1) {
            treY = (int) (7 * Math.random() + 1);
            treX = (int) (7 * Math.random() + 1);
        } else {
            System.out.println("Player 1 will hide the treasure in their chosen coordinates. Player 2 will try to find the treasure.\nIf Player 2 can find the treasure before reaching a bomb, Player 2 will win.");
            System.out.println("Player 1, choose the x coordinate of the treasure: ");
            treX = scanner.nextInt();
            System.out.println("Player 1: choose the y coordinate of the treasure: ");
            treY = scanner.nextInt();
            System.out.println("Great! Player 2, it's your turn.");
        }
        if (gameboardChoice == 1) {
            b1Row = (int) (2 * Math.random() + 1);
            b1Col = (int) (2 * Math.random() + 1);
            b2Row = (int) (2 * Math.random() + 1);
            b2Col = (int) (2 * Math.random() + 1);
            b3Row = (int) (2 * Math.random() + 1);
            b3Col = (int) (2 * Math.random() + 1);
            while (b1Row == treY && b1Col == treX) {
                b1Row = (int) (2 * Math.random() + 1);
                b1Col = (int) (2 * Math.random() + 1);
            }
            while ((b2Row == b1Row && b2Col == b1Col) || (b2Row == treY && b2Col == treX)) {
                b2Col = (int) (2 * Math.random() + 1);
                b2Row = (int) (2 * Math.random() + 1);
            }
            while ((b3Row == b2Row && b3Col == b2Col) || (b3Row == b1Row && b3Col == b1Col) || (b3Row == treX && b3Col == treY)) {
                b3Col = (int) (2 * Math.random() + 1);
                b3Row = (int) (2 * Math.random() + 1);
            }
            gameBoard = new String[][]{
                    {" ", "1", "2", "3",},
                    {"1", "x", "x", "x",},
                    {"2", "x", "x", "x",},
                    {"3", "x", "x", "x",}};}
        else if (gameboardChoice == 2) {
            b1Row = (int) (4 * Math.random() + 1);
            b1Col = (int) (4 * Math.random() + 1);
            b2Row = (int) (4 * Math.random() + 1);
            b2Col = (int) (4 * Math.random() + 1);
            b3Row = (int) (4 * Math.random() + 1);
            b3Col = (int) (4 * Math.random() + 1);
            while (b1Row == treY && b1Col == treX) {
                b1Row = (int) (4 * Math.random() + 1);
                b1Col = (int) (4 * Math.random() + 1);
            }
            while ((b2Row == b1Row && b2Col == b1Col) || (b2Row == treY && b2Col == treX)) {
                b2Col = (int) (4 * Math.random() + 1);
                b2Row = (int) (4 * Math.random() + 1);
            }
            while ((b3Row == b2Row && b3Col == b2Col) || (b3Row == b1Row && b3Col == b1Col) || (b3Row == treX && b3Col == treY)) {
                b3Col = (int) (4 * Math.random() + 1);
                b3Row = (int) (4 * Math.random() + 1);
            }
            gameBoard = new String[][]{
                    {" ", "1", "2", "3", "4", "5",},
                    {"1", "x", "x", "x", "x", "x",},
                    {"2", "x", "x", "x", "x", "x",},
                    {"3", "x", "x", "x", "x", "x",},
                    {"4", "x", "x", "x", "x", "x",},
                    {"5", "x", "x", "x", "x", "x",}};
        } else {
            b1Row = (int) (7 * Math.random() + 1);
            b1Col = (int) (7 * Math.random() + 1);
            b2Row = (int) (7 * Math.random() + 1);
            b2Col = (int) (7 * Math.random() + 1);
            b3Row = (int) (7 * Math.random() + 1);
            b3Col = (int) (7 * Math.random() + 1);
            while (b1Row == treY && b1Col == treX) {
                b1Row = (int) (7 * Math.random() + 1);
                b1Col = (int) (7 * Math.random() + 1);
            }
            while ((b2Row == b1Row && b2Col == b1Col) || (b2Row == treY && b2Col == treX)) {
                b2Col = (int) (7 * Math.random() + 1);
                b2Row = (int) (7 * Math.random() + 1);
            }
            while ((b3Row == b2Row && b3Col == b2Col) || (b3Row == b1Row && b3Col == b1Col) || (b3Row == treX && b3Col == treY)) {
                b3Col = (int) (7 * Math.random() + 1);
                b3Row = (int) (7 * Math.random() + 1);
            }
            gameBoard = new String[][]{
                    {" ", "1", "2", "3", "4", "5", "6", "7", "8"},
                    {"1", "x", "x", "x", "x", "x", "x", "x", "x"},
                    {"2", "x", "x", "x", "x", "x", "x", "x", "x"},
                    {"3", "x", "x", "x", "x", "x", "x", "x", "x"},
                    {"4", "x", "x", "x", "x", "x", "x", "x", "x"},
                    {"5", "x", "x", "x", "x", "x", "x", "x", "x"},
                    {"6", "x", "x", "x", "x", "x", "x", "x", "x"},
                    {"7", "x", "x", "x", "x", "x", "x", "x", "x"},
                    {"8", "x", "x", "x", "x", "x", "x", "x", "x"}};
        }

        printBoard(gameBoard);
            while (!found) {
                dug++;
                System.out.println("Enter the x coordinate you would like to dig up : ");
                int gX = scanner.nextInt();
                if (gameboardChoice == 1) {
                    while (!(gX > 0 && gX <= 3)) {
                        System.out.println("Enter the x coordinate you would like to dig up : ");
                        gX = scanner.nextInt();
                }}
                if (gameboardChoice == 2) {
                    while (!(gX > 0 && gX <= 5)) {
                        System.out.println("Enter the x coordinate you would like to dig up : ");
                        gX = scanner.nextInt();
                }}
                if (gameboardChoice == 3) {
                    while (!(gX > 0 && gX <= 8)) {
                        System.out.println("Enter the x coordinate you would like to dig up : ");
                        gX = scanner.nextInt();
                    }}
                System.out.println("Enter the y coordinate you would like to dig up : ");
                int gY = scanner.nextInt();
                if (gameboardChoice == 1) {
                    while (!(gY > 0 && gY <= 3)) {
                        System.out.println("Enter the x coordinate you would like to dig up : ");
                        gY = scanner.nextInt();
                    }}
                if (gameboardChoice == 2) {
                    while (!(gY > 0 && gY <= 5)) {
                        System.out.println("Enter the x coordinate you would like to dig up : ");
                        gY = scanner.nextInt();
                    }}
                if (gameboardChoice == 3) {
                    while (!(gY > 0 && gY <= 8)) {
                        System.out.println("Enter the x coordinate you would like to dig up : ");
                        gY = scanner.nextInt();
                    }}
                if (CheckTreasure(treY, treX, gY, gX)) {
                    if (playerChoice == 1) {
                        System.out.println("You found the treasure!");
                        gameBoard[gY][gX] = "t";
                        printBoard(gameBoard);
                        System.out.println("You found the treasure after " + dug + " digs");
                    }
                    if (playerChoice == 2) {
                        System.out.println("Player 2 found the treasure! Player 2 found the treasure after " + dug + " digs! Player 2 wins!");
                    }

                    break;
                }
                if (CheckBombs(b1Row, b1Col, b2Row, b2Col, b3Row, b3Col, gY, gX)) {
                    if (playerChoice == 1) {
                        System.out.print("\nBOOM!!!!!!\n\nYou accidentally set off a land mine!! Game over :(");
                    } else {
                        System.out.println("BOOM!!!!!!\n\nPlayer 2 accidentally set off a land mine. Player 1 wins!!");
                    }
                    break;
                } else {
                    System.out.println("Oops! There's only dirt at (" + gX + ", " + gY + ")");
                    System.out.println("Not quite! The treasure is " + DistanceToTreasure(treY, treX, gY, gX) + " spaces away.");
                }
            }
        }

    public static void printBoard(String[][] gameBoard) {
        System.out.println();
        System.out.println(Arrays.deepToString(gameBoard).replace(",", "").replace("[", "").replace("] ", "\n").replace("[[", "").replace("]]", "")); // Print array
    }
    public static boolean CheckTreasure(int treY, int treX, int gY, int gX) {
        if (gY == treY && gX == treX){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean CheckBombs(int b1Row, int b1Col, int b2Row, int b2Col, int b3Row, int b3Col, int gY, int gX) {
        if (gY == b1Row && gX == b1Col || gY == b2Row && gX == b2Col || gY == b3Row && gX == b3Col) {
            return true;
        } else {
            return false;
        }
    }
    public static int DistanceToTreasure(int treY, int treX, int gY, int gX) {
        return Math.abs(treY - gY) + Math.abs(treX - gX);
    }
}


