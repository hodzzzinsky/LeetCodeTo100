package and.hodz.algorithms.stack.simpilfy_path;

import java.util.*;

public class SimplifyPath {

    public static void main(String[] args) {
        String path = "/home/";
        System.out.println(simplifyPath(path));
    }

    public static String simplifyPath(String path) {
        String[] dirs = path.split("/");
        Deque<String> ll = new LinkedList<>();
        for (int i = 1; i < dirs.length; i++) {
            if (dirs[i].equals("..")) ll.pollLast();
            else if (dirs[i].equals(".") || dirs[i].equals("")) continue;
            else ll.add(dirs[i]);
        }

        return "/" + String.join("/", ll);
    }

    public static String simplifyPathUsingStack(String path) {
        String[] dirs = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 1; i < dirs.length; i++) {
            if (dirs[i].equals(".") || dirs[i].equals("")) continue;
            else if (dirs[i].equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            }

            else stack.push(dirs[i]);
        }

        return "/" + String.join("/", stack);
    }
}
