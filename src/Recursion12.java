//Move  all 'x' to the end of string 

public class Recursion12 {
    public static void move( int ind , String NewWord ,int counter , String word){
//Base condition

if ( ind == word.length()){
     for( int i =0 ;i <counter ;i++) {
        NewWord +='x';
     }  
 System.out.println(NewWord);
 return;
}

        if( word.charAt(ind) == 'x'){
            counter ++;
             move(ind+1, NewWord, counter, word);
            return;

        }else{
            
            NewWord += word.charAt(ind);
             move(ind+1, NewWord, counter, word);
        }    
    }
    public static void main(String[] args){
        String word = "affdghxsfxxxfdhgx";
     
      move(0 , "" , 0 , word);
    }
}
