package oop;

public class UserInput {
    
    public static String chaine="";
    
    public static class TextInput {
        
    	StringBuilder sb = new StringBuilder(chaine);
        public void add(char c){
            chaine = sb.append(c).toString();
        }
        public String getValue(){
            return chaine;
        }
    }

    public static class NumericInput extends TextInput{
        public void add(char c){
            if (Character.isDigit(c)){
                super.add(c);
            }
        }
        
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
