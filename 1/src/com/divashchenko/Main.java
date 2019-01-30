package com.divashchenko;

public class Main {

    public static void main(String[] args) {
        IntArrayList arrayList = new IntArrayList();

        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);

        System.out.println(arrayList);

        arrayList.add(2, 101);

        System.out.println(arrayList);

        int a = arrayList.get(7);
        System.out.println("a: " + a);

        arrayList.remove(2);
        System.out.println(arrayList);

        arrayList.set(5, 500);
        System.out.println(arrayList);

        System.out.println("Size: " + arrayList.size());

        System.out.println("Is empty? " + arrayList.isEmpty());
        arrayList.clear();
        System.out.println("And now? " + arrayList.isEmpty());
    }
}
