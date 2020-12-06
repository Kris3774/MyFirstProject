package infrastructura.data;

import java.io.*;
import java.util.ArrayList;

public class FileDataMapper implements DataMapper {

    ArrayList <User> users= new ArrayList<>();
public FileDataMapper() {
        try(BufferedReader reader = new BufferedReader(new FileReader(new File("users.txt")))) {
            String rb = "";
            while ((rb = reader.readLine()) != null) {
                String[] splitedUser = rb.split(";");
                try{
                    String s = rb.split(";") [3];
                }
                catch (ArrayIndexOutOfBoundsException ex){
                    continue;
                }
                users.add(new User(splitedUser [0], splitedUser [1], splitedUser [2], splitedUser [3] ));
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public User findUserByEmail(String email) {
        for (User user:users) {
            if(user!=null && user.getUserEmail().equals(email)){
                return user;
            }
        }
        throw new UserNotFoundException(String.format("can't be find",email));
    }
    @Override
    public User findUserUserName(String name) {
        for(User user : users){
            if(user.getUserName().equals(name)){
                return user;
            }
        }return null;
    }
    public ArrayList<User> getAll(){
        return  users;
    }
}
