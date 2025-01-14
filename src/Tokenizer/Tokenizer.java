import java.util.*;
import TokenTable;
final public class Tokenizer extends TokenTable{
      
    private static boolean isIdentifier(String iden){
      return iden.matches("[a-zA-Z_][a-zA-Z0-9_]*");
    }

    private static boolean isNumber(String num){
      return num.matches("\\d+(\\.\\d+)?");
    }

    private static boolean isKeyword(String Keyw){
      for(Kw: Keywords){
        if(Keyw.equals(Kw)) return true;
      }
      return false;
    }

    private static boolean isDelimiter(String Del){
      for(Dl: Delimeters){
        if(Del.equals(Dl)) return true;
      }
      return false;
    }

    private static boolean isOperator(String Op){
      for(op: Operator){
        if(Op.equals(op)) return true;
      }
      return false;
    }
    private static boolean isIdentifier(String iden){
      return iden.matches("[a-zA-Z_][a-zA-Z0-9_]*")
    }


    public static List<String> tokenize( ArrayList<String> Tokens){
        
    }
}
