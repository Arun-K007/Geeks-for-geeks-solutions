import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sos = 0;
        for(int i =1;i<=n;i++){
            sos +=i;
        }

        System.out.print(sos);
}
}