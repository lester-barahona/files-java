public class Test{

  public static void main(String [] args){
  
  Files files=new Files();
  files.write("lety1");
 System.out.println(files.read());
   files.write("lety2");
 System.out.println(files.read());

  }


}