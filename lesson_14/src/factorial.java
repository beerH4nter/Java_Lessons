import  java.math.BigInteger;


public class factorial {
    public static BigInteger simpleFactorial(int num){
        BigInteger result = BigInteger.ONE;
        BigInteger number = new BigInteger(Integer.toString(num + 1));
        for(BigInteger i = BigInteger.ONE; !i.equals(number); i = i.add(BigInteger.ONE)){
            result = result.multiply(i);
        }
        return result;
    }


    public static BigInteger recursiveFactorial(BigInteger num)
    {
        if(num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE))
        {
            return BigInteger.ONE;
        }
        else
        {
            return num.multiply(recursiveFactorial(num.subtract(BigInteger.ONE)));
        }
    }
}
