package jeuDeLettre;

public class LevelEasy extends FactLevel {
	
	public LevelEasy() {
		System.out.println("LevelEasy created");
	}

	@Override
	public Encoding getEncoding() {
		// TODO Auto-generated method stub
		return new EncodingEasy();
	}

	@Override
	public Assistance getAssistance() {
		// TODO Auto-generated method stub
		return new AssitanceEasy();
	}

}
