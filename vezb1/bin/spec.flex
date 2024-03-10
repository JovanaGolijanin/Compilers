// import sekcija

%%

// sekcija opcija i deklaracija
%class GenerisanaKlasa
%function next_token
%line
%column
%debug
%type Yytoken

%eofval{
return new Yytoken( sym.EOF, null, yyline, yycolumn);
%eofval}

%{
//dodatni clanovi generisane klase
KWTable kwTable = new KWTable();
Yytoken getKW()
{
	return new Yytoken( kwTable.find( yytext() ),
	yytext(), yyline, yycolumn );
}
%}

//stanja
%xstate KOMENTAR
//makroi

%%

// pravila
"//" { yybegin( KOMENTAR ); }
<KOMENTAR>~"\n" { yybegin( YYINITIAL ); }

[\t\n\r ] { ; }
\[ { return new Yytoken( sym.OPENSQUARE, yytext(), yyline, yycolumn ); }
\] { return new Yytoken( sym.CLOSEDSQUARE, yytext(), yyline, yycolumn ); }

//operatori
\+ { return new Yytoken( sym.PLUS,yytext(), yyline, yycolumn ); }
\- { return new Yytoken( sym.MINUS,yytext(), yyline, yycolumn ); }
//separatori
; { return new Yytoken( sym.SEMICOLON, yytext(), yyline, yycolumn ); }
: { return new Yytoken( sym.COLON, yytext(), yyline, yycolumn ); }
, { return new Yytoken( sym.COMMA, yytext(), yyline, yycolumn ); }
:= { return new Yytoken( sym.ASSIGN, yytext(), yyline, yycolumn ); }

//kljucne reci
//[a-zA-Z]+ { return getKW(); }
(int|bool|float) { return new Yytoken(sym.TYPE, yytext(),yyline, yycolumn ); }
main { return new Yytoken(sym.MAIN, yytext(),yyline, yycolumn ); }
exit { return new Yytoken(sym.EXIT, yytext(),yyline, yycolumn ); }
for { return new Yytoken(sym.FOR, yytext(),yyline, yycolumn ); }
in { return new Yytoken(sym.IN, yytext(),yyline, yycolumn ); }
apply { return new Yytoken(sym.APPLY, yytext(),yyline, yycolumn ); }

//identifikatori
([a-zA-Z])(([a-zA-Z]|[0-9])+) { return new Yytoken(sym.ID, yytext(),yyline, yycolumn ); }

//konstante
(0|0x)?([0-9]+) { return new Yytoken( sym.INT, yytext(), yyline, yycolumn ); }
(\true|\false) { return new Yytoken( sym.BOOL,yytext(), yyline, yycolumn ); }
0.(0|[0-9]+)(E\+(0|[0-9]+)|E\-(0|[0-9]+)) { return new Yytoken( sym.FLOAT,yytext(), yyline, yycolumn ); }

//obrada gresaka
. { if (yytext() != null && yytext().length() > 0) System.out.println( "ERROR: " + yytext() ); }
