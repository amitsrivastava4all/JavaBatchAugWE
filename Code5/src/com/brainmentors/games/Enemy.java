package com.brainmentors.games;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Enemy extends Sprite implements GameConstants {
	
	public Enemy(int x , int y){
		this.x = x ;
		this.y = y;
		this.w = this.h = 100;
		image = new ImageIcon(Enemy.class.getResource(ENEMY)).getImage();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	public void drawEnemy(Graphics g){
		g.drawImage(image, x, y, w, h, null);
	}

}
