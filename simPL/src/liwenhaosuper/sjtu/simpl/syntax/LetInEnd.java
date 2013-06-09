package liwenhaosuper.sjtu.simpl.syntax;

public class LetInEnd extends Expression{
	Variable x;
	Expression definition;
	Expression body;
	
	public LetInEnd(Variable x,Expression def,Expression body){
		this.x = x;
		this.definition = def;
		this.body = body;
	}
	
	public String toString(){
		return "let " + x.toString() + " = " + definition.toString() + " in " + body.toString() + " end";
	}
}