package com.xadrez.xadrez.chess;

import com.xadrez.xadrez.bordgame.Board;
import com.xadrez.xadrez.bordgame.Position;
import com.xadrez.xadrez.chess.pieces.King;
import com.xadrez.xadrez.chess.pieces.Rook;


public class ChessMatch {

    private Board board;

    public ChessMatch() {
       board = new Board(8,8);
       initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++ ) {
                    mat[i][j] = (ChessPiece) board.piece(i, j);
                }
            }
        return mat;
        }

        private void initialSetup(){
            board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
            board.placePiece(new Rook(board, Color.BLACK), new Position(2, 8));
            board.placePiece(new King(board, Color.WHITE), new Position(7, 4));

        }
}
