package com.srivastava.games;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player implements GameConstants, PlayerStates{
	private int x;
	private int y;
	private int w;
	private int h;
	private BufferedImage image;
	private int speed;
	int force ;
	final int GRAVITY = 1;
	private boolean isJump ;
	private int currentAction ;
	
	public Player(){
		loadSprite();
		defaultArray = defaultMoveImages();
		punchArray = loadPunchImages();
		kickArray = kickImages();
		x = 100;
		w = h = 100;
		y = FLOOR - h;
		currentAction = DEFAULT;
		
	}
	
	
	
	public int getCurrentAction() {
		return currentAction;
	}



	public void setCurrentAction(int currentAction) {
		this.currentAction = currentAction;
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
	
	
	private BufferedImage[] defaultMoveImages(){
		BufferedImage[] buf = new BufferedImage[5];
		buf[0] = image.getSubimage(3,111,38,84);
		buf[1] = image.getSubimage(74,107,37,88);
		buf[2] = image.getSubimage(135,104,41,90);
		buf[3] = image.getSubimage(201,109,38,85);
		buf[4] = image.getSubimage(267,103,35,88);
		return buf;
	}
	
	private BufferedImage[] loadPunchImages(){
		BufferedImage[] buf = new BufferedImage[3];
		buf[0] = image.getSubimage(5,201,38,86);
		buf[1] = image.getSubimage(61,203,57,85);
		buf[2] = image.getSubimage(140,204,41,85);
		
		return buf;
	}
	int punchIndex =0;
	private BufferedImage punchArray[];
	public void punch(Graphics g){
		slowDown++;
		g.drawImage(punchArray[punchIndex], x, y, w,h,null);
		if(slowDown>2){
			punchIndex++;
		slowDown=0;
		}
		
		if(punchIndex>=2){
			punchIndex=0;
			currentAction = DEFAULT;
			currentMoveIndex = 0;
			
		}
	}
	
	
	private BufferedImage kickArray[];
	private BufferedImage[] kickImages(){
		BufferedImage[] buf = new BufferedImage[4];
		buf[0] = image.getSubimage(5,309,37,87);
		buf[1] = image.getSubimage(69,311,41,88);
		buf[2] = image.getSubimage(133,305,70,91);
		buf[3] = image.getSubimage(225,309,41,85);
		
		return buf;
	}
	
	int kickIndex =0;
	
	public void kick(Graphics g){
		slowDown++;
		g.drawImage(kickArray[kickIndex], x, y, w,h,null);
		if(slowDown>2){
			kickIndex++;
		slowDown=0;
		}
		
		if(kickIndex>=3){
			kickIndex=0;
			currentAction = DEFAULT;
			currentMoveIndex = 0;
			
		}
	}
	
	private BufferedImage defaultArray[];
	int currentMoveIndex = 0;
	int slowDown =0;
	public void defaultMove(Graphics g){
		slowDown++;
		g.drawImage(defaultArray[currentMoveIndex], x, y, w,h,null);
		if(slowDown>2){
		currentMoveIndex++;
		slowDown=0;
		}
		
		if(currentMoveIndex>=4){
			currentMoveIndex=0;
		}
	}
	
	
	
	public void drawPlayer(Graphics g){
		if(currentAction==DEFAULT){
		defaultMove(g);
		}
		else
		if(currentAction==KICK){	
			kick(g);
		}
		else
		if(currentAction==PUNCH){
			punch(g);
		}
		//BufferedImage img = image.getSubimage(8,111, 32, 86);
		//g.drawImage(img, x, y, w, h, null);
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
