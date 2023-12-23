//Remove duplicates from string

public class Recursion13 {
        public  static Boolean [] Alpha = new Boolean[26];  
    public static void Duplicates( String word , int ind ,String newWord){

        //Base case

    if( ind == word.length()){
        System.out.println(newWord);
        return;
    }

        char currChar = word.charAt(ind);
        if( Alpha[currChar -'a'] == true){
            Duplicates(word, ind+1, newWord);
        } else{
            newWord += currChar;
             Alpha[currChar - 'a'] = true;
             Duplicates(word, ind+1, newWord);
        }
    }
    public static void main(String[] args){
        String word ="abbccda";

        for(int i =0 ; i<26 ;i++){
            Alpha[i]=false;
        }
        Duplicates(word , 0 ,"");
        
    }
}
