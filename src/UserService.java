import java.util.List;
// Принцип инверсии зависимостей
public interface UserService<T extends User> {
    public List<T> getAll();
    public void initData(List<T> list);
    public void create(String surname, String firstname, String midllename);
}
