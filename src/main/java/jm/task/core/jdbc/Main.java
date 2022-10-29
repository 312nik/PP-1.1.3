package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        UserServiceImpl service= new UserServiceImpl();
        service.createUsersTable();
        service.saveUser("Иван", "Иванов", (byte) 20);
        service.saveUser("Петр", "Петров", (byte) 22);
        service.saveUser("Василий", "Иванов", (byte) 24);
        service.saveUser("Петр", "Иванов", (byte) 26);
        List<User> users = service.getAllUsers();
        for (User u: users) {
            System.out.println(u);
        }
        service.cleanUsersTable();
        service.dropUsersTable();


    }
}
