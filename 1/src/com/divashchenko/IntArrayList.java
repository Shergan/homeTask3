package com.divashchenko;

public class IntArrayList implements IntList {

    private int[] array = new int[10];
    private int count = 0;

    @Override
    public void add(int value) {
        array = checkArrAndResize(array);
        array[count++] = value;
    }

    @Override
    public void add(int index, int element) {
        array = checkArrAndResize(array);
        int[] tmpArray = new int[array.length];
        for (int i = 0; i <= count; i++) {
            if (i < index) {
                tmpArray[i] = array[i];
            } else if (i == index) {
                tmpArray[i] = element;
            } else {
                tmpArray[i] = array[i - 1];
            }
        }
        array = tmpArray;
        count++;
    }

    @Override
    public void clear() {
        count = 0;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < count; i++) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int get(int index) {
        checkIndexRange(index);
        return array[index];
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int remove(int index) {
        checkIndexRange(index);

        int[] tmpArr = new int[array.length];
        int tmpIndex = array[index];
        for (int i = 0; i < count - 1; i++) {
            if (i < index) {
                tmpArr[i] = array[i];
            } else {
                tmpArr[i] = array[i + 1];
            }
        }
        array = tmpArr;
        count--;
        return tmpIndex;
    }

    @Override
    public void set(int index, int element) {
        checkIndexRange(index);
        array[index] = element;
    }

    @Override
    public int size() {
        return count;
    }

    private int[] checkArrAndResize(int[] array) {
        if (count >= array.length) {
            int newSize = array.length * 3 / 2 + 1;
            int[] tmpArray = new int[newSize];
            System.arraycopy(array, 0, tmpArray, 0, count);
            return tmpArray;
        } else {
            return array;
        }
    }

    private void checkIndexRange(int index) {
        if (index >= count) {
            throw new IndexOutOfBoundsException("Wrong index!");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < count; i++) {
            sb.append(array[i]).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }
}
