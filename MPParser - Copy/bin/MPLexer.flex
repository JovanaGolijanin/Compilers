// import sekcija
import java_cup.runtime.*;

%%
// sekcija deklaracija
%class MPLexer

%cup

%line
%column

%eofval{
	return new Symbol( sym.EOF );
%eofval}


//stanja
%xstate KOMENTAR
//macros
slovo = [a-zA-Z]
cifra = [0-9]

%%
// rules section
\% { yybegin( KOMENTAR ); }
<KOMENTAR>~\% { yybegin( YYINITIAL ); }


[\t\r\n ]		{ ; }

//operatori
\<				{ return new Symbol( sym.LESS ); }
\<=				{ return new Symbol( sym.LESSEQUAL );  }
\==				{ return new Symbol( sym.EQUAL );  }
\!= 			{ return new Symbol( sym.NOTEQUAL );  }
\> 				{ return new Symbol( sym.MORE );  }
\>= 			{ return new Symbol( sym.MOREEQUAL );  }
\|\| 			{ return new Symbol( sym.OR );  }
\&& 				{ return new Symbol( sym.AND );  }

//separatori
;				{ return new Symbol( sym.SEMI );	}
,				{ return new Symbol( sym.COMMA );	}
\=				{ return new Symbol( sym.ASSIGN ); }
\(				{ return new Symbol( sym.LEFTPAR ); }
\)				{ return new Symbol( sym.RIGHTPAR ); }
\{				{ return new Symbol( sym.CURLYPARLEFT ); }
\}				{ return new Symbol( sym.CURLYPARRIGHT ); }


//kljucne reci
"main"		{ return new Symbol( sym.MAIN );	}	
"int"			{ return new Symbol( sym.INT );	}
"char"			{ return new Symbol( sym.CHAR );	}
"float"			{ return new Symbol( sym.FLOAT );	}
"bool"			{ return new Symbol( sym.BOOL );	}
"loop"			{ return new Symbol( sym.LOOP );	}
"redo"			{ return new Symbol( sym.REDO );	}


//identifikatori
({slovo}|_)({slovo}|{cifra}|_)*	{ return new Symbol( sym.ID ); }

//konstante
0#o[0-7]+|0#x[0-9a-fA-F]+|0#d{cifra}+|{cifra}+ 		{ return new Symbol( sym.CONST ); }
0\.{cifra}+?(E(\+|-)?{cifra}+)?		{ return new Symbol( sym.CONST ); }
'{slovo}' { return new Symbol( sym.CONST ); }

//obrada greske
. { if (yytext() != null && yytext().length() > 0) System.out.println( "ERROR: " + yytext() ); }

