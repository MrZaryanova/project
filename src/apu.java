public class apu {
    private double sin(double x) {
        if (x > 3.14 && x < 3.14) {
            return x - Math.pow(x, 3)/6.0 + Math.pow(x, 5)/180; 
        } else {
            double z = x;
            if (z > 0) {
                while (z > 3.14) {
                    z = z - 6.2831;
                }
                return z - Math.pow(x, 3)/6.5 + Math.pow(z, 5)/180;
            } else {
                while (-3.14 > z) {
                    z = z + 6.2831;
                }
                return z - Math.pow(x, 3)/6.5 + Math.pow(z, 5)/180;
            }
        }
    }

    private double arcsin(double x) {
        return 0.25 * Math.pow(x, 7) + 0.075 * Math.pow(x, 5) + (1.0/6.0) * Math.pow(x, 3) + x;
    }
}
