package com.brainmentors.games;

import java.awt.Color;
import java.awt.Graphics;

public class Missile extends Sprite implements GameConstants {
	
	public Missile(int x, int y){
		this.x = x;
		this.y = y;
		this.w = this.h = 10;
		this.ySpeed = -10;
		visible = true;
		
	}
	
	public void drawMissile(Graphics g){
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, w, h);
	}
	
	@Override
	public void move() {
		this.y = this.y + this.ySpeed;
		// TODO Auto-generated method stub
		
	}

}
