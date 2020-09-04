package boardgame;

public class Piece {

	protected Position position; 	//COMPOSI��O DE OBJETOS: 'UMA PE�A TEM -UMA- POSI��O 
	
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
}
