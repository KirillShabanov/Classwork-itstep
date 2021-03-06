import java.util.Stack;

public class CelebrityProblem {

    static int contacts[][] = {
            {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 0},
            {0, 0, 1, 0}};
    static int count = contacts.length;

    public static void main(String[] args) {
        System.out.println(knows(0,1));
        System.out.println(chekCelebrity(2));
        System.out.println(findCelebrity());
    }
    static boolean knows(int a, int b) {
        return (contacts [a][b] == 1) ? true : false;
    }

    static boolean chekCelebrity(int c){
        boolean result = true;
        for (int i = 0; i < count; i++)
            if (i != c && (knows(c,i) || !knows(i,c))){
                result = false;
            }
        return result;
    }

    static int findCelebrity() {
        Stack<Integer> stack = new Stack<>();
        int c = -1;
        for (int i = 0; i < count; i++) {
            stack.push(i);
        }
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();
            if (knows(a, b)) stack.push(b);
            else stack.push(a);
        }
        if (stack.empty()) c = -1;
        else {
            c = stack.pop();
        if (!chekCelebrity(c)) c = -1;
        }
        return c;
    }
}