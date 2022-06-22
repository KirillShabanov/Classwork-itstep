import java.util.LinkedList;

public class Collection {

        public static void main(String[] args) {

            LinkedList<String> l_list = new LinkedList<>();
            addCollection(l_list);
            System.out.println("The linked list: " + l_list);

        }

        public static LinkedList<String> addCollection(LinkedList<String> l_list){
            l_list.add("Red");
            l_list.add("Green");
            l_list.add("Black");
            l_list.add("White");
            l_list.add("Pink");
            l_list.add("Yellow");
            return l_list;
        }
}
