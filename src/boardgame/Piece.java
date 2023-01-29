package boardgame;

public abstract class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // Esse null não seria necessário, pois já é o padrão atribuir null.
    }

    // Protected pois somente classes dentro do mesmo pacote e subclasses é
    // que vão poder acessar o tabuleiro de uma peça
    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    // Hook method. Pode ser concreto pq está chamando uma possível implementação
    // de alguma subclasse concreta da classe Piece. Ver template method
    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
