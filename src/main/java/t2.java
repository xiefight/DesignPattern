import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * @author xietao
 * @date 2021-08-04 23:11
 */
public class t2 {
    private static ByteBuffer buffer = ByteBuffer.allocate(8);
    public static long bytesToLong(byte[] bytes) {
        buffer.put(bytes, 0, bytes.length);
        buffer.flip();//need flip
        return buffer.getLong();
    }
    public static byte[] longToBytes(long x) {
        buffer.putLong(0, x);
        return buffer.array();
    }

    public static void main(String[] args) {
        method2(2560);

    }

    public static void method3(long a){
        String s = Long.toBinaryString(a);
        System.out.println("s=="+s);
        long i = Long.parseLong(s, 2);
        System.out.println("i=="+i);
    }

    public static void method2(int a){
        String s = Integer.toBinaryString(a);
        System.out.println("s=="+s);
        int i = Integer.parseInt(s, 2);
        System.out.println("i=="+i);
    }

    public void method1(){
        //        byte[] b = new byte[]{-75,-123,42,-79,-13,1,-104,22};
        byte[] b = new byte[]{18,35,107,51,-23,1,-104,22};
        System.out.println(bytesToLong(b));
        System.out.println(Arrays.toString(longToBytes(-5366836437167532010L)));
    }

}
