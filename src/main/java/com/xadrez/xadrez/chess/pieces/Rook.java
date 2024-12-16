package com.xadrez.xadrez.chess.pieces;

import com.xadrez.xadrez.bordgame.Board;
import com.xadrez.xadrez.chess.ChessPiece;
import com.xadrez.xadrez.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
