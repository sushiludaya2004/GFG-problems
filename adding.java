public class add {
    public static void main(String[] args) {
        int n = 12345;
        add(n,0);
    }

    static void add(int n, int sum){
//        int sum = 0;
        if(n == 0){
            System.out.println(sum);
            return;
        }

       // sum = sum + n%10;
        add(n/10,(sum+ n%10));

    }
}
