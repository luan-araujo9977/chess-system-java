package boardgame;

public abstract class Piece {

	protected Position position; 	//POSI��O DA PROPRIA PE�A; COMPOSI��O DE OBJETOS: 'UMA PE�A TEM -UMA- POSI��O 

	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMoves(Position position) {			//VERIFICA SE A PE�A PODE MUDAR PARA A POSI��O INDICADA
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {		//VERIFICA SE EXISTE PELO MENOS UM MOVIMENTO POSSIVEL
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j] == true) {
					return true;
				}
			}
		}
		return false;
	}
}
