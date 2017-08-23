import java.io.File;
import java.io.IOException;

import jaco.mp3.player.MP3Player;

public class Mp3Demo {

	public static void main(String[] args) throws Exception{
		// e.g c:\\xyz\\songs\\pop.mp3
		//int x = 109/0;
		int duration = 2000;
		String songs[]={"/Users/amit/Documents/songs/pop.mp3","/Users/amit/Documents/songs/A.mp3","/Users/amit/Documents/songs/E.mp3"};
		for(String song : songs){
		File path = new File(song);
		MP3Player mp3 = new MP3Player(path);
		mp3.play();
		
		Thread.sleep(duration);
		duration = duration + 3500;
		//int e = System.in.read();
		mp3.stop();
		System.out.println("Done...");
		}

	}

}
