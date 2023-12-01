public class Position {
    private int x; // width
    private int y; //height

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Position getLeft() {
        return new Position(x - 1, y);
    }

    public Position getRight() {
        return new Position(x + 1, y);
    }

    public Position getUp() {
        return new Position(x, y - 1);
    }

    public Position getDown() {
        return new Position(x, y + 1);
    }

    public Position getRandomNeighbour() {
        int n = (int) (Math.random() * 4);
        switch (n) {
            case 0:
                return getUp();
            case 1:
                return getRight();
            case 2:
                return getDown();
            default:
                return getLeft();
        }
    }

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
