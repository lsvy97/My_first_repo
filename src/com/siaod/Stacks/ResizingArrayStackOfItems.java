package com.siaod.Stacks;

public class ResizingArrayStackOfItems<Item> {
    private Item[] s;
    private int N = 0;

    public ResizingArrayStackOfItems() {
        s = (Item[]) new Object[1];
    }

    public void push(Item item) {
        if (N == s.length) resize(2 * s.length);
        s[N++] = item;
    }
    public Item pop() {
        Item item = s[--N];
        s[N] = null;
        if (N > 0 && N == s.length/4) resize(s.length/2);
        return item;
    }
    private void resize(int capacity) {
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < N; i++) {
            copy[i] = s[i];
        }
        s = copy;
    }
}
