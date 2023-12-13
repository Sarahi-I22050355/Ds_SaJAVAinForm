
package Clases.Nodes;

public class BinaryTreeNode {
    public int Value;
public BinaryTreeNode Left, Right;
 public int getValue() {
        return Value;
    }

    public BinaryTreeNode getLeft() {
        return Left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.Left = left;
    }

    public BinaryTreeNode getRight() {
        return Right;
    }

    public void setRight(BinaryTreeNode right) {
        this.Right = right;
    }
public BinaryTreeNode(int value)
{
    Value = value;
    Left = Right = null;
}
}
