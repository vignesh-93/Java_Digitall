/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.dsa;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class ArrayBasedList {

    private Object[] listData;
    private int size;

    {
        listData = new Object[16];
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        if (size > 0) {
            builder.append(listData[0]);
            for (int i = 1; i < size; i++) {
                builder.append("," + listData[i]);
            }
            builder.append("]");
        }
        return builder.toString();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        while (size > 0) {
            listData[size - 1] = null;
            size--;
        }
    }

    public boolean add(Object a) {
        if (listData.length == size) {
            increaseCapacity();
        }
        listData[size] = a;
        size++;
        return true;
    }

    private void increaseCapacity() {
        Object[] temp = new Object[listData.length * 2];
        System.arraycopy(listData, 0, temp, 0, listData.length);
        int tempSize = size;
        clear();
        size = tempSize;
        listData = temp;
    }

    public Object get(int index) throws IndexOutOfBoundsException {
//        if (index < 0 || index >= size) {
        if (!isValidIndex(index)) {
            throw new IndexOutOfBoundsException();
        }
        return listData[index];
    }

    public Object set(int index, Object replace) {
        if (!isValidIndex(index)) {
            throw new IndexOutOfBoundsException();
        }
        return listData[index] = replace;
    }

    private boolean isValidIndex(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        return true;
    }

    public void add(int index, Object overAdd) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (listData.length == size) {
            increaseCapacity();
        }
//        if (listData[index] != null) {
//            listData[index] = listData[index + 1];                 //My Try//
//            listData[index] = overAdd;
//        } else {
//            listData[index] = overAdd;
//        }
        int position = size;
        for (; position > index; position--) {
            listData[position] = listData[position - 1];
        }
        listData[index] = overAdd;
        size++;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < listData.length; i++) {
            if (listData[i] == o) {
                return true;
            }
        }
        return false;
    }

    //My Code
    public Object remove(int index) throws IndexOutOfBoundsException {
        if (!isValidIndex(index)) {
            throw new IndexOutOfBoundsException();
        }
        Object temp = listData[index];
        for (int i = index; i < size - 1; i++) {
            listData[i] = listData[i + 1];
        }
        listData[size - 1] = null;
        size--;
        return temp;
    }

//    public boolean remove(Object index) {
//        for (int i = 0; i < listData.length; i++) {
//            if (listData[i].equals(index)) {
//                listData[i] = listData[i + 1];
//                return true;
//            }
//            //listData[i]=listData[i+1];
//            return false;
//        }
//        return false;
//    }
    //My code --End
    //Sarmathi Code --Start
//    public boolean remove(Object e) {
//       for (int i = 0; i < size; i++) {
//               if (listData[i].equals(e)) {
//                   for (int j = i; j < size - 1; j++) {
//                       listData[j] = listData[j + 1];
//                   }
//                   listData[size - 1] = null;
//                   size--;
//                   return true;
//               }
//           }
//           return false;
//       }
//    
//    public Object remove(int index) throws IndexOutOfBoundsException {
//       if (!isValidIndex(index)) {
//           throw new IndexOutOfBoundsException();
//       }
//       Object temp = listData[index];
//       for (int i = index; i < size - 1; i++) {
//           listData[i] = listData[i + 1];
//       }
//       listData[size - 1] = null;
//       size--;
//       return temp;
//   }
    //Sarmathi Code --End
    // Har Code -- Start
    public Boolean remove(Object e) {
        for (int i = 0; i < size; i++) {
            if (listData[i].equals(e)) {
                for (int j = i; j < size - 1; j++) {
                    listData[j] = listData[j + 1];
                }
                listData[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    //Hari Code End
    public boolean addAll(ArrayBasedList c) {
        boolean changed = false;
        for (int i = 0; i < c.size(); i++) {
//        System.out.println(c.size);
            this.add(c.get(i));
            changed = true;
//         return changed;
        }
        return changed;
    }

    //My code -- start
//    public boolean removeAll(ArrayBasedList c){
//        boolean changed = false;
//    for(int i =0;i<c.size();i++){
////        System.out.println(c.size);
//         this.remove(c.get(i));
//         changed = true;
////         return changed;
//     }
//       return changed;
//    }
    //My code -- end
    public boolean removeAll(ArrayBasedList c) {
        boolean changed = false;
        for (int i = 0; i < c.size(); i++) {
            this.remove(c.get(i));
            changed = true;
        }
        return changed;
    }

    public boolean containsAll(ArrayBasedList c) {
        boolean changed = false;
        int count = 0;
        for (int i = 0; i < c.size(); i++) {
            if (this.contains(c.get(i))) {
                count++;
            }
        }
//        System.out.println(count);
        if (Objects.equals(c.size, count)) {
            changed = true;
        }
        return changed;
    }

    public boolean retainAll(ArrayBasedList c) {
        boolean changed = false;
        int count = 0;
        for (int i = 0; i < this.size; i++) {
            if (c.contains(this.get(i))) {
                count++;
            } else {
                this.remove(this.get(i));
                i--;
            }
        }
        System.out.println(count);
        if (Objects.equals(c.size, count)) {
            changed = true;
        }
        return changed;
    }

    public Object[] toArray() {
        Object arr[] = new Object[this.size];
        for (int i = 0; i < size; i++) {
            arr[i] = listData[i];
//            System.out.println(arr[i]);
        }
        //listData[i] =arr[i];
        return arr;
    }

    public boolean addAll(int index, ArrayBasedList c) {
//        if (!isValidIndex(value)) {
//           throw new IndexOutOfBoundsException();
//       }boolean changed = false;
//       
//        if(c.size>this.size){
//            increaseCapacity();
//        for (int i = 0; i < c.size(); i++) {
//            this.add(c.get(i));
//            changed = true;
//        }
//        return changed;
//    }
//        return changed;
        for (int i = 0; i < c.size(); i++) {
            this.add(index + i, c.get(i));
        }
        return true;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (this.get(i) == o) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object e) {
        for (int i = this.size; i > 0; i--) {
            if (e.equals(listData[i])) {
                return i;
            }
        }
        return -1;
    }

    public ArrayBasedList subList(int fromIndex, int toIndex) {
        ArrayBasedList temp = new ArrayBasedList();

        for (int i = fromIndex; i < toIndex; i++) {
            temp.add(get(i));
        }
        return temp;
    }

    public Iterator iterator() {
        return new PersonalIterator();
    }

    private class PersonalIterator implements Iterator {

        private int temp = -1;

        @Override
        public boolean hasNext() {
            if (temp < size() - 1) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return listData[++temp];
        }

    }

    public ListIterator listIterator() {
        return new PersonalListIterator();
    }

    private class PersonalListIterator implements ListIterator {

        private int currentIndex = -1;
        private int Index = size;

        @Override
        public void add(Object e) {
        
        }
        
        @Override
        public void remove() {
            
        }

        @Override
        public void set(Object e) {
            
        }
        
        @Override
        public boolean hasNext() {
            if (currentIndex < size - 1) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return listData[++currentIndex];
        }

        @Override
        public boolean hasPrevious() {
            if (Index > 0) {
                return true;
            }
            return false;
        }

        @Override
        public Object previous() {
            return listData[--Index];
        }

        @Override
        public int nextIndex() {
            return ++Index;
        }

        @Override
        public int previousIndex() {
            return --Index;
        }
        
    }

}
