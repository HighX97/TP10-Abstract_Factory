package jeuDeLettre;

public class LevelMedium extends FactLevel {

	
	public LevelMedium() {
		System.out.println("LevelMedium created");
	}
	
	@Override
	public Encoding getEncoding() {
		// TODO Auto-generated method stub
		return new EncodingMedium();
	}

	@Override
	public Assistance getAssistance() {
		// TODO Auto-generated method stub
		return new AssitanceMedium();
	}

}
