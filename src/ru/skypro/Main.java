package ru.skypro;

public class Main {

    public static void main(String[] args) {
	 Author first = new Author("Александр", "Пушкин");
     Author second = new Author("Михаил", "Лермонтов");
     Book firstBook = new Book("Сказки", first, 2010);
     Book secondBook = new Book("Стихи", second, 1995);
     firstBook.setYearOfPublication(2020);
     System.out.println(firstBook);
     System.out.println(secondBook);
    }
}
