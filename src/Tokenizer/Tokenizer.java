package Tokenizer;
import java.util.*;
public class Tokenizer {
      
    TokenTable T=new TokenTable();
    private boolean isIdentifier(String iden){
      return iden.matches("[a-zA-Z_][a-zA-Z0-9_]*");
    }

    private boolean isNumber(String num){
      return num.matches("\\d+(\\.\\d+)?");
    }

    private boolean isKeyword(String Keyw){
      for(int Kw=0; Kw<T.Keywords.length;Kw++){
        if(Keyw.equals(T.Keywords[Kw])) return true;
      }
      return false;
    }

    private boolean isDelimiter(String Del){
      for(String Dl: T.Delimeters){
        if(Del.equals(Dl)) return true;
      }
      return false;
    }

    private boolean isOperator(String Oper){
      for(String Op: T.Operators){
        if(Oper.equals(Op)) return true;
      }
      return false;
    }

    public Map<String,String> tokenize( ArrayList<String> Tokens){
      Map<String,String> TokenList=new HashMap<String,String>();
      for (String buf: Tokens){

      if (isIdentifier(buf)){
        TokenList.put(buf,"Id");
      }
      else if(isNumber(buf)){
        TokenList.put(buf,"Lit");
      }
      else if(isKeyword(buf)){
        TokenList.put(buf,"Key");
      }
      else if(isDelimiter(buf)){
        TokenList.put(buf,"Del");
      }
      else if(isOperator(buf)){
        TokenList.put(buf,"Op");
      }
    }
    for(Map.Entry<String ,String> tok: TokenList.entrySet()){
      System.out.println(tok.getKey()+":"+tok.getValue());
    }
    return TokenList;
    }
}
