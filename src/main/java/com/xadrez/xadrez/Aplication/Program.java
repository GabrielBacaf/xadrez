    package com.xadrez.xadrez.Aplication;

    import com.xadrez.xadrez.chess.ChessException;
    import com.xadrez.xadrez.chess.ChessMatch;
    import com.xadrez.xadrez.chess.ChessPiece;
    import com.xadrez.xadrez.chess.ChessPosition;

    import java.util.InputMismatchException;
    import java.util.Scanner;

    public class Program {
        public static void main(String[] args) {
            ChessMatch chessMatch = new ChessMatch();

            Scanner sc = new Scanner(System.in);
            while (true){
                try {

                    UI.printBoard(chessMatch.getPieces());
                    System.out.println();
                    System.out.print("Source: ");
                    ChessPosition source = UI.readChessPosition(sc);


                    System.out.println();
                    System.out.print("Target: ");
                    ChessPosition target = UI.readChessPosition(sc);

                    ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
                    UI.clearScreen();
                }
                catch (ChessException e){
                    System.out.println(e.getMessage());
                    sc.nextLine();

                }
                catch ( InputMismatchException e) {
                    System.out.println(e.getMessage());
                    sc.nextLine();
                }


            }

        }
    }
