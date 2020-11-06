public class Main {

    public static void main(String[] args){

        // CHALLENGE //
        byte myByte = 1;
        short myShort = 2;
        int myInt = 3;
        long myLong = 50000L + (10L * (myByte + myShort + myInt));
        System.out.println(myLong);

        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
    }
}
