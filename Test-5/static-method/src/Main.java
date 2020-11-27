public class Main {

    public static void main(String[] args) {
	// write your code here
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "HuyAnh");
        Student s2 = new Student(222, "HuyAnhLua");
        Student s3 = new Student(333, "HuyAnhNgu");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
