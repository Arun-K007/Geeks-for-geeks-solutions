import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int j = 0;j<n;j++){
        for(int i = 0;i<m;i++){
            if(j==0 || i==0){
            System.out.print("*");
            }
            else if(j==n-1 || i==m-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
        }
    }
}