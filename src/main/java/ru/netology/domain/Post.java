package ru.netology.domain;

public class Post {
    private int id; //идентификатор поста
    private int ownerId; //идентификатор стены
    private int fromId; //идентификатор автора
    private int byCreate;//идентификатор администратора, который опубликовал запись
    private int data; //дата размещения
    private String text; //текст в посте
    private int idReplyOwner;//идентификатор владельца записи
    private int idReplyPost;//идентификатор записи, в ответ на которую была оставлена текущая
    private int onlyFriends;//1, если запись была создана с опцией "Только для друзей
    private Сopyright copyright; //источник
    private LikesInfo likesInfo;//инфо о лайках
    private RepostsInfo repostsInfo;//инфо о репостах
    private ViewsInfo viewsInfo;//информация о просмотрах поста
    private String typePost;//тип записи - пост, копия, ответ
    private PostSource postSource;//инфорация о способе размещения записи
    private CommensInfo commentsInfo; //инфо о комментах
    private Views views; //инфо о просмотрах
    private Geo geo; //инфо о местоположении
    private int idSigner;//идентификатор автора
    private int copyHistory;//массив, содержащий историю репостов для записи
    private boolean canFix;//можно закрепить запись
    private boolean canDelete;//можно удалить запись
    private boolean canEdit;//можно редактировать запись
    private boolean canCopy;//можно скопировать запись
    private int isPinned;//запись закреплена или нет
    private int idOwnerGive;//id пользователей, которые поделились постом
    private int idOwnerLike;//id пользователей, которым понравился пост
    private int markedAsAds;//содержит ли запись отметку реклама
    private boolean isFavorite;//пост добавлен в закладки у пользователя
    private Donut donut; //информация о записи VK Donut
    private int idPostponed;//идентификатор отложенной записи
}


























