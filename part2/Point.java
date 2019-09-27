class Point
{
   private double x;
   private double y;

   public Point(double x, double y) {
      this.x = x;
      this.y = y;
   }
   
   public double getX() {
      return this.x;
   }
   
   public double getY() {
      return this.y;
   }
   
   public double getRadius() {
      return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
   }

   public double getAngle() {
      return Math.atan(this.y / this.x);
   }

   public Point rotate90() {
      return new Point(-1 * this.y, this.x);
   }
}
