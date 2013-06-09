package liwenhaosuper.sjtu.simpl.syntax;

public class Variable extends Expression{
	String name;
	
	public Variable(String nm){
		this.name = nm;
	}
	
	public String toString(){
		return name;
	}
}