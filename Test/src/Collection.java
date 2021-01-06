import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<String> arraylist = new ArrayList<String>();
        // Luu theo index

        LinkedList<String> linkedList = new LinkedList<>();
        //Double-link
        //[1,2,3,4,5]
        linkedList.add("xxxx");
        linkedList.add("cccc");
        linkedList.add("cccc");
        //Cach tu tim hieu, tu tim kiem
        // Khi nao nen dung Arraylist?
        // Khi nao nen dung linkedList?
        // Su khac nhau cua 2 ong nay. ( cach hoat dong)
        //Abstract - Interface

        //ArrayList cai dat cua List, trien khai

        //Thuc hanh lai cac ham co san cua ArrayList

        //lam sao contains tra ve true
        ArrayList<Haha> haha = new ArrayList<Haha>();
        haha.add(new Haha("Long", "1"));
        haha.add(new Haha("Huy", "2"));

        Haha timkiem = new Haha("Ngu", "1");
        for (Haha value: haha){
             if (value.name.contains(timkiem.name)){
                 System.out.println("true");
                 break;
             }
        }
//        System.out.println(haha.contains(timkiem));
        // e chi roi.

        //Dung Arraylist lam thuat toan, de xu ly business

    }

}