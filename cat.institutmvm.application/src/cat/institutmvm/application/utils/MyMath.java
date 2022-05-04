package cat.institutmvm.application.utils;

import java.util.Random;

public class MyMath {
    public static final double PI = 3.14159265;
    public static final double E = 2.71828;
    public static final double PHI = (1 + Math.sqrt(5))/2;
    private static final Random RND = new Random();
    public static final int BASE_2 = 2;
    public static final int BASE_8 = 8;
    public static final int BASE_10 = 10;
    public static final int BASE_16 = 16;

    //evitem instàncies de la classe estàtica
    private MyMath(){}

    
    /** 
     * @param value
     * @return boolean
     */
    public static boolean isEven(int value){
        return value % 2 == 0;
    }

    
    /** 
     * @param value
     * @return boolean
     */
    public static boolean isOdd(int value){
        return !isEven(value);
    }

    
    /** 
     * @param bound
     * @return int
     */
    public static int nextInt(int bound){
        return RND.nextInt(bound+1);
    }

    
    /** 
     * @param value
     * @return int
     */
    public static int abs(int value){
        return value < 0 ? -value : value;
    }
    
    
    
    /** 
     * @param ...ops
     * @return double
     */
    //varargs: arguments variables
    public static double avg(double ...ops){
        var suma = 0;
        for(var op : ops){
            suma += op;
        }
        return suma / (ops.length);
    }

    
    /** 
     * @param op1
     * @param op2
     * @param ops
     * @return double
     */
    public static double max(double op1, double op2, double... ops){
        var max =  (op1 >= op2) ? op1 : op2;
        for(var op : ops){
            max =  (op >= max) ? op : max;
        }
        return max;
    }

    
    /** 
     * @param op1
     * @param op2
     * @param ops
     * @return double
     */
    public static double min(double op1, double op2, double... ops){
        var min =  (op1 <= op2) ? op1 : op2;
        for(var op : ops){
            min =  (op <= min) ? op : min;
        }
        return min;
    }
}
