package search;
import search.*;
import wordChess.Step;
import agent.*;

public class WordState implements State {
	
	public StringBuffer word;
	
	
	public void update (Action action) throws RuntimeException {
		Step move = (Step) action;
		if(move.getPos() >= word.length()) throw new RuntimeException("Outside boundaries of word");
		else word.setCharAt(move.getPos(), move.getTo());
	}
  
	public Actions getActions () {
		Actions actions = new Actions();
		WordSmith agent = new WordSmith();
		SnapShot percept = new Snapshot();
		//until word fully cycled
			actions.add(agent.getAction(percept));
	}
  
	public Object clone () {
	  
	}
  
}
