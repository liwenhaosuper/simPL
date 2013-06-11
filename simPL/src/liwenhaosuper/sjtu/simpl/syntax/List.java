package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.runtime.SimPLFatalException;
import liwenhaosuper.sjtu.simpl.runtime.StateFrame;

public class List extends Expression{
	Expression head;
	Expression tail;	
	
	public List(Expression h,Expression t){
		this.head = h;
		this.tail = t;
	}
	@Override
	public Expression nestedReplace(StateFrame sf){
		return new List(head.nestedReplace(sf),tail.nestedReplace(sf));
	}
	@Override
	public Value eval() throws SimPLFatalException{
		if(head==null||tail==null){
			return new Nil();
		}
		//Util.log(toString());
		return new ListValue(head.eval(),tail.eval());
	}
	@Override
	public String toString(){
		return "[" + head.toString() + " " + tail.toString() + "]";
	}
}