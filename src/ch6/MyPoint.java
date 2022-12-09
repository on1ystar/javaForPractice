

public class MyPoint {
    private int x;
    private int y;

    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double getDistance(int x, int y){
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

} // 38 / 249p
