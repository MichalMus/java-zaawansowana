package ZadaniaJavaZaawansowanaPlik.Kolekcje.zd1;

import java.util.Arrays;
import java.util.Objects;

public class SDAArrayList1<E> {
    private int size = 5;
    private static final int INITIAL_CAPACITY = 5;
    private Object[] elementArray;

    public SDAArrayList1() {
        elementArray = new Object[INITIAL_CAPACITY];
    }

    public E getElementFromArray(int index) {
        if (index < 0 || index >= elementArray.length) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elementArray[index];
    }

    public void addElementToArray(E element) {
        if (size == elementArray.length) {
            increaseArraySize();
        } elementArray[size++] = element;
    }

    public void dispaly(){
        for (Object o : elementArray){
            System.out.println(o);
        }
    }
    public E removeElement(int index){
        if (index < 0 || index >= elementArray.length){
            throw new IndexOutOfBoundsException();
        }
        Object removeObject = elementArray[index];
        for (int i = 0; i < elementArray.length; i++){
            elementArray[i] = elementArray[i+1];
        }
        size--;
        decreaseArraySize();
        return (E) removeObject;

    }


    public void increaseArraySize() {
        int newSizeOfToSmallerArray = elementArray.length * 2;
        elementArray = Arrays.copyOf(elementArray, newSizeOfToSmallerArray);
    }
    public void decreaseArraySize() {
        elementArray = Arrays.copyOf(elementArray,elementArray.length-1);

    }

}
