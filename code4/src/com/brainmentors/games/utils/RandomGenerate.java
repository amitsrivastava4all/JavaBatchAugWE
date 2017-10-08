package com.brainmentors.games.utils;

import java.io.IOException;
import java.util.Random;

public class RandomGenerate {
	private Random random;
	private int range;
	public RandomGenerate(int randomRange){
		this.range = randomRange;
		random = new Random(randomRange);
	}
	public int getRandomNumber(){
		int result = random.nextInt(range);
		return result==0?1:result;
	}
	
//	public static void main(String[] args) throws IOException {
//		RandomGenerate r = new RandomGenerate(10);
//		while(true){
//			System.out.println(r.getRandomNumber());
//			System.in.read();
//		}
//	}

}
