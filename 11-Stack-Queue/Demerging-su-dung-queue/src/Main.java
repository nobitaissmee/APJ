import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Human male1=new Human("Do Quang Phuoc",Human.MALE,"15/12/2001");
        Human male2=new Human("Nguyen Duy Xuan Thang",Human.MALE,"16/12/2001");
        Human male3=new Human("Nguyen Hai",Human.MALE,"17/12/2001");

        Human female1=new Human("Phan Thi Kieu Trinh",Human.FEMALE,"18/12/2001");
        Human female2=new Human("Phan Thi Kieu Oanh",Human.FEMALE,"19/12/2001");
        Human female3=new Human("Phan Thi Kieu Diem",Human.FEMALE,"20/12/2001");

        Human [] arr={male1,male2,male3,female1,female2,female3};
        System.out.println("First:");
        for (Human human:arr){
            System.out.println(human.getName()+ " "+ human.getGender()+ " "+human.getDayOfBirth());
        }

        System.out.println("Second:");

        LinkedList<Human> result=new LinkedList<>();
        Queue<Human> maleOnly=new LinkedList<>();

        for (Human human:arr){
            if (human.getGender().equals(Human.FEMALE)){
                result.offer(human);
            } else maleOnly.offer(human);
        }

        while (!maleOnly.isEmpty()){
            result.offer(maleOnly.poll());
        }

        for (Human human:result){
            System.out.println(human.getName()+ " "+ human.getGender()+ " "+human.getDayOfBirth());
        }
    }
}
