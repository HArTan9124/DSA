public class pattern6 {
    public static void main(String[] args) {
        for(int i=0 ;i<9;i++){
            for(int j=0;j<9;j++){
                if (j==i || j== 9 -i-1) {
                System.out.print("#");
                    
                }else{
                    System.out.print(" ");
                } 
            }
            System.out.println(" ");
        }
    }
    
}
