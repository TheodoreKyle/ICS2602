import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;

public class ChessFX extends Application {

    private static final int TILE_SIZE = 80;
    private static final int SIZE = 8;
    private Piece[][] board = new Piece[SIZE][SIZE];
    private StackPane[][] tiles = new StackPane[SIZE][SIZE];
    private int selectedRow = -1, selectedCol = -1;
    private String currentTurn = "white";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setGridLinesVisible(true);

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                StackPane cell = new StackPane();
                cell.setPrefSize(TILE_SIZE, TILE_SIZE);
                Color color = (row + col) % 2 == 0 ? Color.BEIGE : Color.BROWN;
                cell.setBackground(new Background(new BackgroundFill(color, null, null)));
                final int r = row, c = col;
                cell.setOnMouseClicked(e -> handleClick(r, c));
                grid.add(cell, col, row);
                tiles[row][col] = cell;
            }
        }

        setupPieces();
        drawBoard();

        primaryStage.setTitle("ChessFX");
        primaryStage.setScene(new Scene(grid));
        primaryStage.show();
    }

    private void setupPieces() {
        for (int i = 0; i < SIZE; i++) {
            board[1][i] = new Piece("black", "♟");
            board[6][i] = new Piece("white", "♙");
        }

        String[] order = {"♜", "♞", "♝", "♛", "♚", "♝", "♞", "♜"};
        for (int i = 0; i < SIZE; i++) {
            board[0][i] = new Piece("black", order[i]);
            board[7][i] = new Piece("white", order[i].replace('♛', '♕').replace('♚', '♔'));
        }
    }

    private void drawBoard() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                tiles[row][col].getChildren().clear();
                Piece p = board[row][col];
                if (p != null) {
                    Label lbl = new Label(p.symbol);
                    lbl.setFont(Font.font(36));
                    tiles[row][col].getChildren().add(lbl);
                }
            }
        }
    }

    private void handleClick(int row, int col) {
        Piece clicked = board[row][col];

        if (selectedRow == -1 && clicked != null && clicked.color.equals(currentTurn)) {
            selectedRow = row;
            selectedCol = col;
            tiles[row][col].setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, null, null)));
        } else if (selectedRow != -1) {
            Piece selected = board[selectedRow][selectedCol];
            if (selected != null && (board[row][col] == null || !board[row][col].color.equals(currentTurn))) {
                board[row][col] = selected;
                board[selectedRow][selectedCol] = null;
                currentTurn = currentTurn.equals("white") ? "black" : "white";
            }
            resetTileColors();
            drawBoard();
            selectedRow = selectedCol = -1;
        }
    }

    private void resetTileColors() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                Color color = (row + col) % 2 == 0 ? Color.BEIGE : Color.BROWN;
                tiles[row][col].setBackground(new Background(new BackgroundFill(color, null, null)));
            }
        }
    }

    static class Piece {
        String color;
        String symbol;

        Piece(String color, String symbol) {
            this.color = color;
            this.symbol = symbol;
        }
    }
}