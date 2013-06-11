package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.Memory;
import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.SimPLFatalException;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;
import liwenhaosuper.sjtu.simpl.util.Util;

public class LetInEnd extends Expression{
	Variable x;
	Expression definition;
	Expression body;
	
	public LetInEnd(Variable x,Expression def,Expression body){
		this.x = x;
		this.definition = def;
		this.body = body;
	}
	@Override
	public Expression nestedReplace(StateFrame sf){
		return new LetInEnd(x/*.nestedReplace(sf)*/,definition.nestedReplace(sf),body.nestedReplace(sf));
	}
	@Override
	public Value eval() throws SimPLFatalException{
		StateFrame nst = new StateFrame();
		Integer addr = Memory.getInstance().allocate(definition.eval());
		nst.put(x.name, addr);
		Util.env().popin(nst);
		Value res = body.eval();
		Util.env().popout();
		return res;
	}
	public String toString(){
		//return eval().toString();
		return "let " + x.toString() + " = " + definition.toString() + " in " + body.toString() + " end";
	}
}