package com.brainmentors.games;

import java.awt.Color;
import java.awt.Graphics;

import com.brainmentors.games.utils.GameConstants;
import com.brainmentors.games.utils.RandomGenerate;

public class Ball implements GameConstants {
	private int x;
	private int y;
	private int h;
	private int w;
	private int xSpeed;
	private int ySpeed;
	private Color color;
	private static RandomGenerate xRandom;
	private static RandomGenerate yRandom ;
	private static RandomGenerate r;
	private static RandomGenerate red;
	private static RandomGenerate green;
	private static RandomGenerate blue;
	private boolean isVisible = true;
	
	
	
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	private static final int FIX_SPEED = 5;
	static{
		red = new RandomGenerate(120);
		green = new RandomGenerate(170);
		blue = new RandomGenerate(150);
		xRandom = new RandomGenerate(GAME_WIDTH);
		yRandom = new RandomGenerate(GAME_HEIGHT);
		r = new RandomGenerate(FIX_SPEED);
		colorCounter = 1;
	}
	private static int colorCounter ;
	public Color prepareColor(){
		
		Color color = Color.YELLOW;
		switch(colorCounter){
		case 1:
			color = Color.RED;
			break;
		case 2:
			color = Color.GREEN;
			break;
		case 3:
			color = Color.YELLOW;
			break;
		case 4:
			color = Color.ORANGE;
			break;
		case 5:
			color = Color.BLUE;
			break;
		case 6:
			color = Color.MAGENTA;
			break;
		case 7:
			color = Color.WHITE;
			break;
		}
		if(colorCounter>7){
			colorCounter = 0;
		}
		colorCounter++;
		
		return color;
	}
	public Ball(){
		x = xRandom.getRandomNumber();
		y = yRandom.getRandomNumber();
		xSpeed = ySpeed = r.getRandomNumber(); 
				
		w = h = 50;
		//color = new Color(red.getRandomNumber(), green.getRandomNumber(), blue.getRandomNumber());
		color = prepareColor();
	}
	
	public void move(){
		x+=xSpeed;
		y+=ySpeed;
	}
	public void changeDirection(){
		if(x>=(GAME_WIDTH-w)){
			xSpeed =  -r.getRandomNumber() ;
		}
		else
		if(x<=0){
			xSpeed = r.getRandomNumber();
		}
		else
		if(y>=(GAME_HEIGHT-h)){	
			ySpeed =  -r.getRandomNumber() ;
		}
		else
		if(y<=0){
			ySpeed =  r.getRandomNumber() ;
		}
	}
	
	
	public void drawBall(Graphics g){
		//g.drawImage(bird.getImage(), x, 100, 50,50,null);
		g.setColor(color);
		g.fillOval(x, y, w, h);
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
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	public int getySpeed() {
		return ySpeed;
	}
	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public RandomGenerate getxRandom() {
		return xRandom;
	}
	public void setxRandom(RandomGenerate xRandom) {
		this.xRandom = xRandom;
	}
	public RandomGenerate getyRandom() {
		return yRandom;
	}
	public void setyRandom(RandomGenerate yRandom) {
		this.yRandom = yRandom;
	}
	
	

}
