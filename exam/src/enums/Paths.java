package enums;

public enum Paths {
    ALL_USERS("data/allUsers.txt"),
    USERS_FOLDERS("data/users"),
    FOLDER("data");

    private final String path;

    // Конструктор enum
    Paths(String path) {
        this.path = path;
    }

    // Метод для получения пути
    public String getPath() {
        return path;
    }

}
