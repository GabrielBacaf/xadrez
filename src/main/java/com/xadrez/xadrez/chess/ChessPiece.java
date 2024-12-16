package com.xadrez.xadrez.chess;

import com.xadrez.xadrez.bordgame.Board;
import com.xadrez.xadrez.bordgame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
