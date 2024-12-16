package com.xadrez.xadrez.chess.pieces;

import com.xadrez.xadrez.bordgame.Board;
import com.xadrez.xadrez.bordgame.Piece;
import com.xadrez.xadrez.chess.ChessPiece;
import com.xadrez.xadrez.chess.Color;

public class King extends ChessPiece{
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }


}
