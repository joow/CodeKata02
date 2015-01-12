package day1;

import java.util.*;

public final class BinaryChop {
    private int value;

    public BinaryChop find(final int value) {
        this.value = value;
        return this;
    }

    public int in(final List<Integer> objects) {
        if (objects == null) {
            return -1;
        }

        List<Integer> items = new ArrayList<>(objects);
        int start = 0;

        while (!items.isEmpty()) {
            final List<Integer> topHalf = new ArrayList<>(items.subList(0, items.size() / 2 + 1));
            for (int i = 0; i < topHalf.size(); i++) {
                if (topHalf.get(i).equals(value)) {
                    return i + start;
                }
            }

            start += topHalf.size();
            items = new ArrayList<>(items.subList(items.size() / 2 + 1, items.size()));
        }

        return -1;
    }
}
