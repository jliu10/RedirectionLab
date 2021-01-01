 import java.util.*;
public class PigLatin{
  public static boolean isVowel(char a){
    return a=='a'||a=='e'||a=='i'||a=='o'||a=='u';
  }

  public static boolean isDigraph(String a){
    String digraphs="bl,br,ch,ck,cl,cr,dr,fl,fr,gh,gl,gr,ng,ph,pl,"+
    "pr,qu,sc,sh,sk,sl,sm,sn,sp,st,sw,th,tr,tw,wh,wr";
    return digraphs.contains(a);
  }

  public static String pigLatinSimple(String s){
    s=s.toLowerCase();
    String result="";
    if(isVowel(s.charAt(0))) result=s+"hay";
    else{
      result=s;
      if(s.length()>1) result=s.substring(1,s.length())+s.substring(0,1);
      result+="ay";
    }
    return result;
  }

  public static String pigLatin(String s){
    s=s.toLowerCase();
    String result="";
    //if()
    return s;
  }

  public static String pigLatinBest(String s){
    s=s.toLowerCase();
    return s;
  }

  public static void main( String[]args ){
      //use the standard input (terminal input)
      //as the string that you read from
      Scanner n = new Scanner( System.in );
      //use hasNextLine()/nextLine() to loop over
      //all of the data
      while(n.hasNext()){
        Scanner w=new Scanner(n.nextLine());
        while(w.hasNext()){
          String word=w.next();
          System.out.print(pigLatinSimple(word));
          if(w.hasNext()) System.out.print(" ");
        }
        System.out.println();
      }

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()

  }
}
