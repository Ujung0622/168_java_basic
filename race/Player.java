package race;

public class Player {
	
	private String name;
	private int rec;
	
	public void setName (String name) {
		this.name = name;
	}
	public String getName () {
		return this.name;
	}
	public void setRec (int rec) {
		this.rec = rec;
	}
	public int getRec () {
		return this.rec;
	}

	public void printStates() {
	System.out.println( name + " ������ ����� " + rec + "�� �Դϴ�.");
	}

}

	
