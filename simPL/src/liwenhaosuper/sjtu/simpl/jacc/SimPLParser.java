// Output created by jacc on Tue Jun 04 13:06:30 CST 2013

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
                case 79:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 80:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 158;
                            continue;
                        case ';':
                            yyn = 20;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 81:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 82:
                    yyn = yys3();
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 83:
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
                case 84:
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
                case 85:
                    yyn = yys6();
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
                case 86:
                    switch (yytok) {
                        case IDENT:
                            yyn = 37;
                            continue;
                    }
                    yyn = 161;
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
                case 87:
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
                case 88:
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
                case 89:
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
                case 90:
                    yyn = yys11();
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
                case 91:
                    switch (yytok) {
                        case IDENT:
                            yyn = 40;
                            continue;
                    }
                    yyn = 161;
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
                case 92:
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
                case 93:
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
                case 94:
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
                case 95:
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
                case 96:
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
                case 97:
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
                case 98:
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
                case 99:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
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
                case 101:
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
                case 102:
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
                case 103:
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
                case 104:
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
                case 105:
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
                case 106:
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
                case 107:
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
                case 108:
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
                case 109:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
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
                case 111:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 112:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
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
                case 114:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 5;
                            continue;
                        case FUN:
                            yyn = 7;
                            continue;
                        case INTEGER:
                            yyn = 11;
                            continue;
                        case NIL:
                            yyn = 13;
                            continue;
                        case '(':
                            yyn = 53;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 115:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 116:
                    switch (yytok) {
                        case ALLOW:
                            yyn = 54;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 117:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 118:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 119:
                    switch (yytok) {
                        case '=':
                            yyn = 56;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 120:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 121:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 122:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 123:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 124:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 125:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 126:
                    yyn = yys47();
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 127:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 128:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 129:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 130:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 131:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 133:
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
                case 134:
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
                case 135:
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
                case 136:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 138:
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
                case 139:
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
                case 140:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 5;
                            continue;
                        case FUN:
                            yyn = 7;
                            continue;
                        case INTEGER:
                            yyn = 11;
                            continue;
                        case NIL:
                            yyn = 13;
                            continue;
                        case '(':
                            yyn = 53;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 141:
                    switch (yytok) {
                        case COLONCOLON:
                            yyn = 35;
                            continue;
                        case ',':
                            yyn = 61;
                            continue;
                    }
                    yyn = 161;
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 142:
                    yyn = yys63();
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 143:
                    yyn = yys64();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 144:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 145:
                    yyn = yys66();
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 146:
                    yyn = yys67();
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 147:
                    yyn = yys68();
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 148:
                    switch (yytok) {
                        case COLONCOLON:
                            yyn = 35;
                            continue;
                        case ')':
                            yyn = 74;
                            continue;
                    }
                    yyn = 161;
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
                case 149:
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
                case 150:
                    yyn = yys71();
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 151:
                    yyn = yys72();
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 152:
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
                case 153:
                    yyn = yys74();
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 154:
                    yyn = yys75();
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 155:
                    yyn = yys76();
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 156:
                    yyn = yys77();
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 157:
                    yyn = yys78();
                    continue;

                case 158:
                    return true;
                case 159:
                    yyerror("stack overflow");
                case 160:
                    return false;
                case 161:
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
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys2() {
        switch (yytok) {
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
            case ENDINPUT:
                return yyr2();
        }
        return 161;
    }

    private int yys3() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys4() {
        switch (yytok) {
            case error:
            case TRUE:
            case FALSE:
            case ALLOW:
            case '[':
            case ']':
            case UNIT:
                return 161;
            case COLONCOLON:
                return 35;
        }
        return yyr4();
    }

    private int yys5() {
        switch (yytok) {
            case '[':
            case UNIT:
            case TRUE:
            case FALSE:
            case ALLOW:
            case error:
            case ']':
                return 161;
        }
        return yyr21();
    }

    private int yys6() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys8() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys9() {
        switch (yytok) {
            case '[':
            case UNIT:
            case TRUE:
            case FALSE:
            case ALLOW:
            case error:
            case ']':
                return 161;
        }
        return yyr3();
    }

    private int yys10() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys11() {
        switch (yytok) {
            case '[':
            case UNIT:
            case TRUE:
            case FALSE:
            case ALLOW:
            case error:
            case ']':
                return 161;
        }
        return yyr20();
    }

    private int yys13() {
        switch (yytok) {
            case '[':
            case UNIT:
            case TRUE:
            case FALSE:
            case ALLOW:
            case error:
            case ']':
                return 161;
        }
        return yyr22();
    }

    private int yys14() {
        switch (yytok) {
            case '(':
            case IF:
            case WHILE:
            case IDENT:
            case HEAD:
            case BOOLEAN:
            case TAIL:
            case FUN:
            case SND:
            case '~':
            case FST:
            case NOT:
            case NIL:
            case LET:
            case INTEGER:
                return yyr37();
        }
        return 161;
    }

    private int yys15() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys16() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys17() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys18() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
            case ')':
                return 46;
        }
        return 161;
    }

    private int yys19() {
        switch (yytok) {
            case '(':
            case IF:
            case WHILE:
            case IDENT:
            case HEAD:
            case BOOLEAN:
            case TAIL:
            case FUN:
            case SND:
            case '~':
            case FST:
            case NOT:
            case NIL:
            case LET:
            case INTEGER:
                return yyr36();
        }
        return 161;
    }

    private int yys20() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys21() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys22() {
        switch (yytok) {
            case '(':
            case IF:
            case WHILE:
            case IDENT:
            case HEAD:
            case BOOLEAN:
            case TAIL:
            case FUN:
            case SND:
            case '~':
            case FST:
            case NOT:
            case NIL:
            case LET:
            case INTEGER:
                return yyr34();
        }
        return 161;
    }

    private int yys23() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys24() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys25() {
        switch (yytok) {
            case '(':
            case IF:
            case WHILE:
            case IDENT:
            case HEAD:
            case BOOLEAN:
            case TAIL:
            case FUN:
            case SND:
            case '~':
            case FST:
            case NOT:
            case NIL:
            case LET:
            case INTEGER:
                return yyr35();
        }
        return 161;
    }

    private int yys26() {
        switch (yytok) {
            case '(':
            case IF:
            case WHILE:
            case IDENT:
            case HEAD:
            case BOOLEAN:
            case TAIL:
            case FUN:
            case SND:
            case '~':
            case FST:
            case NOT:
            case NIL:
            case LET:
            case INTEGER:
                return yyr29();
        }
        return 161;
    }

    private int yys27() {
        switch (yytok) {
            case '(':
            case IF:
            case WHILE:
            case IDENT:
            case HEAD:
            case BOOLEAN:
            case TAIL:
            case FUN:
            case SND:
            case '~':
            case FST:
            case NOT:
            case NIL:
            case LET:
            case INTEGER:
                return yyr27();
        }
        return 161;
    }

    private int yys28() {
        switch (yytok) {
            case '(':
            case IF:
            case WHILE:
            case IDENT:
            case HEAD:
            case BOOLEAN:
            case TAIL:
            case FUN:
            case SND:
            case '~':
            case FST:
            case NOT:
            case NIL:
            case LET:
            case INTEGER:
                return yyr28();
        }
        return 161;
    }

    private int yys29() {
        switch (yytok) {
            case '(':
            case IF:
            case WHILE:
            case IDENT:
            case HEAD:
            case BOOLEAN:
            case TAIL:
            case FUN:
            case SND:
            case '~':
            case FST:
            case NOT:
            case NIL:
            case LET:
            case INTEGER:
                return yyr30();
        }
        return 161;
    }

    private int yys30() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys31() {
        switch (yytok) {
            case '(':
            case IF:
            case WHILE:
            case IDENT:
            case HEAD:
            case BOOLEAN:
            case TAIL:
            case FUN:
            case SND:
            case '~':
            case FST:
            case NOT:
            case NIL:
            case LET:
            case INTEGER:
                return yyr33();
        }
        return 161;
    }

    private int yys32() {
        switch (yytok) {
            case '(':
            case IF:
            case WHILE:
            case IDENT:
            case HEAD:
            case BOOLEAN:
            case TAIL:
            case FUN:
            case SND:
            case '~':
            case FST:
            case NOT:
            case NIL:
            case LET:
            case INTEGER:
                return yyr31();
        }
        return 161;
    }

    private int yys33() {
        switch (yytok) {
            case '(':
            case IF:
            case WHILE:
            case IDENT:
            case HEAD:
            case BOOLEAN:
            case TAIL:
            case FUN:
            case SND:
            case '~':
            case FST:
            case NOT:
            case NIL:
            case LET:
            case INTEGER:
                return yyr32();
        }
        return 161;
    }

    private int yys34() {
        switch (yytok) {
            case UNIT:
            case ']':
            case ALLOW:
            case TRUE:
            case FALSE:
            case error:
            case '[':
                return 161;
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
        }
        return yyr9();
    }

    private int yys36() {
        switch (yytok) {
            case UNIT:
            case ']':
            case ALLOW:
            case TRUE:
            case FALSE:
            case error:
            case '[':
                return 161;
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
        }
        return yyr15();
    }

    private int yys38() {
        switch (yytok) {
            case UNIT:
            case ']':
            case ALLOW:
            case TRUE:
            case FALSE:
            case error:
            case '[':
                return 161;
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
        }
        return yyr17();
    }

    private int yys39() {
        switch (yytok) {
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
            case THEN:
                return 55;
        }
        return 161;
    }

    private int yys41() {
        switch (yytok) {
            case UNIT:
            case ']':
            case ALLOW:
            case TRUE:
            case FALSE:
            case error:
            case '[':
                return 161;
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
        }
        return yyr16();
    }

    private int yys42() {
        switch (yytok) {
            case UNIT:
            case ']':
            case ALLOW:
            case TRUE:
            case FALSE:
            case error:
            case '[':
                return 161;
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
        }
        return yyr18();
    }

    private int yys43() {
        switch (yytok) {
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
            case DO:
                return 57;
        }
        return 161;
    }

    private int yys44() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
            case ')':
                return 59;
            case ',':
                return 60;
        }
        return 161;
    }

    private int yys45() {
        switch (yytok) {
            case ENDINPUT:
            case ']':
            case END:
            case TRUE:
            case IN:
            case FALSE:
            case THEN:
            case ALLOW:
            case ELSE:
            case UNIT:
            case DO:
            case error:
            case '[':
                return 161;
            case COLONCOLON:
                return 35;
            case ',':
                return 61;
        }
        return yyr4();
    }

    private int yys46() {
        switch (yytok) {
            case '[':
            case UNIT:
            case TRUE:
            case FALSE:
            case ALLOW:
            case error:
            case ']':
                return 161;
        }
        return yyr23();
    }

    private int yys47() {
        switch (yytok) {
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
            case ENDINPUT:
                return yyr1();
        }
        return 161;
    }

    private int yys48() {
        switch (yytok) {
            case UNIT:
            case ']':
            case ALLOW:
            case TRUE:
            case FALSE:
            case error:
            case '[':
                return 161;
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
        }
        return yyr8();
    }

    private int yys49() {
        switch (yytok) {
            case error:
            case TRUE:
            case FALSE:
            case ']':
            case '[':
            case ALLOW:
            case UNIT:
                return 161;
            case ';':
                return 30;
        }
        return yyr5();
    }

    private int yys50() {
        switch (yytok) {
            case error:
            case TRUE:
            case FALSE:
            case ']':
            case '[':
            case ALLOW:
            case UNIT:
                return 161;
            case ';':
                return 30;
        }
        return yyr12();
    }

    private int yys51() {
        switch (yytok) {
            case UNIT:
            case ']':
            case ALLOW:
            case TRUE:
            case FALSE:
            case error:
            case '[':
                return 161;
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
        }
        return yyr13();
    }

    private int yys52() {
        switch (yytok) {
            case '[':
            case UNIT:
            case TRUE:
            case FALSE:
            case ALLOW:
            case error:
            case ']':
                return 161;
        }
        return yyr26();
    }

    private int yys53() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FUN:
                return 7;
            case INTEGER:
                return 11;
            case NIL:
                return 13;
            case ')':
                return 46;
            case '(':
                return 53;
        }
        return 161;
    }

    private int yys54() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys55() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys56() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys57() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys58() {
        switch (yytok) {
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
            case ')':
                return 67;
        }
        return 161;
    }

    private int yys59() {
        switch (yytok) {
            case '[':
            case UNIT:
            case TRUE:
            case FALSE:
            case ALLOW:
            case error:
            case ']':
                return 161;
        }
        return yyr19();
    }

    private int yys60() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys63() {
        switch (yytok) {
            case error:
            case TRUE:
            case FALSE:
            case ']':
            case '[':
            case ALLOW:
            case UNIT:
                return 161;
            case ';':
                return 30;
        }
        return yyr24();
    }

    private int yys64() {
        switch (yytok) {
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
            case ELSE:
                return 70;
        }
        return 161;
    }

    private int yys65() {
        switch (yytok) {
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
            case IN:
                return 71;
        }
        return 161;
    }

    private int yys66() {
        switch (yytok) {
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
            case END:
                return 72;
        }
        return 161;
    }

    private int yys67() {
        switch (yytok) {
            case '[':
            case UNIT:
            case TRUE:
            case FALSE:
            case ALLOW:
            case error:
            case ']':
                return 161;
        }
        return yyr7();
    }

    private int yys68() {
        switch (yytok) {
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
            case ')':
                return 73;
        }
        return 161;
    }

    private int yys70() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys71() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case IDENT:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 161;
    }

    private int yys72() {
        switch (yytok) {
            case '[':
            case UNIT:
            case TRUE:
            case FALSE:
            case ALLOW:
            case error:
            case ']':
                return 161;
        }
        return yyr14();
    }

    private int yys73() {
        switch (yytok) {
            case '[':
            case UNIT:
            case TRUE:
            case FALSE:
            case ALLOW:
            case error:
            case ']':
                return 161;
        }
        return yyr6();
    }

    private int yys74() {
        switch (yytok) {
            case '[':
            case UNIT:
            case TRUE:
            case FALSE:
            case ALLOW:
            case error:
            case ']':
                return 161;
        }
        return yyr25();
    }

    private int yys75() {
        switch (yytok) {
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
            case END:
                return 77;
        }
        return 161;
    }

    private int yys76() {
        switch (yytok) {
            case AND:
                return 22;
            case COLONCOLON:
                return 23;
            case COLONEQUAL:
                return 24;
            case OR:
                return 25;
            case '*':
                return 26;
            case '+':
                return 27;
            case '-':
                return 28;
            case '/':
                return 29;
            case ';':
                return 30;
            case '<':
                return 31;
            case '=':
                return 32;
            case '>':
                return 33;
            case END:
                return 78;
        }
        return 161;
    }

    private int yys77() {
        switch (yytok) {
            case '[':
            case UNIT:
            case TRUE:
            case FALSE:
            case ALLOW:
            case error:
            case ']':
                return 161;
        }
        return yyr11();
    }

    private int yys78() {
        switch (yytok) {
            case '[':
            case UNIT:
            case TRUE:
            case FALSE:
            case ALLOW:
            case error:
            case ']':
                return 161;
        }
        return yyr10();
    }

    private int yyr1() { // prog : prog ';' expr
        {  }
        yysv[yysp-=3] = yyrv;
        return 1;
    }

    private int yyr2() { // prog : expr
        {  }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr3() { // expr : IDENT
        {       }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr4() { // expr : val
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr5() { // expr : expr COLONCOLON expr
        {       }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr6() { // expr : '(' expr ',' expr ')'
        { }
        yysv[yysp-=5] = yyrv;
        return yypexpr();
    }

    private int yyr7() { // expr : '(' expr expr ')'
        {}
        yysv[yysp-=4] = yyrv;
        return yypexpr();
    }

    private int yyr8() { // expr : expr bop expr
        {}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr9() { // expr : uop expr
        {}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr10() { // expr : LET IDENT '=' expr IN expr END
        {}
        yysv[yysp-=7] = yyrv;
        return yypexpr();
    }

    private int yyr11() { // expr : IF expr THEN expr ELSE expr END
        { }
        yysv[yysp-=7] = yyrv;
        return yypexpr();
    }

    private int yyr12() { // expr : expr COLONEQUAL expr
        {}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr13() { // expr : expr ';' expr
        {}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr14() { // expr : WHILE expr DO expr END
        {}
        yysv[yysp-=5] = yyrv;
        return yypexpr();
    }

    private int yyr15() { // expr : FST expr
        {}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr16() { // expr : SND expr
        {}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr17() { // expr : HEAD expr
        {}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr18() { // expr : TAIL expr
        {}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr19() { // expr : '(' expr ')'
        {}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 70: return 75;
            case 60: return 68;
            case 57: return 66;
            case 56: return 65;
            case 55: return 64;
            case 54: return 63;
            case 44: return 58;
            case 30: return 51;
            case 24: return 50;
            case 23: return 49;
            case 21: return 48;
            case 20: return 47;
            case 18: return 44;
            case 17: return 43;
            case 16: return 42;
            case 15: return 41;
            case 10: return 39;
            case 8: return 38;
            case 6: return 36;
            case 3: return 34;
            case 0: return 2;
            default: return 76;
        }
    }

    private int yyr27() { // bop : '+'
        { }
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr28() { // bop : '-'
        {}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr29() { // bop : '*'
        {}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr30() { // bop : '/'
        {}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr31() { // bop : '='
        {}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr32() { // bop : '>'
        {}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr33() { // bop : '<'
        {}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr34() { // bop : AND
        {}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr35() { // bop : OR
        {}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr36() { // uop : '~'
        {}
        yysv[yysp-=1] = yyrv;
        return 3;
    }

    private int yyr37() { // uop : NOT
        {}
        yysv[yysp-=1] = yyrv;
        return 3;
    }

    private int yyr20() { // val : INTEGER
        { }
        yysv[yysp-=1] = yyrv;
        return yypval();
    }

    private int yyr21() { // val : BOOLEAN
        {}
        yysv[yysp-=1] = yyrv;
        return yypval();
    }

    private int yyr22() { // val : NIL
        {}
        yysv[yysp-=1] = yyrv;
        return yypval();
    }

    private int yyr23() { // val : '(' ')'
        {}
        yysv[yysp-=2] = yyrv;
        return yypval();
    }

    private int yyr24() { // val : FUN IDENT ALLOW expr
        { }
        yysv[yysp-=4] = yyrv;
        return yypval();
    }

    private int yyr25() { // val : '(' val ',' val ')'
        {}
        yysv[yysp-=5] = yyrv;
        return yypval();
    }

    private int yyr26() { // val : val COLONCOLON val
        {}
        yysv[yysp-=3] = yyrv;
        return yypval();
    }

    private int yypval() {
        switch (yyst[yysp-1]) {
            case 61: return 69;
            case 53: return 62;
            case 35: return 52;
            case 18: return 45;
            default: return 4;
        }
    }

    protected String[] yyerrmsgs = {
    };

        
        private SimPLLexer lexer;
        SimPLParser(SimPLLexer lexer){
                this.lexer = lexer;
        }
        private void yyerror(String msg){
                lexer.error(msg);
        }
        public static void main(String[] args){
                SimPLLexer lexer = new SimPLLexer();
                lexer.nextToken();
                SimPLParser parser = new SimPLParser(lexer);
                parser.parse();
        }

}
