public class Chess_piece { //la classe doit être abstraite
    private int currentPosition ;
    private int type ; 
    private int neighbors[][] = new int [8*8][2]; // tmp

    public Chess_piece() {
        this.type=0;
    }


    public void setType(int type){
        this.type=type;
    }

    public int getType(){
        return this.type;
    }

    public void move( int startingPosition, int finalPosition ) {
        this.currentPosition=finalPosition;
    }

    public void getNeighbor(int startingPosition, int finalPosition ) {

    }

} 