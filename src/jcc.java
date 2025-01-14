import java.util.*;
import java.io.*;
import Tokenizer.Tokenizer; 
class fileReader{
  
  private String FileName;
  public ArrayList<String> FileData;
  

  fileReader(String FileName){
    this.FileName=FileName;
    this.FileData=new ArrayList<String>();  
  }
  
  void read(){
      //StringBuilder RFile=new StringBuilder();
    try(BufferedReader reader =new BufferedReader(new FileReader(this.FileName))){
      String Line;
      while((Line=reader.readLine())!=null){
        FileData.add(Line);
      }
    }
    catch(IOException e){
      System.out.println("An error occurred");
      e.printStackTrace();
    }
  }

  void display(ArrayList<String> FileData){
    if (FileData.isEmpty()){
      System.out.println("Error, nothing here");
    }
    else{
      for (String Tokens :FileData) {
        System.out.println(Tokens);
      }
    }
  }
}

public class jcc{
  public static void main(String args []){
    fileReader R=new fileReader("Test.txt");
    Map<String,String> Result=new HashMap<String,String>();
    Tokenizer Tk=new Tokenizer();
//TODO: make a string breaker
    R.read();
    Result=Tk.tokenize(R.FileData);
    for (Map.Entry<String ,String > Tokens :Result.entrySet()) {
      System.out.println(Tokens.getKey()+":"+Tokens.getValue());
    }
    R.display(R.FileData);
  }
}
