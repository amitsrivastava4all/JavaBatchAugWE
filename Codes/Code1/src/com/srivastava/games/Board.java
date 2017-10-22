package com.srivastava.games;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants{
	private Image image ;
	private Timer timer;
	private Player player;
	public Board(){
		loadImages();
		player = new Player();
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setFocusable(true);
		bindEvents();
		gameLoop();
	}
	
	
	private void bindEvents(){
		this.addKeyListener(new KeyAdapter() {
		@Override	
		public void keyPressed(KeyEvent e){
			if(e.getKeyCode()==KeyEvent.VK_RIGHT){
				player.setSpeed(3);
			}
			else
			if(e.getKeyCode()==KeyEvent.VK_UP){	
				player.jump();
			}
		}
		@Override
		public void keyReleased(KeyEvent e){
			player.setSpeed(0);
		}
		});
	}
	
	private void gameLoop(){
		timer = new Timer(DELAY,(e)->{
			repaint();
			player.move();
			player.fall();
		});
		timer.start();
	}
	
	private void drawBackGround(Graphics g){
		g.drawImage(image, 0, 0, GAME_WIDTH, GAME_HEIGHT, null);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		drawBackGround(g);
		player.drawPlayer(g);
	}
	
	private void loadImages(){
		image = new ImageIcon(Board.class.getResource(BACKGROUND_IMAGE)).getImage();
	}
	
}
