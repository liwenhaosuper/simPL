package liwenhaosuper.sjtu.simpl.syntax;

public class List extends Expression{
	Expression head;
	Expression tail;	
	
	public List(Expression h,Expression t){
		this.head = h;
		this.tail = t;
	}
	
	public String toString(){
		return "[" + head.toString() + ", " + tail.toString() + "]";
	}
}