package com.tp.beans;

class Point {

	private int x,y;char l;
	
	private void check() {
		if (x<0) x=0; if (y<0) y=0;
	}
	
	void move (int dx, int dy) {
		x+=dx; y+=dy; check();
	}
	
	void set (int xi, int yi) {
		x = xi; y = yi; check();
	}
	
	int getX() {
		return x;
	}
	
	int getY() {
		return y;
	}
	
	void print() {
		System.out.println(x+";"+y+":"+1);
	}
	
	public static void main(String[] args) {
			
		Point pt = new Point();
		pt.print();
		pt.l = 'o';
		pt.set(5,2);
		pt.print();
		pt.move(-6, 4);
		pt.print();
		
		
	}
		
}


