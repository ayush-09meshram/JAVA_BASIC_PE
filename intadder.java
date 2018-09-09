class randomadder{
    public static void main(String[] args){
        int flag=1,sum=0,randomnumber;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while(flag==1){
            System.out.println("Enter a number:");
            if(sc.hasNextInt()){
                randomnumber = sc.nextInt();
                sum = sum + randomnumber;
            }
            else{
                System.out.print("Error");
                flag = 0;
            }

        }
        System.out.printf("Sum is %d:", sum);
        /*for(int i=0; i<count; i++){
            if(sc.hasnextInt()){
                randomnumber = sc.nextInt();
                sum = sum + randomnumber;
            count = count + 1;
            }
            else{
                System.out.print("Error");
            }
        }*/
    }
}
