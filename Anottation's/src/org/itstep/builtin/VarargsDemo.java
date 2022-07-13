package org.itstep.builtin;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class VarargsDemo {
    public static void main(String[] args) {
        VarargsDemo varargsDemo = new VarargsDemo();
        varargsDemo.print();

        List<String> list1 = Arrays.asList("1", "2", "3");
        List<String> list2 = Arrays.asList("4", "5", "6");
        varargsDemo.print1(list1, list2);
    }

    private void print(@NotNull String ... strings) {
        for (String s : strings)
            System.out.println(s);
    }

    @SafeVarargs
    private void print1(@NotNull List<String> ... strings) {
        for (List<String> list : strings)
        for (String s : list)
            System.out.println(s);
    }
}
