package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        InitialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece)board.pieces(i, j);
            }
        }
        return mat;
    }

    private void InitialSetup(){
        board.PlacePiece(new Rook(board, Color.WHITE), new Position(2,1));
        board.PlacePiece(new King(board, Color.BLACK), new Position(0, 4));
        board.PlacePiece(new King(board, Color.WHITE), new Position(7,4));
    }

}
