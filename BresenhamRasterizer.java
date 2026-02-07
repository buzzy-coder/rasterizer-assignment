import java.util.ArrayList;

class BresenhamRasterizer implements LineRasterizer {
    public Point[] rasterize(Point p1, Point p2) {
        ArrayList<Point> points = new ArrayList<>();

        // add starting pixel
        points.add(new Point(p1.x, p1.y));

        return points.toArray(new Point[0]);
    }

}
