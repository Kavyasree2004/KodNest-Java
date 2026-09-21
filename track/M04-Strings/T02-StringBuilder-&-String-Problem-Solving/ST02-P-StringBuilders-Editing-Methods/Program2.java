public class Program2{
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        System.out.println(sb1);

        sb1.append(" Program");
        System.out.println(sb1);

        sb1.insert(0, "Python ");
        System.out.println(sb1);

        sb1.delete(0,4);
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);;

    }
}