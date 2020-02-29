package com.simplechat.client;

import com.simplechat.server.controller.UserController;
import com.simplechat.server.model.entity.User;

import java.util.List;
import java.util.Scanner;

/**
 * Created by raghvendra.mishra on 29/02/20.
 */
public class SimpleChatClient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 4) {
            System.out.println("Enter choice : ");
            System.out.println("1. add new user");
            System.out.println("2. display all user");
            System.out.println("3. show user count");
            System.out.println("4. exit");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter name");
                    String name = sc.nextLine();
                    UserController.addUser(name);
                    break;

                case 2:
                    List<User> users = UserController.getAllUser();
                    users.forEach(e -> System.out.println(e.getName()));
                    break;

                default:
                    break;
            }
        }
    }
}
