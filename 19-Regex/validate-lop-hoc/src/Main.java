public class Main {
    private static ClassExample classExample;
    private static final String [] className={"C0318G","M0318G","P0323A"};
    public static void main(String[] args) {

        classExample=new ClassExample();

        for (String value:className){
            boolean isvalid=classExample.validate(value);
            System.out.println(value + " " + isvalid);
        }
    }
}
