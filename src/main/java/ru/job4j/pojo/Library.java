package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book("Clean Code", 250);
        Book bookTwo = new Book("Alfa", 50);
        Book bookThree = new Book("Beta", 100);
        Book bookFour = new Book("Gamma", 150);
        Book[] books = new Book[4];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            System.out.println("Book " + pr.getName() + " has " + pr.getCountPages() + " pages ");
        }
        System.out.println("Change bookOne with bookFour");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            System.out.println("Book " + pr.getName() + " has " + pr.getCountPages() + " pages ");
        }
        for (int index = 0; index < books.length; index++) {
            if (books[index] == bookOne) {
                Book book = books[index];
                System.out.println("Название книги в поиске : " + book.getName());
            }

            }
        }

    }

