import java.util.Random;

public class MagicBox<T> {

    protected T item;
    protected T[] items = (T[]) new Object[7];

    boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("Коробка полна, добавить новый предмет не получится!");
        return false;
    }

    public T pick() throws RuntimeException {
        int freeSlots = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                freeSlots += 1;
                throw new BoxNotFullException(freeSlots);
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
}
