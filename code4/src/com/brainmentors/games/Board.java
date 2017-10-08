package com.brainmentors.games;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.brainmentors.games.utils.GameConstants;
import com.brainmentors.games.utils.RandomGenerate;

public class Board extends JPanel implements GameConstants{//,ActionListener {
	private Timer timer;
	ImageIcon bird;
	//Ball ball ;
	Ball balls [];
	public Board(int noOfBalls){
		//ball = new Ball();
		balls = new Ball[noOfBalls];
		prepareBalls();
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setBackground(Color.BLACK);
		
		
		//bird = new ImageIcon(Board.class.getResource("bird.gif"));
		gameLoop();
		
	}
	
	private void traverseBalls(){
		for(int i = 0; i<balls.length-1; i++){
			for(int j = i + 1; j<balls.length; j++){
				if(balls[i].isVisible() && balls[j].isVisible()){
				if(isCollision(balls[i], balls[j])){
					balls[i].setVisible(false);
					balls[j].setVisible(false);
				}
				}
			}
		}
	}
	
	private boolean isCollision(Ball firstBall  , Ball secondBall){
		int xDistance = Math.abs(firstBall.getX()- secondBall.getX());
		int yDistance = Math.abs(firstBall.getY()- secondBall.getY());
		return xDistance<=firstBall.getW() && yDistance<=firstBall.getH();
		
	}
	
	private void prepareBalls(){
		for(int i = 0 ; i<balls.length; i++){
			Ball ball = new Ball();
			balls[i] = ball;
		}
	}
	
	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
	
	private void gameLoop(){
		//timer = new Timer(50,this);
		timer = new Timer(DELAY,(e)->{
			this.repaint();
//			ball.move();
//			ball.changeDirection();
	});
		timer.start();
	}
	
	private void drawBalls(Graphics g){
		for(Ball ball : balls){
			if(ball.isVisible()){
				
			
			ball.drawBall(g);
			ball.move();
			ball.changeDirection();
			traverseBalls();
			}
			}
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		drawBalls(g);
		//ball.drawBall(g);
		
		//System.out.println("Paint Done...");
	}
	
	

	


}
