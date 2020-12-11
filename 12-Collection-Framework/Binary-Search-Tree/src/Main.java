public class Main {
    public static void main(String[] args) throws NodeNotFoundException {
        BinarySearchTree<Integer> bST=new BinarySearchTree<>();
//        bST.add(100);
//        bST.add(80);
//        bST.add(90);
//        bST.add(82);
//        bST.add(95);
//        bST.add(70);
//        bST.add(68);
//        bST.add(72);
//        bST.add(75);
        bST.printTree();
//        System.out.println("test");
//        bST.postOrderTraversal();
//        bST.preOrderTraversal();
//        bST.inOrderTraversal();
        if (bST.contains(100)) System.out.println("Có");
         else System.out.println("Ko có");
    }
}
