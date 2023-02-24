public class Domino {

    private int top;
    private int bottom;

    public Domino() {
        top = 0;
        bottom = 0;
    }
    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }
    public void setTop(int top) {
        this.top = top;
    }
    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }
    public String toString() {
        return this.top + "/" + this.bottom;
    }
    public void flip(){
        int x;
        x = top;
        top = bottom;
        bottom = x;
    }
    public void settle(){
        if (bottom < top){
            flip();
        }
    }
    public int compareTo(Domino other) {
        this.settle();
        other.settle();

        if(this.top < other.top){
            return -1;
        }
        else if(this.top > other.top){
            return 1;
        }
        else {
            if (this.bottom < other.bottom){
                return -1;
            }
            else if(this.bottom > other.bottom){
                return 1;
            }
            else
                return 0;
        }

    }


    public boolean canConnect(Domino other){
        return (this.top == other.top) || (this.top == other.bottom) || (this.bottom == other.top) || (this.bottom == other.bottom);
    }

}
