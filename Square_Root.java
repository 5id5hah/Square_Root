public class Square_Root {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.println(Sqrt(n,p));
    }
    public static double Sqrt(int n, int p){
        int s = 0;
        int e = n;
        double root = 0.0;
        while (s >= e ){
            int m = s - (s+e)/2;
            if (m*m == root){
                return m;
            }
            if (m*m > root){
                e = m+1;
            }
            else {
                s = m+1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p ; i++) {
            while (root*root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
