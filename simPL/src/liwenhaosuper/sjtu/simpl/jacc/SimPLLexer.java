package liwenhaosuper.sjtu.simpl.jacc;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import liwenhaosuper.sjtu.simpl.syntax.BoolValue;
import liwenhaosuper.sjtu.simpl.syntax.IntValue;
import liwenhaosuper.sjtu.simpl.syntax.Variable;

public class SimPLLexer implements SimPLTokens{
	private int c =  ' ';
	private int token;
	private Object yylval;
	private int line,column;
	private static final Map<String, Integer> KEYWORDS;
	private InputStream input;
	static {
		KEYWORDS = new HashMap<String, Integer>();
		KEYWORDS.put("fun", FUN);
		KEYWORDS.put("let", LET);
		KEYWORDS.put("in", IN);
		KEYWORDS.put("end", END);
		KEYWORDS.put("if",IF);
		KEYWORDS.put("then",THEN);
		KEYWORDS.put("else",ELSE);
		KEYWORDS.put("while",WHILE);
		KEYWORDS.put("do",DO);
		KEYWORDS.put("nil",NIL);
		KEYWORDS.put("fst",FST);
		KEYWORDS.put("snd",SND);
		KEYWORDS.put("head",HEAD);
		KEYWORDS.put("tail",TAIL);
		KEYWORDS.put("and",AND);
		KEYWORDS.put("or",OR);
		KEYWORDS.put("not",NOT);
	}
	/** Read a single input character from standard input or from stream.*/
	private void nextChar() {
  		if (c>=0) {
  			if(input!=null){
  				try {
					c = input.read();
				} catch (IOException e) {
					c = -1;
				}
  				return;
  			}
    		try {
      			c = System.in.read();
      			if(c=='\n'){
      				column = 0;
      				line ++;
      			}else{
      				column ++;
      			}
    		} catch (Exception e) {
    			c = (-1);
    		}
  		}
	}
	public void error(String msg){
		System.out.println("Syntax Error! " + msg+". At line:"+line+",column:"+column);
		System.exit(1);
	}
	public SimPLLexer(InputStream in){
		this.input = in;
		line = 1;
		column = 0;
	}
	public SimPLLexer(){
		line = 1;
		column = 0;
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
    		case '~': nextChar(); 
    			return token = '~';
    		case '>':nextChar();
    			return token = '>';
    		case '<':nextChar();
    			return token = '<';
    		case '=':nextChar();
    			return token = '=';
    		case ':':{
    			nextChar();
    			if(c=='='){
    				nextChar();
    				return token = COLONEQUAL;
    			}else if(c==':'){
    				nextChar();
    				return token = COLONCOLON;
    			}
    			error("Unexpected character: "+String.valueOf(c));
    		}
    		case ',': nextChar();
    			return token = ',';
    		case '$': 
    			//System.out.println("getting result:");
    			//return token = '$';
    			return token = ENDINPUT;
    		default:
    			if (Character.isDigit(c)) {
    				int n = 0; 
    				do {
    					n = 10 * n + (c - '0');
    					nextChar(); 
    				}while(Character.isDigit(c));
    				yylval = new IntValue(n);
    				return token = INTEGER;
    			}
    			if (Character.isLetter(c)&&Character.isLowerCase(c)) {
    				StringBuilder sb = new StringBuilder();
    				do {
    					sb.append((char)c);
    					nextChar();
    				}while (Character.isLetterOrDigit(c));
    				String name = sb.toString();
    				if (KEYWORDS.containsKey(name)) {
    					return token = KEYWORDS.get(name);
    				}
    				if(name.equals("true")||name.equals("false")){
    					yylval = new BoolValue(Boolean.parseBoolean(name));
    					return token = BOOLEAN;
    				}
    				yylval = new Variable(name);
    				return token = IDENT;
    			}
    			error("Unexpected character: "+String.valueOf(c));
    		}
      }
    }
}
