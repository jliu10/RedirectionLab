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

  public static boolean isLetter(String a){
    String letters="abcdefghijklmnopqrstuvwxyz";
    return letters.contains(a);
  }

  public static boolean isNumber(String a){
    String numbers="0123456789";
    return numbers.contains(a);
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
    if(s.length()>=2 && isDigraph(s.substring(0,2))){
      result=s;
      if(s.length()>2) result=s.substring(2,s.length())+s.substring(0,2);
      result+="ay";
    }
    else if(isVowel(s.charAt(0))) result=s+"hay";
    else{
      result=s;
      if(s.length()>1) result=s.substring(1,s.length())+s.substring(0,1);
      result+="ay";
    }
    return result;
  }

  public static String pigLatinBest(String s){
    s=s.toLowerCase();
    String result="";
    if(!isLetter(s.substring(0,1))) result=s;
    else{
      String punc="";
      if(!isLetter(s.substring(s.length()-1,s.length())) &&
         !isNumber(s.substring(s.length()-1,s.length()))){
           punc=s.substring(s.length()-1,s.length());
      }
      if(s.length()>=2 && isDigraph(s.substring(0,2))){
        if(punc.length()>0) s=s.substring(0,s.length()-1);
        result=s;
        if(s.length()>2) result=s.substring(2,s.length())+s.substring(0,2);
        result+="ay"+punc;
      }
      else if(isVowel(s.charAt(0))){
        if(punc.length()>0) s=s.substring(0,s.length()-1);
        result=s+"hay"+punc;
      }
      else{
        if(punc.length()>0) s=s.substring(0,s.length()-1);
        result=s;
        if(s.length()>1) result=s.substring(1,s.length())+s.substring(0,1);
        result+="ay"+punc;
      }
    }
    return result;
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
          System.out.print(pigLatinBest(word));
          if(w.hasNext()) System.out.print(" ");
        }
        System.out.println();
      }

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()

  }
}
