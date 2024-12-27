package com.xadrez.xadrez.Aplication;

import com.xadrez.xadrez.chess.ChessMatch;
import com.xadrez.xadrez.chess.ChessPiece;
import com.xadrez.xadrez.chess.ChessPosition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();

        Scanner sc = new Scanner(System.in);
        while (true){
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);


            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);




        }

       }
}
