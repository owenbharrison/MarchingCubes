package marchingcubes;

import processing.core.*;

public class Tri {
	public PApplet papp;
	
  public PVector p0, p1, p2;
  
  public Tri(PApplet pa, PVector a, PVector b, PVector c) {
  	papp = pa;
  	p0 = a;
  	p1 = b;
  	p2 = c;
  }
  
  public PShape getShape() {
  	PShape shape = papp.createShape();
  	shape.beginShape();
  	//shape.stroke(0);
  	shape.fill(255);
  	shape.vertex(p0.x, p0.y);
    shape.vertex(p1.x, p1.y);
    shape.vertex(p2.x, p2.y);
    shape.endShape(PApplet.CLOSE);
  	return shape;
  }
  
  public String toString() {
  	return "[p0: "+p0.toString()+" p1: "+p1.toString()+" p2: "+p2.toString()+"]";
  }
  
  public void show(float scl) {
  	PVector a = PVector.mult(p0, scl);
  	PVector b = PVector.mult(p1, scl);
  	PVector c = PVector.mult(p2, scl);
  	papp.push();
  	papp.beginShape(PApplet.TRIANGLES);
  	papp.vertex(a.x, a.y, a.z);
  	papp.vertex(b.x, b.y, b.z);
  	papp.vertex(c.x, c.y, c.z);
  	papp.endShape();
  	papp.pop();
  }
}
