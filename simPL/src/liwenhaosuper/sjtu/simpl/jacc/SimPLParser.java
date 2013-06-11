// Output created by jacc on Tue Jun 11 12:59:32 CST 2013

package liwenhaosuper.sjtu.simpl.jacc;

import liwenhaosuper.sjtu.simpl.syntax.*;
import liwenhaosuper.sjtu.simpl.runtime.*;
import liwenhaosuper.sjtu.simpl.util.*;
import java.io.*;

class SimPLParser implements SimPLTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private Object[] yysv;
    private Object yyrv;

    public boolean parse() throws SimPLFatalException, SimPLExitException {
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
                case 76:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 77:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 152;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 78:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 79:
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
                case 80:
                    yyn = yys4();
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
                case 81:
                    yyn = yys5();
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
                case 82:
                    switch (yytok) {
                        case IDENT:
                            yyn = 32;
                            continue;
                    }
                    yyn = 155;
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
                case 83:
                    yyn = yys7();
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
                case 84:
                    yyn = yys8();
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
                case 85:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    switch (yytok) {
                        case IDENT:
                            yyn = 35;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 88:
                    yyn = yys12();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 89:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 90:
                    yyn = yys14();
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 91:
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
                case 92:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 93:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 94:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 96:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 97:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 99:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 101:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 102:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 103:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    yyn = yys29();
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 108:
                    switch (yytok) {
                        case ALLOW:
                            yyn = 55;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 109:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 111:
                    switch (yytok) {
                        case '=':
                            yyn = 57;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 112:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 115:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 116:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 117:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 118:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 119:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 120:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 121:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 122:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 123:
                    yyn = yys47();
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 124:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 125:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 126:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 127:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 128:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 129:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 130:
                    yyn = yys54();
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 131:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 133:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 134:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 135:
                    yyn = yys59();
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 136:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 138:
                    yyn = yys62();
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 139:
                    yyn = yys63();
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 140:
                    yyn = yys64();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 141:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 142:
                    yyn = yys66();
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 143:
                    yyn = yys67();
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 144:
                    yyn = yys68();
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 145:
                    yyn = yys69();
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 146:
                    yyn = yys70();
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 147:
                    yyn = yys71();
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 148:
                    yyn = yys72();
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 149:
                    yyn = yys73();
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 150:
                    yyn = yys74();
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 151:
                    yyn = yys75();
                    continue;

                case 152:
                    return true;
                case 153:
                    yyerror("stack overflow");
                case 154:
                    return false;
                case 155:
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

    private int yys0() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys2() {
        switch (yytok) {
            case AND:
                return 19;
            case COLONCOLON:
                return 20;
            case COLONEQUAL:
                return 21;
            case OR:
                return 22;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
            case ';':
                return 27;
            case '<':
                return 28;
            case '=':
                return 29;
            case '>':
                return 30;
            case ENDINPUT:
                return yyr1();
        }
        return 155;
    }

    private int yys3() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr3();
    }

    private int yys4() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr29();
    }

    private int yys5() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys7() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys8() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr2();
    }

    private int yys9() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys10() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr28();
    }

    private int yys12() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr30();
    }

    private int yys13() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys14() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys15() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys16() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys17() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
            case ')':
                return 41;
        }
        return 155;
    }

    private int yys18() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys19() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys20() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys21() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys22() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys23() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys24() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys25() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys26() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys27() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys28() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys29() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys30() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys31() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr23();
    }

    private int yys33() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr25();
    }

    private int yys34() {
        switch (yytok) {
            case AND:
                return 19;
            case COLONCOLON:
                return 20;
            case COLONEQUAL:
                return 21;
            case OR:
                return 22;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
            case ';':
                return 27;
            case '<':
                return 28;
            case '=':
                return 29;
            case '>':
                return 30;
            case THEN:
                return 56;
        }
        return 155;
    }

    private int yys36() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr17();
    }

    private int yys37() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr24();
    }

    private int yys38() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr26();
    }

    private int yys39() {
        switch (yytok) {
            case AND:
                return 19;
            case COLONCOLON:
                return 20;
            case COLONEQUAL:
                return 21;
            case OR:
                return 22;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
            case ';':
                return 27;
            case '<':
                return 28;
            case '=':
                return 29;
            case '>':
                return 30;
            case DO:
                return 58;
        }
        return 155;
    }

    private int yys40() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
            case AND:
                return 19;
            case COLONCOLON:
                return 20;
            case COLONEQUAL:
                return 21;
            case OR:
                return 22;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
            case ';':
                return 27;
            case '<':
                return 28;
            case '=':
                return 29;
            case '>':
                return 30;
            case ')':
                return 60;
            case ',':
                return 61;
        }
        return 155;
    }

    private int yys41() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr31();
    }

    private int yys42() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr16();
    }

    private int yys43() {
        switch (yytok) {
            case FALSE:
            case TRUE:
            case UNIT:
            case '$':
            case ALLOW:
            case error:
                return 155;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
            case '<':
                return 28;
            case '=':
                return 29;
            case '>':
                return 30;
        }
        return yyr14();
    }

    private int yys44() {
        switch (yytok) {
            case FALSE:
            case ALLOW:
            case '$':
            case TRUE:
            case error:
            case UNIT:
                return 155;
            case AND:
                return 19;
            case COLONCOLON:
                return 20;
            case OR:
                return 22;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
            case '<':
                return 28;
            case '=':
                return 29;
            case '>':
                return 30;
        }
        return yyr4();
    }

    private int yys45() {
        switch (yytok) {
            case error:
            case ALLOW:
            case '$':
            case TRUE:
            case UNIT:
            case FALSE:
                return 155;
            case AND:
                return 19;
            case COLONCOLON:
                return 20;
            case COLONEQUAL:
                return 21;
            case OR:
                return 22;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
            case '<':
                return 28;
            case '=':
                return 29;
            case '>':
                return 30;
        }
        return yyr20();
    }

    private int yys46() {
        switch (yytok) {
            case FALSE:
            case TRUE:
            case UNIT:
            case '$':
            case ALLOW:
            case error:
                return 155;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
            case '<':
                return 28;
            case '=':
                return 29;
            case '>':
                return 30;
        }
        return yyr15();
    }

    private int yys47() {
        switch (yytok) {
            case UNIT:
            case TRUE:
            case FALSE:
            case error:
            case ALLOW:
            case '$':
                return 155;
            case '*':
                return 23;
            case '/':
                return 26;
        }
        return yyr9();
    }

    private int yys48() {
        switch (yytok) {
            case UNIT:
            case TRUE:
            case FALSE:
            case error:
            case ALLOW:
            case '$':
                return 155;
            case '*':
                return 23;
            case '/':
                return 26;
        }
        return yyr7();
    }

    private int yys49() {
        switch (yytok) {
            case UNIT:
            case TRUE:
            case FALSE:
            case error:
            case ALLOW:
            case '$':
                return 155;
            case '*':
                return 23;
            case '/':
                return 26;
        }
        return yyr8();
    }

    private int yys50() {
        switch (yytok) {
            case UNIT:
            case TRUE:
            case FALSE:
            case error:
            case ALLOW:
            case '$':
                return 155;
            case '*':
                return 23;
            case '/':
                return 26;
        }
        return yyr10();
    }

    private int yys51() {
        switch (yytok) {
            case error:
            case ALLOW:
            case '$':
            case TRUE:
            case UNIT:
            case FALSE:
                return 155;
            case AND:
                return 19;
            case COLONCOLON:
                return 20;
            case COLONEQUAL:
                return 21;
            case OR:
                return 22;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
            case '<':
                return 28;
            case '=':
                return 29;
            case '>':
                return 30;
        }
        return yyr21();
    }

    private int yys52() {
        switch (yytok) {
            case UNIT:
            case ALLOW:
            case TRUE:
            case error:
            case FALSE:
            case '$':
                return 155;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
        }
        return yyr13();
    }

    private int yys53() {
        switch (yytok) {
            case UNIT:
            case ALLOW:
            case TRUE:
            case error:
            case FALSE:
            case '$':
                return 155;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
        }
        return yyr11();
    }

    private int yys54() {
        switch (yytok) {
            case UNIT:
            case ALLOW:
            case TRUE:
            case error:
            case FALSE:
            case '$':
                return 155;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
        }
        return yyr12();
    }

    private int yys55() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys56() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys57() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys58() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys59() {
        switch (yytok) {
            case AND:
                return 19;
            case COLONCOLON:
                return 20;
            case COLONEQUAL:
                return 21;
            case OR:
                return 22;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
            case ';':
                return 27;
            case '<':
                return 28;
            case '=':
                return 29;
            case '>':
                return 30;
            case ')':
                return 66;
        }
        return 155;
    }

    private int yys60() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr27();
    }

    private int yys61() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys62() {
        switch (yytok) {
            case error:
            case ALLOW:
            case '$':
            case TRUE:
            case UNIT:
            case FALSE:
                return 155;
            case AND:
                return 19;
            case COLONCOLON:
                return 20;
            case COLONEQUAL:
                return 21;
            case OR:
                return 22;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
            case '<':
                return 28;
            case '=':
                return 29;
            case '>':
                return 30;
        }
        return yyr32();
    }

    private int yys63() {
        switch (yytok) {
            case AND:
                return 19;
            case COLONCOLON:
                return 20;
            case COLONEQUAL:
                return 21;
            case OR:
                return 22;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
            case ';':
                return 27;
            case '<':
                return 28;
            case '=':
                return 29;
            case '>':
                return 30;
            case ELSE:
                return 68;
        }
        return 155;
    }

    private int yys64() {
        switch (yytok) {
            case AND:
                return 19;
            case COLONCOLON:
                return 20;
            case COLONEQUAL:
                return 21;
            case OR:
                return 22;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
            case ';':
                return 27;
            case '<':
                return 28;
            case '=':
                return 29;
            case '>':
                return 30;
            case IN:
                return 69;
        }
        return 155;
    }

    private int yys65() {
        switch (yytok) {
            case AND:
                return 19;
            case COLONCOLON:
                return 20;
            case COLONEQUAL:
                return 21;
            case OR:
                return 22;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
            case ';':
                return 27;
            case '<':
                return 28;
            case '=':
                return 29;
            case '>':
                return 30;
            case END:
                return 70;
        }
        return 155;
    }

    private int yys66() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr6();
    }

    private int yys67() {
        switch (yytok) {
            case AND:
                return 19;
            case COLONCOLON:
                return 20;
            case COLONEQUAL:
                return 21;
            case OR:
                return 22;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
            case ';':
                return 27;
            case '<':
                return 28;
            case '=':
                return 29;
            case '>':
                return 30;
            case ')':
                return 71;
        }
        return 155;
    }

    private int yys68() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys69() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case IDENT:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SND:
                return 14;
            case TAIL:
                return 15;
            case WHILE:
                return 16;
            case '(':
                return 17;
            case '~':
                return 18;
        }
        return 155;
    }

    private int yys70() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr22();
    }

    private int yys71() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr5();
    }

    private int yys72() {
        switch (yytok) {
            case AND:
                return 19;
            case COLONCOLON:
                return 20;
            case COLONEQUAL:
                return 21;
            case OR:
                return 22;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
            case ';':
                return 27;
            case '<':
                return 28;
            case '=':
                return 29;
            case '>':
                return 30;
            case END:
                return 74;
        }
        return 155;
    }

    private int yys73() {
        switch (yytok) {
            case AND:
                return 19;
            case COLONCOLON:
                return 20;
            case COLONEQUAL:
                return 21;
            case OR:
                return 22;
            case '*':
                return 23;
            case '+':
                return 24;
            case '-':
                return 25;
            case '/':
                return 26;
            case ';':
                return 27;
            case '<':
                return 28;
            case '=':
                return 29;
            case '>':
                return 30;
            case END:
                return 75;
        }
        return 155;
    }

    private int yys74() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr19();
    }

    private int yys75() {
        switch (yytok) {
            case ALLOW:
            case '$':
            case UNIT:
            case FALSE:
            case error:
            case TRUE:
                return 155;
        }
        return yyr18();
    }

    private int yyr1() { // prog : expr
        { app = ((Expression)yysv[yysp-1]);}
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr2() { // expr : IDENT
        { yyrv = ((Variable)yysv[yysp-1]);}
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr3() { // expr : val
        { yyrv = ((Value)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr4() { // expr : expr COLONCOLON expr
        { yyrv = new List(((Expression)yysv[yysp-3]),((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr5() { // expr : '(' expr ',' expr ')'
        { yyrv = new Pair(((Expression)yysv[yysp-4]),((Expression)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return yypexpr();
    }

    private int yyr6() { // expr : '(' expr expr ')'
        { yyrv = new Application(((Expression)yysv[yysp-3]),((Expression)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypexpr();
    }

    private int yyr7() { // expr : expr '+' expr
        { yyrv = new BinaryOperation(((Expression)yysv[yysp-3]),((Expression)yysv[yysp-1]),BinaryOperation.BinaryOperator.plus);}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr8() { // expr : expr '-' expr
        { yyrv = new BinaryOperation(((Expression)yysv[yysp-3]),((Expression)yysv[yysp-1]),BinaryOperation.BinaryOperator.minus);}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr9() { // expr : expr '*' expr
        { yyrv = new BinaryOperation(((Expression)yysv[yysp-3]),((Expression)yysv[yysp-1]),BinaryOperation.BinaryOperator.times); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr10() { // expr : expr '/' expr
        { yyrv = new BinaryOperation(((Expression)yysv[yysp-3]),((Expression)yysv[yysp-1]),BinaryOperation.BinaryOperator.devide); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr11() { // expr : expr '=' expr
        { yyrv = new BinaryOperation(((Expression)yysv[yysp-3]),((Expression)yysv[yysp-1]),BinaryOperation.BinaryOperator.equal); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr12() { // expr : expr '>' expr
        { yyrv = new BinaryOperation(((Expression)yysv[yysp-3]),((Expression)yysv[yysp-1]),BinaryOperation.BinaryOperator.biggerThan); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr13() { // expr : expr '<' expr
        { yyrv = new BinaryOperation(((Expression)yysv[yysp-3]),((Expression)yysv[yysp-1]),BinaryOperation.BinaryOperator.lessThan); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr14() { // expr : expr AND expr
        { yyrv = new BinaryOperation(((Expression)yysv[yysp-3]),((Expression)yysv[yysp-1]),BinaryOperation.BinaryOperator.and); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr15() { // expr : expr OR expr
        { yyrv = new BinaryOperation(((Expression)yysv[yysp-3]),((Expression)yysv[yysp-1]),BinaryOperation.BinaryOperator.or); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr16() { // expr : '~' expr
        { yyrv = new UnaryOperation(((Expression)yysv[yysp-1]),UnaryOperation.UnaryOperator.not);}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr17() { // expr : NOT expr
        { yyrv = new UnaryOperation(((Expression)yysv[yysp-1]),UnaryOperation.UnaryOperator.negative);}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr18() { // expr : LET IDENT '=' expr IN expr END
        { yyrv = new LetInEnd(((Variable)yysv[yysp-6]),((Expression)yysv[yysp-4]),((Expression)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypexpr();
    }

    private int yyr19() { // expr : IF expr THEN expr ELSE expr END
        { yyrv = new IfThenElse(((Expression)yysv[yysp-6]),((Expression)yysv[yysp-4]),((Expression)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypexpr();
    }

    private int yyr20() { // expr : expr COLONEQUAL expr
        { yyrv = new Assignment(((Expression)yysv[yysp-3]),((Expression)yysv[yysp-1]));}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr21() { // expr : expr ';' expr
        { yyrv = new Sequence(((Expression)yysv[yysp-3]),((Expression)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr22() { // expr : WHILE expr DO expr END
        { yyrv = new WhileDoEnd(((Expression)yysv[yysp-4]),((Expression)yysv[yysp-2]));}
        yysv[yysp-=5] = yyrv;
        return yypexpr();
    }

    private int yyr23() { // expr : FST expr
        { yyrv = new First(((Expression)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr24() { // expr : SND expr
        { yyrv = new Second(((Expression)yysv[yysp-1]));}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr25() { // expr : HEAD expr
        { yyrv = new Head(((Expression)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr26() { // expr : TAIL expr
        { yyrv = new Tail(((Expression)yysv[yysp-1]));}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr27() { // expr : '(' expr ')'
        { yyrv = new Bracket(((Expression)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 68: return 72;
            case 61: return 67;
            case 58: return 65;
            case 57: return 64;
            case 56: return 63;
            case 55: return 62;
            case 40: return 59;
            case 30: return 54;
            case 29: return 53;
            case 28: return 52;
            case 27: return 51;
            case 26: return 50;
            case 25: return 49;
            case 24: return 48;
            case 23: return 47;
            case 22: return 46;
            case 21: return 45;
            case 20: return 44;
            case 19: return 43;
            case 18: return 42;
            case 17: return 40;
            case 16: return 39;
            case 15: return 38;
            case 14: return 37;
            case 13: return 36;
            case 9: return 34;
            case 7: return 33;
            case 5: return 31;
            case 0: return 2;
            default: return 73;
        }
    }

    private int yyr28() { // val : INTEGER
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return 3;
    }

    private int yyr29() { // val : BOOLEAN
        { yyrv = yysv[yysp-1];}
        yysv[yysp-=1] = yyrv;
        return 3;
    }

    private int yyr30() { // val : NIL
        { yyrv = new Nil(); }
        yysv[yysp-=1] = yyrv;
        return 3;
    }

    private int yyr31() { // val : '(' ')'
        { yyrv = new Nop();}
        yysv[yysp-=2] = yyrv;
        return 3;
    }

    private int yyr32() { // val : FUN IDENT ALLOW expr
        { yyrv = new AnonymousFunction(((Variable)yysv[yysp-3]),((Expression)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 3;
    }

    protected String[] yyerrmsgs = {
    };

        private Expression app;
        private SimPLLexer lexer;
        SimPLParser(SimPLLexer lexer){
                this.lexer = lexer;
        }
        private void yyerror(String msg) throws SimPLFatalException{
                lexer.error(msg);
        }
        public Expression getApp(){
                return app;
        }
        public static void main(String[] args){
                String filename = null,outfile = null;
                if(args.length>=2){
                        for(int i=0;i<args.length;i++){
                                if(args[i].equals("-f")||args[i].equals("-F")){
                                        if(i<args.length-1){
                                                filename = args[i+1];
                                                break;
                                        }
                                }
                        }
                }
                /*
                String lg = "Input Command:";
                for(int i=0;i<args.length;i++){
                        lg+=args[i];
                        lg+=" ";
                }
                Util.log(lg);
                */
                InputStream ins = null;
                if(filename!=null&&filename.length()>4){
                        if(!filename.contains(".spl")){
                                Util.log("Input file name should have a suffix of \".spl\" ");
                                return;
                        }
                        Util.loginit(filename.replaceAll(".spl", ".rst"));
                        try {
                                ins = new FileInputStream(filename);
                        } catch (FileNotFoundException e) {
                                e.printStackTrace();
                                Util.log(e.getMessage());
                        }
                }
                while(true){
                        try{
                                SimPLLexer lexer ;
                                if(ins!=null){
                                        lexer = new SimPLLexer(ins);
                                }else{
                                        Util.log("SimPL>");
                                        lexer = new SimPLLexer();
                                }
                                lexer.nextToken();
                                SimPLParser parser = new SimPLParser(lexer);
                                parser.parse();
                                RunTimeState state = new RunTimeState();
                                Util.init(state);
                                Util.log(parser.getApp().eval(state).toString());
                        }catch(SimPLFatalException e){
                                Util.log(e.getMessage());
                        }catch(StackOverflowError ee){
                                Util.log("StackOverflowError! Currently simPL doesn't support recursive nested anonymous function. Users should rewrite their code to avoid this problem.");
                        }catch(SimPLExitException eee){
                                //Util.log("End of input");
                                return;
                        }catch(Exception eeee){
                                return;
                        }
                         Memory.getInstance().clean();
                }
        }

}
