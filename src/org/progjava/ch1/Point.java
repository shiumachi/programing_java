package org.progjava.ch1;

public class Point {

  private double x;
  private double y;
  
  public Point(double x, double y){
    this.setX(x);
    this.setY(y);
  }
  
  public void clear(){
    setX(0.0);
    setY(0.0);
  }
  
  public double distance(Point that){
    return Math.sqrt(Math.pow((this.getX() - that.getX()), 2) + Math.pow((this.getY() - that.getY()), 2)); 
  }
  
  public void move(double x, double y){
    this.setX(x);
    this.setY(y);
  }
  
  public void move(Point that){
    this.setX(that.getX());
    this.setY(that.getY());
  }
  
  public void setX(double x) {
    this.x = x;
  }

  public double getX() {
    return x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getY() {
    return y;
  }
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Point p1 = new Point(1.0, 1.0);
    Point p2 = new Point(2.0, 2.0);
    
    System.out.printf("p1: (%.1f, %.1f)\n", p1.getX(), p1.getY());
    System.out.printf("p2: (%.1f, %.1f)\n", p2.getX(), p2.getY());
    
    double d = p1.distance(p2);
    System.out.printf("%f\n", d);
    
    p1.move(p2);
    System.out.printf("p1: (%.1f, %.1f)\n", p1.getX(), p1.getY());

  }

}
