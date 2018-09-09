class string{
    public static void main(String[] args){
        int n;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = scanner.next();
        System.out.println("Enter a number: ");
        n = scanner.nextInt();
        char c[] = new char[10000];
        int i = s.length()-n-1;
        for(int j=s.length(),a=0; j>=i; --j,a++){
            c[a] = s.charAt(j);
        }
        String str = new String(c);
        s = s + new String(new char[n]).replace("\0", str);
        System.out.println("%s",s);
    }
}