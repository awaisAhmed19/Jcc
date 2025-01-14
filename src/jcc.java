import java.util.*;
import java.io.*;

class fileReader{
  
  private String FileName;
  private HashMap <String,String> FileData;
  

  fileReader(String FileName){
    this.FileName=FileName;
    this.FileData=new HashMap<String, String>();  
  }
  
  void read(){
    try{
      File file=new File(this.FileName);
      Scanner RFile=new Scanner(file);
      while(RFile.hasNextLine()){
        FileData.add(RFile.nextLine());
      }
      RFile.close();
    }
    catch(FileNotFoundException e){
      System.out.println("An error occurred");
      e.printStackTrace();
    }
  }

  void display(){
    if (FileData.isEmpty()){
      System.out.println("Error, nothing here");
    }
    else{
      for (String Data : FileData) {
        System.out.println(Data);
      }
    }
  }
}

public class jcc{
  public static void main(String args []){
    fileReader R=new fileReader("Test.txt");
    R.read();
    R.display();
  }
}
