package liwenhaosuper.sjtu.simpl.jacc;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import liwenhaosuper.sjtu.simpl.syntax.IntValue;

public class SimPLLexer implements SimPLTokens{
	private int c =  ' ';
	private int token;
	private Object yylval;
	private static final Map<String, Integer> KEYWORDS;
	private InputStream input;
	static {
		KEYWORDS = new HashMap<String, Integer>();
		KEYWORDS.put("FUN", FUN);
		KEYWORDS.put("LET", LET);
		KEYWORDS.put("IN", IN);
		KEYWORDS.put("END", END);
		KEYWORDS.put("IF",IF);
		KEYWORDS.put("THEN",THEN);
		KEYWORDS.put("ELSE",ELSE);
		KEYWORDS.put("WHILE",WHILE);
		KEYWORDS.put("DO",DO);
		KEYWORDS.put("NIL",NIL);
		KEYWORDS.put("FST",FST);
		KEYWORDS.put("SND",SND);
		KEYWORDS.put("HEAD",HEAD);
		KEYWORDS.put("TAIL",TAIL);
		KEYWORDS.put("AND",AND);
		KEYWORDS.put("OR",OR);
		KEYWORDS.put("NOT",NOT);
	}
	/** Read a single input character from standard input.*/
	private void nextChar() {
  		if (c>=0) {
    		try {
      			c = System.in.read();
    		} catch (Exception e) {
    			c = (-1);
    		}
  		}
	}
	public void error(String msg){
		System.out.println("Syntax Error! " + msg);
		System.exit(1);
	}
	public SimPLLexer(InputStream in){
		this.input = in;
	}
    /** Return the token code for the current lexeme.
     */
    int getToken() {
      return token;
    }
    public Object getSemantic() {
    	return yylval;
    }
	/** Read the next token and return the
     *  corresponding integer code.
     */
    int nextToken() {
    	boolean inComment = false;
    	for (;;) {
    		if(inComment){
    			while (c != '*' && c != -1) {
    				nextChar();
    			}
    			if (c == '*') {
    				nextChar();
    				if (c == ')') {
    					nextChar();
    					inComment = false;
    				}
    				continue;
    			}
    		}
    		
    		// Skip whitespace
    		while (c==' ' || c=='\n' || c=='\t' || c=='\r') {
    			nextChar();
    		}	
    		if (c<0) {
    			return (token=ENDINPUT);
    		}
    		switch (c) {
    		case '+' : nextChar();
            	return token='+';
    		case '-' : {
    			nextChar();
    			if(c=='>'){
    				nextChar();
    				return token = ALLOW;
    			}
    			return token='-';
    		}
    		case '*' : nextChar();
                return token='*';
    		case '/' : nextChar();
                return token='/';
    		case '(' : nextChar();
                return token='(';
    		case ')' : nextChar();
                return token=')';
    		case ';' : nextChar();
                return token=';';
    		case '[': nextChar(); 
    			return token = '[';
    		case ']': nextChar();
    			return token = ']';
    		case '~': nextChar(); 
    			return token = '~';
    		case '>':nextChar();
    			return token = '>';
    		case '<':nextChar();
    			return token = '<';
    		case ':':{
    			nextChar();
    			if(c=='='){
    				nextChar();
    				return token = COLONEQUAL;
    			}else if(c==':'){
    				nextChar();
    				return token = COLONCOLON;
    			}
    			error("Unexpected character: "+c);
    		}
    		case ',': nextChar();
    			return token = ',';
    		default:
    			if (Character.isDigit(c)) {
    				int n = 0; 
    				do {
    					n = 10 * n + (c - '0');
    					nextChar(); 
    				}while(Character.isDigit(c));
    				yylval = new IntValue(n);
    			}
    		}
      }
    }
}
