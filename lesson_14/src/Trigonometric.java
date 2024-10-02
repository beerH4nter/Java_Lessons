import java.math.MathContext;
import java.util.ArrayList;

public class Trigonometric
{
    public static double getSumSinuses(double[] angles, int type){
        double sinSum = 0;
        for (int i = 0; i < angles.length; i++)
        {
            sinSum += Math.sin(angles[i]);
        }
        if(type == 0){
            return Math.toDegrees(sinSum);
        } else {
            return sinSum;
        }

    }

    public static double getSumCosinuses(double[] angles, int type){
        double cosSum = 0;
        for (int i = 0; i < angles.length; i++)
        {
            cosSum += Math.cos(angles[i]);
        }
        if(type == 0){
            return Math.toDegrees(cosSum);
        } else {
            return cosSum;
        }
    }

    public static double getComposSinuses(double[] angles, int type){
        double sinCompos = 1;
        for (int i = 0; i < angles.length; i++)
        {
            sinCompos *= Math.sin(angles[i]);
        }
        if(type == 0){
            return Math.toDegrees(sinCompos);
        } else {
            return sinCompos;
        }

    }

    public static double getComposCosinuses(double[] angles, int type){
        double cosCompos = 1;
        for (int i = 0; i < angles.length; i++)
        {
            cosCompos *= Math.cos(angles[i]);
        }
        if(type == 0){
            return Math.toDegrees(cosCompos);
        } else {
            return cosCompos;
        }

    }

    public static double getDifSinuses(double[] angles, int type){
        double sinDif = 0;
        for (int i = 0; i < angles.length; i++) {
            sinDif -= Math.sin(angles[i]);
        }
        if(type == 0){
            return Math.toDegrees(sinDif);
        } else {
            return sinDif;
        }
    }

    public static double getDifCosinuses(double[] angles, int type){
        double cosDif = 0;
        for (int i = 0; i < angles.length; i++) {
            cosDif -= Math.cos(angles[i]);
        }
        if(type == 0){
            return Math.toDegrees(cosDif);
        } else {
            return cosDif;
        }
    }


}
