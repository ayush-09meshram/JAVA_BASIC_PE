
class Palindrome{
    public static void main(String args[]){
        int a,sum = 0,temp,r;
        int n,count = 0, even_number_count=0;
        int number[] = new int[100000];
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome: ");
        n = scanner.nextInt();
        temp = n;
        while(n>0){
            a = n%10;
            number[count] = a;
            sum = (sum*10) + a;
            n = n/10;
            count = count + 1;
        }
        if(temp==sum)
        {
            for(int i=0; i<count ;i++){
                if(number[i]%2 == 0) {
                    even_number_count = even_number_count + number[i];
                }
            }
            if(even_number_count>25) {
                System.out.printf("%d is palindrome and the sum of even numbers is greater than 25\n", temp);
            }
            else{
                System.out.printf("%d is palindrome and the sum of even numbers is less than 25\n", temp);
            }
        }
        else{
            System.out.printf("%d is not palindrome", temp);
        }
    }
}