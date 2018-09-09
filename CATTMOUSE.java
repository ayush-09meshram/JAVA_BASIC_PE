
    class CATMOUSE
{
    public static void main(String args[]){
        int n;
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter a number to check if it is Tom or Jerry: ");
        n = scan.nextInt();
        if(n>20 && n<30){
            if(n%2==0){
                System.out.println("Jerry");
            }
            else{
                System.out.println("Tom");
            }
        }
}
}