package ru.netology.domain;

public class Place {
    private int id;//идентификатор места
    private String title;//	название места
    private int latitude;//еографическая широта, заданная в градусах (от -90 до 90)
    private int longitude;//географическая широта, заданная в градусах (от -90 до 90).
    private int created;//дата создания места в Unixtime.
    private String icon;//иконка места, URL изображения.
    private int checkins;//число отметок в этом месте.
    private int update;//дата обновления места в Unixtime.
    private int type;//тип места.
    private int country;//идентификатор страны
    private int city;//идентификатор города
    private int address;//адрес места.

}
