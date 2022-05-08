package ru.geekbrains.patterns.lesson3;

public class MainApp {
    public static void main(String[] args) {
        User user = User.createBuilder()
                .withId(1L)
                .withNikName("Bob")
                .withEmail("bob@mail.ru")
                .withPassword("1233")
                .build();

        System.out.println(user);
    }
}
