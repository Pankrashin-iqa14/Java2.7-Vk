package ru.netology.domain;

public class CommensInfo {
    private int count;// количество комментариев;
    private String canPost;//информация о том, может ли текущий пользователь комментировать запись
    private String groupsCanPost;// информация о том, могут ли сообщества комментировать запись
    private String  signerID; // ИД пользователя который оставил запись
    private String signerImage;// фото пользователя который оставил запись
}
