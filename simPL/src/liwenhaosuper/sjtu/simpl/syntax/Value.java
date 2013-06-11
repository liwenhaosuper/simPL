package liwenhaosuper.sjtu.simpl.syntax;

import liwenhaosuper.sjtu.simpl.runtime.StateFrame;

public class Value extends Expression{
	@Override
	public Expression nestedReplace(StateFrame sf){
		return this;
	}
}