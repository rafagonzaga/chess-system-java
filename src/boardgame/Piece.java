package boardgame;

public class Piece {

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
}
