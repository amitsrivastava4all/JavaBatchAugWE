package com.srivastava.games;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player implements GameConstants{
	private int x;
	private int y;
	private int w;
	private int h;
	private BufferedImage image;
	private int speed;
	int force ;
	final int GRAVITY = 1;
	private boolean isJump ;
	
	
	public Player(){
		loadSprite();
		x = 100;
		w = h = 100;
		y = FLOOR - h;
		
		
	}
	
	public void jump(){
		if(!isJump){
		force = -20;
		y = y + force;
		
		isJump = true;
		}
		}
	
	public void fall(){
		if(y<FLOOR-h){
			force = force + GRAVITY;
			y +=force;
		}
		if(y>=FLOOR-h){
			isJump = false;
			y = FLOOR-h;
		}
	}
	
	
	public void drawPlayer(Graphics g){
		BufferedImage img = image.getSubimage(8,111, 32, 86);
		g.drawImage(img, x, y, w, h, null);
	}
	
	private void loadSprite(){
		try{
		image = ImageIO.read(Player.class.getResource(PLAYER_SPRITE)); // throw new IOException();
		}
		catch(IOException e){
			System.out.println("Player Sprite Can't Loaded...");
			System.exit(0);
		}
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getW() {
		return w;
	}


	public void setW(int w) {
		this.w = w;
	}


	public int getH() {
		return h;
	}


	public void setH(int h) {
		this.h = h;
	}


	public BufferedImage getImage() {
		return image;
	}


	public void setImage(BufferedImage image) {
		this.image = image;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void move(){
		x+=speed;
	}
	
	

}
