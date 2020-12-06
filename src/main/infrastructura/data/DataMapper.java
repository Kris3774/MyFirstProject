package infrastructura.data;

public interface DataMapper {
    User findUserByEmail(String email);
    User findUserUserName(String name);

}
