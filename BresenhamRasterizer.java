import java.util.ArrayList;

class BresenhamRasterizer implements LineRasterizer {
    public Point[] rasterize(Point p1, Point p2) {
        ArrayList<Point> points = new ArrayList<>();

        // add starting pixel
        points.add(new Point(p1.x, p1.y));

        return points.toArray(new Point[0]);
        int dx = Math.abs(p2.x - p1.x);
        int dy = Math.abs(p2.y - p1.y);

        int sx = (p1.x < p2.x) ? 1 : -1;
        int sy = (p1.y < p2.y) ? 1 : -1;

    }

}
