package chess.pieces;

import boardgame.Board;
import chess.ChessColor;
import chess.ChessPiece;

public class King extends ChessPiece{

	public King(Board board, ChessColor color) {
		super(board, color);
	}
	
	public String toString() {
		return "K";
	}

}