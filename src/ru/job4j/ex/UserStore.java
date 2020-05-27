package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user: users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User with login " + login + " is not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User is invalid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Pa", true),
                new User("Vasya", false)
        };
        String[] logins = {"Petr Arsentev", "Pa", "Vasya", "Masha"};

        for (String login: logins) {
            try {
                User user = findUser(users, login);
                if (validate(user)) {
                    System.out.println("User " + user.getUsername() + " has an access");
                }
            } catch (UserInvalidException e) {
                System.out.println("User " + login + " doesn't have an access");
            } catch (UserNotFoundException e) {
                System.out.println("User " + login +  " is not found");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
