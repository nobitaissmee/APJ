public class MyLinkedList{
    public static void main(String[] args) {
        int []a ={0,1,3,4,5,6};
        int min=a[0];
        int indexMin=0;
        for (int i=1;i<a.length;i++) {
            if (a[i]<min){
                min=a[i];
                indexMin=i;
            }
        }
        int minTwo=a[0];
        if (minTwo==min) minTwo=a[1];
        for (int j=0;j<a.length;j++) {
            if (a[j]<minTwo && a[j]>min){
                minTwo=a[j];
            }
        }
        System.out.println(minTwo);
    }
}