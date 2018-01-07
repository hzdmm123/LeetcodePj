package swordoffer.P_2017_12_4;

/**
 * Created by hzdmm on 2017/12/4.
 */
public class Power {
    public double Power(double base, int exponent) {
        if (base==0&&exponent==0){
            return 0;
        }

        if (exponent==0){
            return 1;
        }

        int exp = exponent;
        if (exp<0){
            exp = -exp;
        }

        double result;
        result = resultPower(base,exponent);
        if (exponent<0){
            result = 1/result;
        }

        return result;
    }

    public static double resultPower(double base,int exponent){
        if (exponent==0){
            return 1;
        }

        double result = resultPower(base,exponent>>1);
        result*=result;
        if (exponent%2==1){
            result *= base;
        }

        return result;

    }
}
