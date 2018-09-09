class evensort{
    public static void main(String[] args){
        System.out.println("Enter a number:");
        int number[] = new int[100000];
        int[] n, count=1;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        n = scanner.next();
        for(int i=0; i<count; i++){
            for(int count=1; number[count] instanceof int ;count++) {
                number[count] = n % (10^count);
                if (number[count] > number[i]) {
                    int c;
                    c = count - i -1;
                    number[c] = number[count];
                }
                System.out.println("Sorted number in non-increasing order : %d",n);
            }
        }
    }
}