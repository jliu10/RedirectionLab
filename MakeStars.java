import java.util.*;
public class MakeStars{
  public static String starify(String word){
    String stars="";
    for(int i=0;i<word.length();i++){
      stars+="*";
    }
    return stars;
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
          System.out.print(starify(word));
          if(w.hasNext()) System.out.print(" ");
        }
        System.out.println();
      }

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()

  }
}
