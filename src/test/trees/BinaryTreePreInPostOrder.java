package test.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author ：Yu
 * @Date ：Created in 16:47 2019/7/18
 * @Description：二叉树的前中后序遍历
 * @Modified By：
 *
 * 前序遍历方式为：根节点->左子树->右子树
 *
 * 中序遍历方式为：左子树->根节点->右子树
 *
 * 后序遍历方式为：左子树->右子树->根节点
 */
public class BinaryTreePreInPostOrder {
    //static int count;
    public static void main(String[] args){
        BinaryTreePreInPostOrder binaryTreePreInPostOrder = new BinaryTreePreInPostOrder();
        Node root = binaryTreePreInPostOrder.init();
        /*System.out.println("前序遍历");
        binaryTreePreInPostOrder.preOrder(root);
        System.out.println();
        binaryTreePreInPostOrder.preOrderStack(root);
        System.out.println("中序遍历");
        binaryTreePreInPostOrder.inOrder(root);
        System.out.println();
        binaryTreePreInPostOrder.inOrderStack(root);
        System.out.println("后续遍历");
        binaryTreePreInPostOrder.postOrder(root);
        System.out.println();
        binaryTreePreInPostOrder.postOrderStack(root);
        System.out.println("二叉树深度");
        System.out.println(binaryTreePreInPostOrder.treeDepthV2(root));
        System.out.println(binaryTreePreInPostOrder.treeDepth(root));
        System.out.println(binaryTreePreInPostOrder.treeDepthQueue(root));
        System.out.println();*/
        System.out.println("判断是否平衡二叉树");
        System.out.println(binaryTreePreInPostOrder.isBalanced(root));
        System.out.println(binaryTreePreInPostOrder.treeDepthV2(root) != -1);
        System.out.println(binaryTreePreInPostOrder.isBalancedNotRecu(root));



    }

    //判断是否平衡二叉树 递归 https://blog.csdn.net/Zheng548/article/details/65935030
    private static boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        int left = treeDepth(root.getLeftNode());
        int right = treeDepth(root.getRightNode());
        return Math.abs(left - right) <= 1 && isBalanced(root.getLeftNode()) && isBalanced(root.getRightNode());
    }

    //判断是否平衡二叉树 非递归
    private static boolean isBalancedNotRecu(Node root) {
        return height(root) != -1;
    }
    private static int height(Node node) {
        //第一步：判断node == null
        if (node == null) {
            return 0;
        }
        // 第二步：求左子树高度
        int lH = height(node.getLeftNode());
        //第五步:如果左子树不是平衡的，则子节点 也不是
        if (lH == -1) {
            return -1;
        }
        // 第三步：求右子树高度
        int rH = height(node.getRightNode());
        //第五步后；如果右子树不是平衡的，则子节点 也不是
        if (rH == -1) {
            return -1;
        }
        // 第四步： 判断node 左右子树高度相差，
        // 如果不是AVL，返回高度 -1
        if (Math.abs(lH - rH) > 1) {
            return -1;
        }
        //第四步后续：如果是AVL，返回此node结点的高度
        return Math.max(lH, rH) + 1;
    }


    //二叉树深度 递归
    private static int treeDepthV2(Node root) {
        if(root == null) return 0;
        int left = treeDepth(root.getLeftNode());
        if(left == -1) return -1;
        int right = treeDepth(root.getRightNode());
        if(right == -1) return -1;
        return Math.abs(left-right) > 1 ? -1 : Math.max(left,right) + 1;
    }

    //二叉树深度 递归
    private static int treeDepth(Node root) {
        if(root == null){
            return 0;
        }
        int left = treeDepth(root.getLeftNode());
        int right = treeDepth(root.getRightNode());
        return Math.max(left, right) + 1;
    }

    //二叉树深度 非递归
    private static int treeDepthQueue(Node root) {
        if(root == null){
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0, count = 0, nextCount = 1;
        while(queue.size()!=0){
            Node top = queue.poll();
            count++;
            if(top.getLeftNode() != null){
                queue.add(top.getLeftNode());
            }
            if(top.getRightNode() != null){
                queue.add(top.getRightNode());
            }
            if(count == nextCount){
                nextCount = queue.size();
                count = 0;
                depth++;
            }
        }
        return depth;
    }

    //打印节点值
    public static void printNode(Node node){
        System.out.println(node.getValue());
    }

    //前序遍历 - 递归
    private static void preOrder(Node root){
        if(root != null){
            printNode(root);//打印根节点
            preOrder(root.getLeftNode());//前序遍历左子树
            preOrder(root.getRightNode());//前序遍历右子树
        }
    }
    //前序遍历 - 非递归
    private static void preOrderStack(Node root){
        Stack<Node> stack = new Stack<>();
        while(root != null || !stack.isEmpty()){
            if(root != null){
                printNode(root);
                stack.push(root);
                root = root.getLeftNode();
            }else{
                root = stack.pop();
                root.getRightNode();
            }
        }
        System.out.println();
    }

    //中序遍历 - 递归
    private static void inOrder(Node root){
        if(root!= null){
            inOrder(root.getLeftNode());
            printNode(root);
            inOrder(root.getRightNode());
        }
    }
    //中序遍历 - 非递归
    private static void inOrderStack(Node root){
        Stack<Node> stack = new Stack<>();
        while(root != null || stack.size() > 0){
            if(root != null){
                stack.push(root);
                root = root.getLeftNode();
            }else{
                root = stack.pop();
                printNode(root);//遍历完左子树后，才打印根节点
                root = root.getRightNode();
            }
        }
        System.out.println();
    }

    //后序遍历 - 递归
    private static void postOrder(Node root){
        if(root != null){
            postOrder(root.getLeftNode());
            postOrder(root.getRightNode());
            printNode(root);
        }
    }
    //后序遍历 - 非递归
    private static void postOrderStack(Node root){
        Stack<Node> stack = new Stack<>();
        Stack<Node> out = new Stack<>();
        stack.push(root);
        while(stack.size() > 0){
            Node currentNode = stack.pop();
            out.push(currentNode);
            if(currentNode.getLeftNode() != null){
                stack.push(currentNode.getLeftNode());
            }
            if(currentNode.getRightNode() != null){
                stack.push(currentNode.getRightNode());
            }
        }
        while (out.size() > 0){
            printNode(out.pop());
        }
        System.out.println();
    }
    public Node init(){
        Node j = new Node(8,null,null);
        Node h = new Node(4,null,null);
        Node g = new Node(2,null,null);
        Node f = new Node (7 ,null,j);
        Node e = new Node (5,h,null);
        Node d = new Node(1,null,g);
        Node c = new Node(9 ,f,null);
        Node b = new Node(3,d,e);
        Node a = new Node(6,b,c);
        return a ;
    }
}
