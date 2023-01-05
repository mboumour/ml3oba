
class Game {

    int lengh=8;
    int width=8;

    Chess_piece chessBoard[][]=new Chess_piece[lengh][width];

    public boolean is_occupied(int i, int j) { // to simplified
        if (chessBoard[i][j].getType() != 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void printChessBoard() {
        for (int i=0; i<lengh; i++) {
            for (int j=0; j<width; j++) {
                if (this.is_occupied(i,j)) {
                    System.out.print("o "); 
                }
                else  {
                    System.out.print("x "); 
                }
            }    
            System.out.println("");
        }
    }

    
    static public void main(String args[]) {
        Game G= new Game();
        for (int i=0; i<8; i++) { // 8 : to modifie 
            for (int j=0; j<8; j++) {  // 8 : to modifie
                G.chessBoard[i][j]= new Chess_piece();
            }
        }
        G.chessBoard[1][1].setType(1);
        G.printChessBoard();

    }
}

