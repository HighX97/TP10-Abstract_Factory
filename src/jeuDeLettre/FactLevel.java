package jeuDeLettre;


public abstract class FactLevel 
{
	

	public static FactLevel getFactory(String level) throws Exception {
		switch (level) {
        case "Easy":
        	System.out.println("Game Level : Easy.");
        	return new LevelEasy();
		case "Medium":
        	System.out.println("Game Level : Easy.");
        	return new LevelMedium();
        case "Hard":
        	System.out.println("Game Level : Easy.");
        	return new LevelHard();
        default:
            throw new Exception("Unknow Level: " + level + "Extend the framework to support it");
    }
	}
	
	public abstract Encoding getEncoding();
	public abstract Assistance getAssistance();


}
