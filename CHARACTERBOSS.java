class characterbasic{
    public static void main(String args[]){
        int count=1;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = scanner.next();
        char word[1000] = s.toCharArray();
        for(int i=0; i<count; i++)
        {
            if(word[i]=='a'||word[i]=='e'||word[i]=='i'||word[i]=='o'||word[i]=='u'||word[i]=='A'||word[i]=='E'||word[i]=='I'||word[i]=='O'||word[i]=='U'){
                System.out.print("Vowel"+" ");
                count=count+1;
            }
            else{
                System.out.print("Consonant"+" ");
                count=count+1;
            }

        }
    }
}
