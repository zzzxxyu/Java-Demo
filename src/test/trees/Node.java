package test.trees;

/**
 * @Author ：Yu
 * @Date ：Created in 16:44 2019/7/18
 * @Description： 二叉树点类
 * @Modified By：
 */
public class Node {
    private int value;
    private Node leftNode;
    private Node rightNode;
    public Node(int value,Node leftNode,Node rightNode){
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
}
