import java.util.*;

class Prog2 {
    public static void main(String[] args) {
        String pwd,rpwd;
        int cnt,r;
        cnt=1;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Enter password:");
            pwd=in.next();
            System.out.println("Re-enter password:");
            rpwd=in.next();
            if(r==0){
                System.out.println("Correct password");
            }
            else{
                System.out.println("Passwords do not match, try again");
                cnt+=1;
            }
            while(r!=0 && cnt<=3);
            }
        }
}