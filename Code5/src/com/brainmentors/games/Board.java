package com.brainmentors.games;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants{
	
	Image bg;
	Player player;
	Timer timer;
	Enemy enemies [] = new Enemy[MAX_ENEMY];
	public Board(){
		loadImage();
		loadEnemies();
		player = new Player();
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setFocusable(true);
		bindEvents();
		gameLoop();
		
	}
	
	
	private void loadEnemies(){
		int xPos = 100;
		int yPos = 70;
		for(int i = 0 ; i<MAX_ENEMY; i++){
			enemies[i] = new Enemy(xPos, yPos);
			xPos+=200;
		}
	}
	
	private void drawEnemies(Graphics g){
		for(Enemy enemy : enemies){
			enemy.drawEnemy(g);
		}
	}
	
	private void bindEvents(){
		this.addKeyListener(new KeyAdapter() {
			
			
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("Key Release "+e.getKeyCode());
				player.setxSpeed(0);
				player.setySpeed(0);
				player.xacc = player.yacc = 0;
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("Key Press "+e.getKeyCode());
				if(e.getKeyCode()==KeyEvent.VK_SPACE){
					player.fire();
				}
				if(e.getKeyCode()==KeyEvent.VK_UP){
					player.setySpeed(-2);
					player.yacc--;
					//int acc = player.getYacc()+1;
					//player.setYacc(acc);
				}
				else
				if(e.getKeyCode()==KeyEvent.VK_DOWN){
					player.setySpeed(2);
					player.yacc++;
				}
				else
					if(e.getKeyCode()==KeyEvent.VK_LEFT){
						player.setxSpeed(-2);
						player.xacc--;
					}
					else
						if(e.getKeyCode()==KeyEvent.VK_RIGHT){
							player.setxSpeed(2);
							player.xacc++;
						}
				
			}
		});
	}
	
	
	
	private void gameLoop(){
		timer = new Timer(DELAY,(e)->{
			repaint();
			player.move();
		});
		timer.start();
	}
	
	private void loadImage(){
		bg = new ImageIcon(Board.class.getResource(BACKGROUND_IMG)).getImage();
	}
	
	private void drawBackGround(Graphics g){
		g.drawImage(bg, 0, 0, GAME_WIDTH, GAME_HEIGHT, null);
	}
	
	public void paintComponent(Graphics g){
		drawBackGround(g);
		
		drawEnemies(g);
		player.drawPlayer(g);
		player.drawMissiles(g);
	}

}
