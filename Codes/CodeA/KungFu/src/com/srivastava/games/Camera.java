package com.srivastava.games;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Camera implements GameConstants {
	private int x ;
	private int y;
	private int w;
	private int h;
	private int speed;
	
	public Camera(){
		x = 0;
		y = 0;
		w = GAME_WIDTH;
		h = GAME_HEIGHT;
		speed = 2;
		loadBG();
	}
	private BufferedImage buf;
	private void loadBG(){
		try {
			buf = ImageIO.read(Camera.class.getResource(BACKGROUND_IMAGE));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void move(){
		x+=speed;
	}
	
	public void drawBG(Graphics g){
		BufferedImage subImage = buf.getSubimage(x, y, w, h);
		g.drawImage(subImage,0,0,GAME_WIDTH,GAME_HEIGHT,null);
	}

}
