
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Mon Dec 04 06:57:28 CET 2023
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;

/** CUP v0.10k generated parser.
  * @version Mon Dec 04 06:57:28 CET 2023
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\045\000\002\002\004\000\002\003\005\000\002\003" +
    "\005\000\002\003\004\000\002\003\003\000\002\004\004" +
    "\000\002\005\004\000\002\005\003\000\002\006\005\000" +
    "\002\006\005\000\002\006\004\000\002\007\003\000\002" +
    "\007\003\000\002\007\003\000\002\010\005\000\002\010" +
    "\003\000\002\010\005\000\002\012\003\000\002\012\003" +
    "\000\002\013\005\000\002\013\005\000\002\013\004\000" +
    "\002\014\005\000\002\014\005\000\002\014\003\000\002" +
    "\015\003\000\002\015\003\000\002\016\012\000\002\016" +
    "\012\000\002\016\011\000\002\016\010\000\002\016\007" +
    "\000\002\016\006\000\002\016\005\000\002\016\004\000" +
    "\002\011\005\000\002\011\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\071\000\006\003\005\004\006\001\002\000\004\002" +
    "\073\001\002\000\004\002\ufffd\001\002\000\012\003\011" +
    "\007\016\010\015\011\013\001\002\000\014\006\ufffa\007" +
    "\ufffa\010\ufffa\011\ufffa\017\ufffa\001\002\000\006\003\070" +
    "\006\067\001\002\000\004\002\ufffe\001\002\000\006\003" +
    "\065\005\066\001\002\000\006\003\ufff4\006\ufff4\001\002" +
    "\000\014\006\023\007\016\010\015\011\013\017\020\001" +
    "\002\000\006\003\ufff5\006\ufff5\001\002\000\006\003\ufff6" +
    "\006\ufff6\001\002\000\010\003\ufff0\005\ufff0\013\ufff0\001" +
    "\002\000\006\003\045\006\044\001\002\000\014\006\ufffb" +
    "\007\ufffb\010\ufffb\011\ufffb\017\ufffb\001\002\000\010\003" +
    "\ufff2\005\ufff2\013\ufff2\001\002\000\006\003\031\012\032" +
    "\001\002\000\010\003\ufffc\005\ufffc\013\026\001\002\000" +
    "\010\003\uffef\005\uffef\013\uffef\001\002\000\010\003\027" +
    "\006\023\017\020\001\002\000\010\003\ufff1\005\ufff1\013" +
    "\ufff1\001\002\000\010\003\ufff3\005\ufff3\013\ufff3\001\002" +
    "\000\010\003\uffec\005\uffec\013\uffec\001\002\000\010\003" +
    "\035\006\034\016\033\001\002\000\014\003\uffe8\005\uffe8" +
    "\013\uffe8\014\uffe8\015\uffe8\001\002\000\014\003\uffe7\005" +
    "\uffe7\013\uffe7\014\uffe7\015\uffe7\001\002\000\010\003\uffed" +
    "\005\uffed\013\uffed\001\002\000\014\003\uffe9\005\uffe9\013" +
    "\uffe9\014\uffe9\015\uffe9\001\002\000\014\003\uffee\005\uffee" +
    "\013\uffee\014\040\015\041\001\002\000\006\006\034\016" +
    "\033\001\002\000\006\006\034\016\033\001\002\000\014" +
    "\003\uffea\005\uffea\013\uffea\014\uffea\015\uffea\001\002\000" +
    "\014\003\uffeb\005\uffeb\013\uffeb\014\uffeb\015\uffeb\001\002" +
    "\000\006\003\047\020\046\001\002\000\010\003\uffdf\005" +
    "\uffdf\013\uffdf\001\002\000\006\003\051\021\050\001\002" +
    "\000\010\003\uffe0\005\uffe0\013\uffe0\001\002\000\006\003" +
    "\053\006\052\001\002\000\010\003\uffe1\005\uffe1\013\uffe1" +
    "\001\002\000\010\003\uffdd\022\uffdd\030\uffdd\001\002\000" +
    "\010\003\uffe2\005\uffe2\013\uffe2\001\002\000\010\003\056" +
    "\022\057\030\055\001\002\000\004\006\064\001\002\000" +
    "\010\003\uffe3\005\uffe3\013\uffe3\001\002\000\006\003\061" +
    "\023\060\001\002\000\010\003\062\006\023\017\020\001" +
    "\002\000\010\003\uffe4\005\uffe4\013\uffe4\001\002\000\010" +
    "\003\uffe5\005\uffe5\013\uffe5\001\002\000\010\003\uffe6\005" +
    "\uffe6\013\uffe6\001\002\000\010\003\uffde\022\uffde\030\uffde" +
    "\001\002\000\004\002\uffff\001\002\000\004\002\000\001" +
    "\002\000\006\003\072\013\071\001\002\000\014\006\ufff7" +
    "\007\ufff7\010\ufff7\011\ufff7\017\ufff7\001\002\000\014\006" +
    "\ufff9\007\ufff9\010\ufff9\011\ufff9\017\ufff9\001\002\000\014" +
    "\006\ufff8\007\ufff8\010\ufff8\011\ufff8\017\ufff8\001\002\000" +
    "\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\071\000\004\003\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\012\004\011\005\013\006\006\007\007" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\016\006\020" +
    "\007\007\010\023\012\021\013\016\016\024\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\012\027" +
    "\013\016\016\024\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\014\036\015\035\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\015\042\001\001" +
    "\000\004\015\041\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\011\053\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\012\062\013\016\016\024\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




	public int errNo = 0;

    public static void main( String[] args )
    {
        try
        {
            FileReader file = new FileReader( args[0] );
            Scanner scanner = new GenerisanaKlasa( file );
            Parser parser = new Parser( scanner );
			parser.parse();

			if ( parser.errNo == 0)
				System.out.println( "Analiza je zavrsena. U kodu nema sintaksnih gresaka!" );
			else
				System.out.println( "Analiza je zavrsena. Broj sintaksnih gresaka: " + parser.errNo );
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }

    public void syntax_error(Symbol current_token)
    {

    }

    public void report_error(String message, Object info)
    {
        System.out.println( message );
    }

    public int getLine()
    {
        return ( ( GenerisanaKlasa ) getScanner() ).getLine();
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // NameList ::= ID 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(7/*NameList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // NameList ::= NameList COMMA ID 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(7/*NameList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // ApplyExpression ::= FOR error 
            {
              Object RESULT = null;
		
    System.out.println("Greska u liniji " + parser.getLine() + ": " +  "Ocekuje se identifikator.");
    parser.errNo++;

              CUP$Parser$result = new java_cup.runtime.Symbol(12/*ApplyExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // ApplyExpression ::= FOR ID error 
            {
              Object RESULT = null;
		
    System.out.println("Greska u liniji " + parser.getLine() + ": " +  "Nedostaje kljucna rec IN.");
    parser.errNo++;

              CUP$Parser$result = new java_cup.runtime.Symbol(12/*ApplyExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // ApplyExpression ::= FOR ID IN error 
            {
              Object RESULT = null;
		
    System.out.println("Greska u liniji " + parser.getLine() + ": " +  "Ocekuje se [.");
    parser.errNo++;

              CUP$Parser$result = new java_cup.runtime.Symbol(12/*ApplyExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // ApplyExpression ::= FOR ID IN OPENSQUARE error 
            {
              Object RESULT = null;
		
    System.out.println("Greska u liniji " + parser.getLine() + ": " +  "Nije navedena lista.");
    parser.errNo++;

              CUP$Parser$result = new java_cup.runtime.Symbol(12/*ApplyExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // ApplyExpression ::= FOR ID IN OPENSQUARE NameList error 
            {
              Object RESULT = null;
		
    System.out.println("Greska u liniji " + parser.getLine() + ": " +  "Zagrada nije zatvorena.");
    parser.errNo++;

              CUP$Parser$result = new java_cup.runtime.Symbol(12/*ApplyExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // ApplyExpression ::= FOR ID IN OPENSQUARE NameList CLOSEDSQUARE error 
            {
              Object RESULT = null;
		
    System.out.println("Greska u liniji " + parser.getLine() + ": " +  "Nedostaje kljucna rec APPLY.");
    parser.errNo++;

              CUP$Parser$result = new java_cup.runtime.Symbol(12/*ApplyExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // ApplyExpression ::= FOR ID IN OPENSQUARE NameList CLOSEDSQUARE APPLY error 
            {
              Object RESULT = null;
		
    System.out.println("Greska u liniji " + parser.getLine() + ": " +  "Nije naveden izraz koji se treba izvrsiti nad listom.");
    parser.errNo++;

              CUP$Parser$result = new java_cup.runtime.Symbol(12/*ApplyExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // ApplyExpression ::= FOR ID IN OPENSQUARE NameList CLOSEDSQUARE APPLY Expression 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(12/*ApplyExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // TermExpression ::= ID 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(11/*TermExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // TermExpression ::= CONST 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(11/*TermExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // ArithmeticExpression ::= TermExpression 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(10/*ArithmeticExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // ArithmeticExpression ::= ArithmeticExpression MINUS TermExpression 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(10/*ArithmeticExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // ArithmeticExpression ::= ArithmeticExpression PLUS TermExpression 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(10/*ArithmeticExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Assignment ::= ID error 
            {
              Object RESULT = null;
		
    System.out.println("Greska u liniji " + parser.getLine() + ": " +  "Ocekuje se :=.");
    parser.errNo++;

              CUP$Parser$result = new java_cup.runtime.Symbol(9/*Assignment*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Assignment ::= ID ASSIGN error 
            {
              Object RESULT = null;
		
    System.out.println("Greska u liniji " + parser.getLine() + ": " +  "Nedostaje desna strana dodele.");
    parser.errNo++;

              CUP$Parser$result = new java_cup.runtime.Symbol(9/*Assignment*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Assignment ::= ID ASSIGN ArithmeticExpression 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(9/*Assignment*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Expression ::= ApplyExpression 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(8/*Expression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Expression ::= Assignment 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(8/*Expression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Expressions ::= Expressions SEMICOLON error 
            {
              Object RESULT = null;
		
    System.out.println("Greska u liniji " + parser.getLine() + ": " +  "Napisano ; na kraju izraza.");
    parser.errNo++;

              CUP$Parser$result = new java_cup.runtime.Symbol(6/*Expressions*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Expressions ::= Expression 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(6/*Expressions*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Expressions ::= Expressions SEMICOLON Expression 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(6/*Expressions*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Type ::= BOOL 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(5/*Type*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Type ::= FLOAT 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(5/*Type*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Type ::= INT 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(5/*Type*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Declaration ::= Type error 
            {
              Object RESULT = null;
		
    System.out.println("Greska u liniji " + parser.getLine() + ": " +  "Nije dato ime promenljive.");
    parser.errNo++;

              CUP$Parser$result = new java_cup.runtime.Symbol(4/*Declaration*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Declaration ::= Type ID error 
            {
              Object RESULT = null;
		
    System.out.println("Greska u liniji " + parser.getLine() + ": " +  "Nedostaje ;.");
    parser.errNo++;

              CUP$Parser$result = new java_cup.runtime.Symbol(4/*Declaration*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Declaration ::= Type ID SEMICOLON 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(4/*Declaration*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Declarations ::= Declaration 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(3/*Declarations*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Declarations ::= Declarations Declaration 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(3/*Declarations*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Block ::= Declarations Expressions 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(2/*Block*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Program ::= error 
            {
              Object RESULT = null;
		
    System.out.println("Greska u liniji " + parser.getLine() + ": " +  "Nedostaje MAIN na pocetku programa.");
    parser.errNo++;

              CUP$Parser$result = new java_cup.runtime.Symbol(1/*Program*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Program ::= MAIN error 
            {
              Object RESULT = null;
		
    System.out.println("Greska u liniji " + parser.getLine() + ": " +  "Telo programa je neispravno ili ne postoji.");
    parser.errNo++;

              CUP$Parser$result = new java_cup.runtime.Symbol(1/*Program*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Program ::= MAIN Block error 
            {
              Object RESULT = null;
		
    System.out.println("Greska u liniji " + parser.getLine() + ": " +  "Nedostaje EXIT na kraju programa.");
    parser.errNo++;

              CUP$Parser$result = new java_cup.runtime.Symbol(1/*Program*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Program ::= MAIN Block EXIT 
            {
              Object RESULT = null;

              CUP$Parser$result = new java_cup.runtime.Symbol(1/*Program*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Program EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

