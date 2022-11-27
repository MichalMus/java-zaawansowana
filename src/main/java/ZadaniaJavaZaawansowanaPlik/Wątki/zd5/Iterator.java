package ZadaniaJavaZaawansowanaPlik.Wątki.zd5;

import java.util.concurrent.atomic.AtomicInteger;

public class Iterator<T> {
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private T[] data;

    public Iterator(T[] data) {
        this.data = data;
    }

    public T next() {
        if (atomicInteger.get() < data.length) {
            return data[atomicInteger.getAndIncrement()];
        }
        throw new IllegalArgumentException();
    }

    public T prev() {
        if (atomicInteger.get() < data.length) {
            return data[atomicInteger.getAndDecrement()];
        }
        throw new IllegalArgumentException();
    }
}
