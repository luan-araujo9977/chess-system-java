package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {	
	
	private Board board;
	
	public ChessMatch() {			
		board = new Board(8, 8);		//CRIANDO UM TABULEIRO
		initialSetup();				//CHAMANDO E EXECUTANDO O METODO INITIALSETUP
	}
	
	public ChessPiece[][] getPiece(){		//METODO RETORNA UMA MATRIZ CHESS-PIECE
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()]; 
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);		  //DOWNCASTING DO METODO PIECE DA CLASSE BOARD QUE-
			}													  //RETORNA UMA MATRIZ DO TIPO 'PIECE'
		}
		return mat;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
	}
}
