package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.SimPLFatalException;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

public class Expression{

	public Value eval() throws SimPLFatalException{
		Util.fatal("Subclass should override funciton eval!");
		return null;
	}
	/**
	 * replace variable to value,this is useful for nested expressions
	 * according to my observation, the return object should be a copy
	 * of the origin one, not a reference! 
	 * @param sf
	 * @return
	 */
	public Expression nestedReplace(StateFrame sf){
		//Util.fatal("Subclass should override funciton nestedReplace!");
		return this;
	}
}