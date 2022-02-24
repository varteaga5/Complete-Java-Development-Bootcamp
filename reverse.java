class reverse{
    public static void main(String[] args) {
        // input: string
        // output: string

        // variable declaration
        String orig = "apples";
        String newWord = "";
        char ch;

        // loop over string 
        for (int i = 0; i < orig.length(); i++){

            
            // extract each character
            ch = orig.charAt(i);
                       
            // place each character in front of the existing string
            newWord = ch + newWord;
        }

        // print output
            System.out.println("this is newWord " + newWord);
            
    }
}