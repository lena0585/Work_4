import java.util.List;
// Принцип единой ответственности
public interface UserView<T extends User> {
    public void sendOnConsole(List<T> list);
}
