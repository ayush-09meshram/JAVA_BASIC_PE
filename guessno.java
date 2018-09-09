class guessit{
    public static void main(String[] args){
        System.out.println("Enter the number to be guessed: ");
        int n,g;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("Enter your guess: ");
        g = scanner.nextInt();
        if(n<100 && n>1){
            if(n==g)
                System.out.println("Number guessed matches the original number");
            else if(n<g)
                System.out.println("Number guessed is more than original number");
            else if(n>g)
                System.out.println("Number guessed is less than original number");
        }
    }
}