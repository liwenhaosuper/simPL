// Output created by jacc on Tue Jun 04 10:05:14 CST 2013

package liwenhaosuper.sjtu.simpl.jacc;

import liwenhaosuper.sjtu.simpl.syntax.*;

class SimPLParser implements SimPLTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private Object[] yysv;
    private Object yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new Object[yyss];
        yytok = (lexer.getToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 17:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case '(':
                            yyn = 4;
                            continue;
                    }
                    yyn = 37;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 18:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 34;
                            continue;
                        case ';':
                            yyn = 5;
                            continue;
                    }
                    yyn = 37;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 19:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 20:
                    yyn = yys3();
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 21:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case '(':
                            yyn = 4;
                            continue;
                    }
                    yyn = 37;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 22:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case '(':
                            yyn = 4;
                            continue;
                    }
                    yyn = 37;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 23:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case '(':
                            yyn = 4;
                            continue;
                    }
                    yyn = 37;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 24:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case '(':
                            yyn = 4;
                            continue;
                    }
                    yyn = 37;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 25:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case '(':
                            yyn = 4;
                            continue;
                    }
                    yyn = 37;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 26:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case '(':
                            yyn = 4;
                            continue;
                    }
                    yyn = 37;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 27:
                    switch (yytok) {
                        case '*':
                            yyn = 6;
                            continue;
                        case '+':
                            yyn = 7;
                            continue;
                        case '-':
                            yyn = 8;
                            continue;
                        case '/':
                            yyn = 9;
                            continue;
                        case ')':
                            yyn = 16;
                            continue;
                    }
                    yyn = 37;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 28:
                    yyn = yys11();
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 29:
                    yyn = yys12();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 30:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 31:
                    yyn = yys14();
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 32:
                    yyn = yys15();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 33:
                    yyn = yys16();
                    continue;

                case 34:
                    return true;
                case 35:
                    yyerror("stack overflow");
                case 36:
                    return false;
                case 37:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        Object[] newyysv = new Object[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys2() {
        switch (yytok) {
            case '*':
                return 6;
            case '+':
                return 7;
            case '-':
                return 8;
            case '/':
                return 9;
            case ENDINPUT:
            case ';':
                return yyr2();
        }
        return 37;
    }

    private int yys3() {
        switch (yytok) {
            case '+':
            case '*':
            case ')':
            case ENDINPUT:
            case ';':
            case '/':
            case '-':
                return yyr8();
        }
        return 37;
    }

    private int yys11() {
        switch (yytok) {
            case '*':
                return 6;
            case '+':
                return 7;
            case '-':
                return 8;
            case '/':
                return 9;
            case ENDINPUT:
            case ';':
                return yyr1();
        }
        return 37;
    }

    private int yys12() {
        switch (yytok) {
            case '+':
            case '*':
            case ')':
            case ENDINPUT:
            case ';':
            case '/':
            case '-':
                return yyr5();
        }
        return 37;
    }

    private int yys13() {
        switch (yytok) {
            case '*':
                return 6;
            case '/':
                return 9;
            case '+':
            case ')':
            case ENDINPUT:
            case ';':
            case '-':
                return yyr3();
        }
        return 37;
    }

    private int yys14() {
        switch (yytok) {
            case '*':
                return 6;
            case '/':
                return 9;
            case '+':
            case ')':
            case ENDINPUT:
            case ';':
            case '-':
                return yyr4();
        }
        return 37;
    }

    private int yys15() {
        switch (yytok) {
            case '+':
            case '*':
            case ')':
            case ENDINPUT:
            case ';':
            case '/':
            case '-':
                return yyr6();
        }
        return 37;
    }

    private int yys16() {
        switch (yytok) {
            case '+':
            case '*':
            case ')':
            case ENDINPUT:
            case ';':
            case '/':
            case '-':
                return yyr7();
        }
        return 37;
    }

    private int yyr1() { // prog : prog ';' expr
        { System.out.println(yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return 1;
    }

    private int yyr2() { // prog : expr
        { System.out.println(yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr3() { // expr : expr '+' expr
        { yyrv = yysv[yysp-3] + yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr4() { // expr : expr '-' expr
        { yyrv = yysv[yysp-3] - yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr5() { // expr : expr '*' expr
        { yyrv = yysv[yysp-3] * yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr6() { // expr : expr '/' expr
        { yyrv = yysv[yysp-3] / yysv[yysp-1]; }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr7() { // expr : '(' expr ')'
        { yyrv = yysv[yysp-2]; }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr8() { // expr : INTEGER
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 8: return 14;
            case 7: return 13;
            case 6: return 12;
            case 5: return 11;
            case 4: return 10;
            case 0: return 2;
            default: return 15;
        }
    }

    protected String[] yyerrmsgs = {
    };


        public static void main(String[] args){
                SimPLLexer lexer = new SimPLLexer();
                lexer.nextToken();
                SimPLParser parser = new SimPLParser();
                parser.parse();
        }

}
