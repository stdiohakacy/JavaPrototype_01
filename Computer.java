package creational.Prototype._01;

public class Computer implements Cloneable {
	private String os;
	private String office;
	private String antiVirus;
	private String browser;
	private String others;

	public Computer(String os, String office, String antiVirus, String browser, String others) {
		super();
		this.os = os;
		this.office = office;
		this.antiVirus = antiVirus;
		this.browser = browser;
		this.others = others;
	}
	protected Computer clone() {
		try {
			return (Computer) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String toString() {
		return "Computer [os=" + os + ", office=" + office + ", antiVirus=" + antiVirus + ", browser=" + browser
				+ ", others=" + others + "]";
	}
	
	public void setOthers(String others) {
		this.others = others;
	}
}
