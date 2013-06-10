package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;

public class Sequence extends Expression{
	Expression e1;
	Expression e2;

	public Sequence(Expression e1,Expression e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	@Override
	public Expression nestedReplace(StateFrame sf){
		return new Sequence(e1.nestedReplace(sf),e2.nestedReplace(sf));
	}
	@Override
	public Value eval(RunTimeState rst){
		e1.eval(rst);
		return e2.eval(rst);
	}
	
	public String toString(){
		return e1.toString() + "; " + e2.toString();
	}
}