import java.util.ArrayList;

public class ChessEngine1{
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> board = new ArrayList<>();
        for(int i=0; i<8; i++){
            ArrayList<String> rank = new ArrayList<>();                        
            for(int j=0; j<8; j++){
                rank.add("");                
            }
            board.add(rank);
        }

        System.out.println(board);
    }
}
