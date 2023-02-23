import java.util.Random;

public class MagicBox<T> {
    private T[] items;
    private int load;

    public MagicBox(int size) {
        this.items = (T[]) new Object[size];
    }

    public boolean add(T item) {
        load = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                load = i + 1;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        if (load < items.length) {
            throw new RuntimeException("Коробка не полна и осталось ещё " + (items.length - load) + " ячеек заполнить");
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            System.out.println(items[randomInt]);
            return items[randomInt];
        }
    }
}
