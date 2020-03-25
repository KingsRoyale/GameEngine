package com.kingsroyale.main;

import java.awt.Graphics;

public abstract class GameObject {

	
	//Any class that extends the GameObject class can access these variables
	protected int x, y;
	protected ID id;
	protected int velX, velY;
	protected boolean shown = true;
	
	public GameObject(int x, int y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setId(ID id) {
		this.id = id;
	}
	
	public ID getId() {
		return id;
	}
	
	public boolean isShown() {
		return shown;
	}
	
	public void setShown(boolean shown) {
		this.shown = shown;
	}
	
	public void setVelX(int velX) {
		this.velX = velX;
	}
	
	public int getVelX() {
		return velX;
	}
	
	public void setVelY(int velY) {
		this.velY = velY;
	}
	
	public int getVelY() {
		return velY;
	}
	
}
