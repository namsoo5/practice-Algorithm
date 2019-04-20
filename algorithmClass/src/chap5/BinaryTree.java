package chap5;

public class BinaryTree {
    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        //재귀로 구현
        public void add(int value) {
            if (value < this.value) {
                if (left == null) left = new Node(value);
                else left.add(value);
            } else if (value > this.value) {
                if (right == null) right = new Node(value);
                else right.add(value);
            }
            // (value == this.value)인 경우 add 하지 않고 무시한다;
        }

        //반복문으로 구현
        public void addf(int value){
            Node temp = this;

            while(true) {
                if (value < temp.value) { //값작으면 왼쪽
                    if (temp.left == null) {
                        temp.left = new Node(value);
                        break;
                    }
                    temp = temp.left;
                } else if (value > temp.value) {  //값크면 오른쪽
                    if (temp.right == null) {
                        temp.right = new Node(value);
                        break;
                    }
                    temp = temp.right;
                }
            }
        }

        public void print() {
            if (left != null) left.print();
            System.out.printf("%d ", value);
            if (right != null) right.print();
        }

        public boolean contains(int value) {
            if (value < this.value)
                return left != null && left.contains(value);
            else if (value > this.value)
                return right != null && right.contains(value);
            return true;
            // (value == this.value)인 경우return true;
        }

        public int getLeftMostValue() {
            if (this.left != null) return this.left.getLeftMostValue();
            return this.value;
        }

        public void remove(int value, Node parent) {
            if (value < this.value) {
                if (left != null) left.remove(value, this);
            } else if (value > this.value) {
                if (right != null) right.remove(value, this);
            } else {
                if (left != null && right != null) {
                    int temp = right.getLeftMostValue();
                    //this.value 다음으로 큰 값
                    this.value = temp;
                    right.remove(temp, this);
                } else {
                    Node child = (left != null) ? left : right;
                    if (parent.left == this) parent.left = child;
                    else parent.right = child;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 18, 1, 12, 7, 2, 14, 6, 9, 15};
        Node root = new Node(10);
        for (int i = 0; i < a.length; ++i) root.addf(a[i]);
        root.print();
        System.out.println();
    }
}
