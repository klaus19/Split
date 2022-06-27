public class ValueOf {



    public static void main(String[] args) {
        ValueOf v = new ValueOf();
        char[]arr = new char[5];
        arr[0]='a';
        arr[1]='b';
        arr[2]='c';
        arr[3]='d';
        arr[4]='e';

        String s1 = String.valueOf(arr);
        System.out.println(s1);

    }
}
