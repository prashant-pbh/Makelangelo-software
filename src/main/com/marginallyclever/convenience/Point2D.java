package com.marginallyclever.convenience;

public class Point2D {
	public double x,y;
	
	public Point2D() {}
	public Point2D(double x0,double y0) {
		x=x0;
		y=y0;
	}
	
	public void set(double x0,double y0) {
		x=x0;
		y=y0;
	}
	public void set(Point2D p) {
		x=p.x;
		y=p.y;
	}
	public double lengthSquared() {
		return x*x+y*y;
	}
	
	public double length() {
		return Math.sqrt(lengthSquared());
	}
	
	public void scale(double scale) {
		x*=scale;
		y*=scale;
	}
}
