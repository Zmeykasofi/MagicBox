public class BoxNotFullException extends RuntimeException {

    public BoxNotFullException(int freeSlots) {
        super("Коробка не полна, и осталось ещё " + freeSlots + " свободных ячеек.");
    }
}
