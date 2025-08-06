package application;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) {
		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " "); // número da linha
			for (int j = 0; j < pieces[i].length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println(); // quebra de linha depois da linha completa
		}
		System.out.println("  a b c d e f g h"); // letras das colunas
	}

	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("- ");
		} else {
			System.out.print(piece + " ");
		}
	}
}
