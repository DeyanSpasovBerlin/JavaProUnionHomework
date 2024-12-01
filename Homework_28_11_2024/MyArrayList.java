package org.example.Homework_28_11_2024;

import java.util.*;

public class      MyArrayList<U> implements Iterable<U> {

    private U[] data;

    public MyArrayList(U[] data) {
        this.data = data;
    }

    public void add(U element) {
        // logic for adding element
    }

    @Override
    public Iterator<U> iterator() {
        return new Iterator<>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return data.length > index;
            }

            @Override
            public U next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return data[index++];
            }
        };
    }

    public Iterator<U> reverseIterator() {
        return new MyReverseIterator();
    }

    public Iterator<U> randomIterator() {
        return new MyRandomIterator();
    }




    private class  MyReverseIterator<U> implements Iterator<U> {
        private int index = data.length - 1;
        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public U next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return (U) data[index--];
        }
    }

    private class MyRandomIterator<U> implements Iterator<U> {

        int index = 0;
        U[] copy;

        MyRandomIterator() {
            copy = (U[]) Arrays.copyOf(data, data.length);
//            shuffle(copy);
           Collections.shuffle(List.of(copy));
//            Collections.swap();
        }

        @Override
        public boolean hasNext() {
            return copy.length > index;
        }

        @Override
        public U next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return copy[index++];
        }

    }


    public void shuffle(U[] data) {
        // Option 1 - n log (n) operations algorithm
        // data ---> dataPlusRandomNumbers
        // Arrays.sort(dataPlusRandomNumbers);

        // Option 2 - n operations - more fast algorithm
        Random random = new Random();
        for (int i = 1; i < data.length; i++) {
            int j = random.nextInt(i + 1);
            swap(data, i, j);
        }
    }

    public void swap(U[] data, int i, int j){
        if (i != j) {
            U tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }
    }
}
