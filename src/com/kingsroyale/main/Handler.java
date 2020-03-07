package com.kingsroyale.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {

	LinkedList<GameObject> objects = new LinkedList<GameObject>();
	
	public void tick() {
		for (GameObject object : objects) {
			object.tick();
		}
	}
	
	public void render(Graphics g) {
		for (GameObject object : objects) {
			object.render(g);
		}
	}
	
	public void addObject(GameObject object) {
		this.objects.add(object);
	}
	
	public void removeObject(GameObject object) {
		this.objects.remove(object);
	}
}