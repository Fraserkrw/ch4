public class Multadd {
    public static void main(String[] args) {
        System.out.println(multadd(1, 2, 3));
        System.out.println(multadd(Math.cos(Math.PI/4), 0.5, Math.sin(Math.PI/4)));
        System.out.println(multadd(1, Math.log(10), Math.log(20)));
        System.out.println(expSum(5));
        
    }
    
    public static double multadd(double a, double b, double c) {
        double sum = a * b + c;
        return sum;
    }
    
    public static double expSum(double num) {
        final double e = 2.71828;
        double sum = multadd(num, Math.exp(-num), Math.sqrt(1 - Math.exp(-num)));
        return sum;
    }
}