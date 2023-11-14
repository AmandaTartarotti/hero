public class Position {
    private int x; // width
    private int y; //height

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Getters
    public int getX(){ return x;}
    public int getY(){ return y;}

    //Setters
    public void setX(){ this.x = x;}
    public void setY(){ this.y = y;}

    @Override
    public boolean equals(Object o) {
        if(o == null || o.getClass() != this.getClass()) return false;

        return (this == o) || (this.x == ((Position) o).x && this.y == ((Position) o).y);
    }

}
