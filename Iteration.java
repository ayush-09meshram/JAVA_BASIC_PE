class numbertree{
    public static void main(String args[]){
        int n;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        n = scanner.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(i + " ");
            }
        }
    }
}
