import java.util.*;



public class Main {
    public static void main(String[] args) {
        Password p=new Password();
        String pw="";
        int pw_l=8;
        Scanner sc = new Scanner(System.in);
        System.out.println("how long do you want your pw, must be minimum of 8");
        pw_l = sc.nextInt();
        if(pw_l<8){
            pw_l=8;
        }
        System.out.println("do you want your pw of have an upper case letter, 1 for yes 2 for no");
        int aw=sc.nextInt();

        if(aw==1){
            pw=p.GetUpper();
        }
         System.out.println("do you want your pw of have a special character 1 for yes 2 for no");
        aw=sc.nextInt();
        if(aw==1){}

        for(int i=0;i<(pw_l-pw.length())/2;i++){

        }




    }
}