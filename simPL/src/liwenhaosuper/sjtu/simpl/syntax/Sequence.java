package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

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
		if(!(e1.eval(rst) instanceof Nop)){
			Util.fatal("Type Error!"+e1.toString()+": it should be a unit type!");
		}
		return e2.eval(rst);
	}
	
	public String toString(){
		return e1.toString() + "; " + e2.toString();
	}
}