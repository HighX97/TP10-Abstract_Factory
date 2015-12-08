package jeuDeLettre;

public class LevelHard extends FactLevel {

	
	public LevelHard() {
		System.out.println("LevelHard created");
	}
	
	@Override
	public Encoding getEncoding() {
		// TODO Auto-generated method stub
		return new EncodingHard();
	}

	@Override
	public Assistance getAssistance() {
		// TODO Auto-generated method stub
		return new AssitanceHard();
	}

}
