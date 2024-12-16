package com.xadrez.xadrez.Aplication;

import com.xadrez.xadrez.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
       }
}
