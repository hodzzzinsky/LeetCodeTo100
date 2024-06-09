package and.hodz.algorithms.stack.min_stack;

public class MinStackByNode {

    private class Node {
        private int val;
        private int min;
        private Node next;

        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", min=" + min +
                    ", next=" + next +
                    '}';
        }
    }

    private Node node;

    public MinStackByNode() {
        node = null;
    }


    public void push(int val) {
        if (node == null) node = new Node(val, val, null);
        else node = new Node(val, Math.min(val, node.min), node);
    }

    public void pop() {
        node = node.next;
    }

    public int top() {
        return 0;
    }

    public int getMin() {
        if (node != null)
            return node.min;
        else throw new RuntimeException("Stack is empty");
    }


    @Override
    public String toString() {
        return "MinStackByNode{" +
                "node=" + node +
                '}';
    }
}
