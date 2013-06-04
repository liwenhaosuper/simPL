package liwenhaosuper.sjtu.simpl.syntax;

public class List extends Expression{
	Expression head;
	Expression tail;	
	
	public String toString(){
		return "[" + head.toString() + ", " + tail.toString() + "]";
	}
}