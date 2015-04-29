public class NBody {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        double R = StdIn.readDouble();

        double[] px = new double[N];
        double[] py = new double[N];
        double[] vx = new double[N];
        double[] vy = new double[N];
        double[] m = new double[N];
        String[] image = new String[N];

        for (int i = 0; i < N; i++) {
            px[i]       = StdIn.readDouble();
            py[i]       = StdIn.readDouble();
            vx[i]       = StdIn.readDouble();
            vy[i]       = StdIn.readDouble();
            m[i]        = StdIn.readDouble();
            image[i]    = StdIn.readString();
        }


        StdOut.printf("%d\n", N);
        StdOut.printf("%.2e\n", R);
        for (int i = 0; i < N; i++)
            StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n", px[i], py[i], vx[i], vy[i], m[i], image[i]);
    }
}

