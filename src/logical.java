public class logical {

    public int multi(int i){
        if(i%2 !=0){
            return i;
        }
        else if(i%2 == 0){
            return (i-(i%10) + 10);
        }
        else{
            return  -1;
        }
    }

    public static void main(String[] args) {
        logical m1=new logical();
        int num=75;
       if(m1.multi(num)<0) {
           System.out.println("Invalid Number");
       }
       else{
           System.out.println(m1.multi(num));
       }
    }
}
