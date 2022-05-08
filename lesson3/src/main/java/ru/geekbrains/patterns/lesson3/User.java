package ru.geekbrains.patterns.lesson3;

public class User {
    private Long id;
    private String nikName;
    private String email;
    private String password;

    private User() {
    }

    public Long getId() {
        return id;
    }

    public String getNikName() {
        return nikName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nikName='" + nikName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }



    public static class Builder {
        private final User user;

        private Builder() {
            this.user = new User();
        }

        public Builder withId(Long id) {
            this.user.id = id;
            return this;
        }

        public Builder withNikName(String nikName) {
            this.user.nikName = nikName;
            return this;
        }

        public Builder withEmail(String email) {
            this.user.email = email;
            return this;
        }

        public Builder withPassword(String password) {
            this.user.password = password;
            return this;
        }

        public User build() {
            return this.user;
        }
    }


}
