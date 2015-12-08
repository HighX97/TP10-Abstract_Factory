package jeuDeLettre;

public class Game {
	
	private FactLevel level;
	private Encoding enconding;
	private Assistance assitance;
	
	Game(String level) throws Exception
	{
		this.level = FactLevel.getFactory(level);
		this.enconding  = this.level.getEncoding();
		this.assitance  = this.level.getAssistance();
		System.out.println("Game created");
	}

	public FactLevel getLevel() {
		return level;
	}

	public void setLevel(FactLevel level) {
		this.level = level;
	}

	public Encoding getEnconding() {
		return enconding;
	}

	public void setEnconding(Encoding enconding) {
		this.enconding = enconding;
	}

	public Assistance getAssitance() {
		return assitance;
	}

	public void setAssitance(Assistance assitance) {
		this.assitance = assitance;
	}
	

}
