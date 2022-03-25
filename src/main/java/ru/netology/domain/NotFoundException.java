package ru.netology.domain;

public class NotFoundException extends RuntimeException{


    public NotFoundException(String id) {
        super("Данного id  не существует , вы ввели " + id);
    }

}
