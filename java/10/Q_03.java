public class Q_03 {
    public static void main(String[] args) {

        MyInteger num1 = new MyInteger(7);
        MyInteger num2 = new MyInteger(7);
        MyInteger num3 = new MyInteger(25);

        System.out.printf("Number 1 = %d isPrime: %b isOdd: %b isEven %b\n",
                num1.getValue(), num1.isPrime(), num1.isOdd(), num1.isEven());

        System.out.printf("Number 2 = %d isPrime: %b isOdd: %b isEven %b\n",
                num2.getValue(), num2.isPrime(), num2.isOdd(), num2.isEven());
        System.out.printf("Number 3 = %d isPrime: %b isOdd: %b isEven %b\n",
                num3.getValue(), num3.isPrime(), num3.isOdd(), num3.isEven());

        System.out.printf("Num 1 == Num 2: %b\n", num1.equals(num2));
        System.out.printf("Num 1 == Num 3: %b\n", num1.equals(num3));
        System.out.printf("Parse int 100 string value == %d\n", MyInteger.parseInt("100"));
        System.out.printf("Parse int 150 char array value == %d\n", MyInteger.parseInt("150".toCharArray()));
    }
}

class MyInteger {
    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isPrime() {
        double range = Math.sqrt(value);
        for (int i = 2; i < range; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return !isEven(value);
    }

    public static boolean isPrime(int value) {
        double range = Math.sqrt(value);

        for (int i = 2; i < range; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.value;
    }

    public static int parseInt(char[] value) {

        double valueDouble = 0;
        int toPower = value.length - 1;
        for (char aValue : value) {

            valueDouble += Math.pow(10, toPower--) * (aValue - '0');
        }

        return (int)valueDouble;
    }

    public static int parseInt(String value) {

        return MyInteger.parseInt(value.toCharArray());
    }
}
