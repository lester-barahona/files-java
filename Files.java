import java.io.*;
public class Files{
  
   FileWriter fWriter;
   FileReader fReader;
   BufferedWriter bWriter;
   BufferedReader bReader;
   PrintWriter writer;
   private static final String DOCUMENTO="./output/fileText.txt";
   
  public Files(){ }
  
  public void initReader() {
     try{     
       fReader=new FileReader(DOCUMENTO);
       bReader=new BufferedReader(fReader);      
     }catch(Exception e){
       System.err.println("Error al iniciar lector "+e.getMessage());
     }   
  }
 
  public void initWriter(boolean append) {
      try{    
       fWriter=new FileWriter(DOCUMENTO,append);
       bWriter=new BufferedWriter(fWriter);
       writer=new PrintWriter(bWriter);
     }catch(Exception e){
       System.err.println("Error al iniciar escritor "+e.getMessage());
     }
  }
  
  
  public void write(String texto){
    try{
      initWriter(true);
      writer.println(texto);
      writer.flush();
      bWriter.close();
    }catch(Exception e){
    }
  }
  
  public String read(){
    String tmp="";
    String text="";
    try{
      initReader();
      while((tmp=bReader.readLine())!=null){
        text+=tmp+"\n";
      }
    }catch(Exception e){
    System.err.println("Error al leer linea"+e.getMessage());
    }
    return text;
  }
  
  
}