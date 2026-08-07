import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i<n;i++){
             for(int l=n-1;l>i;l--){
                System.out.print(" ");
            }
            for (int j= 0;j<=i*2;j++){
                System.out.print("*");
                
            }
           
            System.out.println();
        }

            
        
        sc.close();
    }
}