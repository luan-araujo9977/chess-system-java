package boardgame;

public abstract class Piece {

	protected Position position; 	//POSIÇÃO DA PROPRIA PEÇA; COMPOSIÇÃO DE OBJETOS: 'UMA PEÇA TEM -UMA- POSIÇÃO 

	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMoves(Position position) {			//VERIFICA SE A PEÇA PODE MUDAR PARA A POSIÇÃO INDICADA
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
