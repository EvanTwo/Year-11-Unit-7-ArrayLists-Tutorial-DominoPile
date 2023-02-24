import java.util.ArrayList;

public class DominoPile {
    private ArrayList<Domino> pile = new ArrayList<>();

    public DominoPile(){
        pile.clear();
    }

    public void setPile(ArrayList<Domino> pile) {
        this.pile = pile;
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void newStack6(){
        for (int i = 0; i<7; i++){
            for (int j = 0; j<=6; j++){
                if(i != 0 && j == 0){
                    j = j + i;
                }
                Domino domino = new Domino(i,j);
                pile.add(domino);


                }
            }
        }

    public void shuffle() {
        int min = 1;
        int max = 28;

        ArrayList<Domino> newPile = new ArrayList<>();
        while (min < max) {
            newPile.add(pile.get((int)(Math.random() * max + 1)));
            max--;
            newPile.add(pile.get((int)(Math.random() * max + 1)));
            max--;
        }
        setPile(newPile);
    }

}
