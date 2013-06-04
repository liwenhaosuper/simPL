package liwenhaosuper.sjtu.simpl.syntax;

public class AnonymousFunction extends Value{
	Variable arg;
	Expression body;
	
	public String toString(){
		return "fun " + arg.toString() + " -> " + body.toString();
	}
}