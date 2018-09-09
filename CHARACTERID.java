class charID{
    public static void main(String[] args){
        System.out.println("Enter a character:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if (ch>=65 && ch<=90)
           System.out.println("Capital letter");
        else if (ch>=97 && ch<=122)
            System.out.println("Small letter");
        else if (ch>=48 && ch<=57)
            System.out.println("Digit");
        else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)||
                (ch>=91 && ch<=96)||(ch>=123 && ch<=127))
            System.out.println("Special symbol");
    }
}
