package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.RunTimeState;
import liwenhaosuper.sjtu.simpl.util.Util;

public class BinaryOperation extends Expression{
	public enum BinaryOperator{
		plus, minus, times, devide, biggerThan, lessThan, equal, and, or
	}
	
	Expression e1;
	Expression e2;
	BinaryOperator op;
	
	public BinaryOperation(){
		
	}
	public BinaryOperation(Expression ea,Expression eb,BinaryOperator o){
		this.e1 = ea;
		this.e2 = eb;
		this.op = o;
	}
	@Override
	public Value eval(RunTimeState rst){
		Value a = e1.eval(rst);
		Value b = e2.eval(rst);
		if(a instanceof IntValue && b instanceof IntValue){//intValue+intValue
			switch(this.op){
			case plus:
				return new IntValue(((IntValue)a).getInt()+((IntValue)b).getInt());
			case minus:
				return new IntValue(((IntValue)a).getInt()-((IntValue)b).getInt());
			case times:
				return new IntValue(((IntValue)a).getInt()*((IntValue)b).getInt());
			case devide:
				return new IntValue(((IntValue)a).getInt()/((IntValue)b).getInt());
			case biggerThan:
				if(((IntValue)a).getInt()> ((IntValue)b).getInt()){
					return new BoolValue(true);
				}else{
					return new BoolValue(false);
				}
			case lessThan:
				if(((IntValue)a).getInt()< ((IntValue)b).getInt()){
					return new BoolValue(true);
				}else{
					return new BoolValue(false);
				}
			case equal:
				if(((IntValue)a).getInt()==((IntValue)b).getInt()){
					return new BoolValue(true);
				}else{
					return new BoolValue(false);
				}
			case and:
				if((((IntValue)a).getInt()&((IntValue)b).getInt())!=0){
					return new BoolValue(true);
				}else{
					return new BoolValue(false);
				}
			case or:
				if((((IntValue)a).getInt()|((IntValue)b).getInt())!=0){
					return new BoolValue(true);
				}else{
					return new BoolValue(false);
				}
			}
			
		}
		Util.fatal("Type Error:"+toString0());
		return null;
	}
	@Override
	public String toString(){
		return toString0();
	}
	
	public String toString0(){
		String operator = "";
		switch(this.op){
		case plus:
			operator = "+"; break;
		case minus:
			operator = "-"; break;
		case times:
			operator = "*"; break;
		case devide:
			operator = "/"; break;
		case biggerThan:
			operator = ">"; break;
		case lessThan:
			operator = "<"; break;
		case equal:
			operator = "="; break;
		case and:
			operator = "and"; break;
		case or:
			operator = "or"; break;
		}
		return e1.toString() + " " + operator + " " + e2.toString();
	}
	
}