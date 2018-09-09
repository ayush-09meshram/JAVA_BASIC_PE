class string{
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = scanner.next();

        for(int i = s.length() - 1; i >= 0; --i)
        {
            System.out.println(s.charAt(i));
        }
    }
}