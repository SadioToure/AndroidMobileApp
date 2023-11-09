public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point otherPoint) {
        int x1 = this.x;
        int y1 = this.y;
        int x2 = otherPoint.x;
        int y2 = otherPoint.y;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(6, 8);

        double dist = point1.distance(point2);
        System.out.println("Distance entre les deux points: " + dist);
    }
}
