package creational.Prototype._01;

public class Client {
	public static void main(String[] args) {
		Computer com1 = new Computer("WIN10", "MS", "BKAV", "CHROME", "SKYPE");
		Computer com2 = com1.clone();
		com2.setOthers("Team viewer");
		
		System.out.println(com1);
		System.out.println(com2);
	}
}
