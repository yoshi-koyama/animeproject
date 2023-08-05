package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> animeList = List.of("Naruto", "Bleach", "One Piece", "Dragon Ball");

        animeList.forEach(System.out::println);
    }
}
