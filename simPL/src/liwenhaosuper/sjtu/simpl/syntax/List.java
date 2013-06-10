package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;

public class List extends Expression{
	Expression head;
	Expression tail;	
	
	public List(Expression h,Expression t){
		this.head = h;
		this.tail = t;
	}
	@Override
	public Value eval(RunTimeState rst){
		if(head==null||tail==null){
			return new Nil();
		}
		//Util.log(toString());
		return new ListValue(head.eval(rst),tail.eval(rst));
	}
	@Override
	public String toString(){
		return "[" + head.toString() + " " + tail.toString() + "]";
	}
}