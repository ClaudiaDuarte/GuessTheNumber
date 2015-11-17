package games;

public class Player {
	
	private int hint;
	

	public int getHint() {
		return hint;
	}

	
	public void generateHint(){
		
		this.hint = (int) (Math.random() * 10);
	}
	
	
	

}
