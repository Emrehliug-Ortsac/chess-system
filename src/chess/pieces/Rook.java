package chess.pieces;

import boardgame.Board;
import chess.ChessColor;
import chess.ChessPiece;

public class Rook extends ChessPiece{

	public Rook(Board board, ChessColor color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}
	
}