import java.io.*;
public class ID3Reader {
	public static void main(String[] args){
		try{
			File song = new File("C:\\Users\\Kai31\\Desktop\\youve_got_a_friend_james_taylor.mp3"); 
			FileInputStream file = new FileInputStream(song); // inputstream
			int size = (int) song.length(); // converting size in int
			file.skip(size - 128); //Skip all bytes excepts last 128
			byte[] last128 = new byte[128];
			file.read(last128);
			String id3 = new String(last128);
			String tag = id3.substring(0,3);
			if (tag.equals("TAG")){
				System.out.println("Title: " + id3.substring(3,32));
				System.out.println("Artist: " + id3.substring(33,62));
				System.out.println("Album: " + id3.substring(63,91));
				System.out.println("Year: " + id3.substring(92,97));
			}
			else{
				System.out.println("MP3 file does not contain ID3 info.");
			}
			file.close();
			
		}catch(Exception e){
			System.out.println("Error - " + e.toString());
		}
	}
}
