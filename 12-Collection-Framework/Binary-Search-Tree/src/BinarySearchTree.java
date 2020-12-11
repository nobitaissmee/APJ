public class BinarySearchTree<E extends Comparable<E>> {
    private static class TreeNode<T> {
        private T element;
        protected TreeNode<T> left;
        protected TreeNode<T> right;

        public TreeNode(T e) {
            element = e;
        }

        @Override
        public String toString() {
            return
                    "element=" + element +
                            ", left:" + left +
                            ", right:" + right +
                            "|";
        }
    }

    private int size = 0;
    private TreeNode<E> root;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean goRight(E element, E nodeElement) {
        return element.compareTo(nodeElement) > 0;
    }

    public TreeNode<E> getNextNode(E element, TreeNode<E> child) {
        return (goRight(element, child.element)) ? child.right : child.left;
    }

    public void add(E data) {
        TreeNode<E> newNode = new TreeNode<>(data);
        if (isEmpty()) {
            root = newNode;
        } else {
            TreeNode<E> father = null;
            TreeNode<E> child = root;
            while (child != null) {
                father = child;
                child = getNextNode(data, child);
            }
            chooseTreeNode(father, data, newNode);
        }
        size++;
    }

    public void chooseTreeNode(TreeNode<E> father, E element, TreeNode<E> child) {
        if (goRight(element, father.element)) {
            father.right = child;
        } else father.left=child;

    }

    public void remove(E data) {
        if (isEmpty()) return;
        TreeNode<E> father = null;
        TreeNode<E> child = root;

        while (child != null) {
            if (child.element.equals(data)) break;
            father = child;
            child = getNextNode(data, child);
        }
        beginRemoveNode(father, child);
    }

    public void beginRemoveNode(TreeNode<E> father, TreeNode<E> removing) {
        if (removing == null) return;
        if (removing.left == null) {
            removeNodeHasNoLeftNode(father, removing);
        } else removeNodeHasLeftNode(removing);
    }

    public void removeNodeHasNoLeftNode(TreeNode<E> father, TreeNode<E> removing) {
        if (father == null) {
            root = removing.right;
        } else {
            checkAndConnectNode(father, removing, removing.right);
        }
    }

    public void checkAndConnectNode(TreeNode<E> father, TreeNode<E> removing, TreeNode<E> removingRight) {
        if (goRight(removing.element, father.element)) {
            father.right = removingRight;
        } else father.left = removingRight;
    }

    public void removeNodeHasLeftNode(TreeNode<E> removing) {
        TreeNode<E> newFather = removing;
        TreeNode<E> rightMostNode = removing.left;
        while (rightMostNode.right != null) {
            newFather = rightMostNode;
            rightMostNode = rightMostNode.right;
        }

        removing.element = rightMostNode.element;
        reconnectWithNode(removing, rightMostNode, newFather);
    }

    public void reconnectWithNode(TreeNode<E> removing, TreeNode<E> rightMostNode, TreeNode<E> newFather) {
        if (rightMostNode == newFather) {
            newFather.left = rightMostNode.left;
        } else newFather.right = rightMostNode.left;
    }

    public void printTree() {
        System.out.println("Tree:");
        System.out.println(root);
    }

    public void postOrderTraversal() {
        postOrderRecursion(root);
    }

    private void postOrderRecursion(TreeNode<E> node) {
        if (node.left != null) {
            postOrderRecursion(node.left);
        }

        if (node.right != null) {
            postOrderRecursion(node.right);
        }
        System.out.println(node.element);
    }

    public void preOrderTraversal(){
        preOrderRecursion(root);
    }

    private void preOrderRecursion(TreeNode<E> node){
        System.out.println(node.element);

        if(node.left !=null){
            preOrderRecursion(node.left);
        }

        if(node.right!=null){
            preOrderRecursion(node.right);
        }
    }

    public void inOrderTraversal(){
        inOrderRecursion(root);
    }

    private void inOrderRecursion(TreeNode<E> node){
        if (node.left !=null){
            inOrderRecursion(node.left);
        }

        System.out.println(node.element);

        if (node.right !=null){
            inOrderRecursion(node.right);
        }
    }

    public boolean contains(E data) throws NodeNotFoundException {
        if (isEmpty()) throw new NodeNotFoundException("Tree is null");;
        TreeNode<E> child=root;
        while(child != null){
            if (child.element.equals(data)) return true;
            child=getNextNode(data,child);
        }
        return false;
    }
}