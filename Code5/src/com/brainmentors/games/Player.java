package com.brainmentors.games;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Player extends Sprite implements GameConstants{
	ArrayList<Missile> missiles = new ArrayList<>();
	public int xacc;
	public int yacc;
	
	public void fire(){
		missiles.add(new Missile((x + w/2), y));
	}
	
	
	public void drawMissiles(Graphics g){
		for(Missile missile : missiles){
			if(missile.isVisible()){
				missile.drawMissile(g);
				missile.move();
			}
		}
	}
	
	
	public Player(){
		
		y = GAME_HEIGHT - 150;
		w = 100;
		h = 100;
		x = GAME_WIDTH/2 - w/2;
		ySpeed = xSpeed = 0;
		image  = new ImageIcon(Player.class.getResource(ROCKET)).getImage();
	}
	
	public int getXacc() {
		return xacc;
	}

	public void setXacc(int xacc) {
		this.xacc = xacc;
	}

	public int getYacc() {
		return yacc;
	}

	public void setYacc(int yacc) {
		this.yacc = yacc;
	}

	public void move(){
		y+=ySpeed+yacc;
		x+=xSpeed+xacc;
	}
	
	public void drawPlayer(Graphics g){
		g.drawImage(image, x, y, w, h, null);
	}

	
	
	

}
