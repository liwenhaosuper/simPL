package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.SimPLFatalException;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;

public class Bracket extends Expression{
	Expression e;
	
	public Bracket(Expression e){
		this.e = e;
	}
	@Override
	public Expression nestedReplace(StateFrame sf){
		return new Bracket(e.nestedReplace(sf));
	}
	@Override
	public Value eval(RunTimeState rst) throws SimPLFatalException{
		return e.eval(rst);
	}
	
	public String toString(){
		return "(" + e.toString() + ")";
	}
}