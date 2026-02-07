interface LineRasterizer {
    Point[] rasterize(Point p1, Point p2);
    int dx = Math.abs(p2.x - p1.x);
    int dy = Math.abs(p2.y - p1.y);

}

