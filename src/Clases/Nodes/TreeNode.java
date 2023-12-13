
package Clases.Nodes;
import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    String name;
    List<TreeNode> children = new ArrayList<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<TreeNode> getChildren() {
        return children;
    }
}
