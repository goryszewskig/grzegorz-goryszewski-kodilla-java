package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    private com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book bookLibraryB;
    private BookSignature bookSignature;

    @Override
    public int publicationYearMedian(Set<Book> booksLibraryA) {

        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books = new HashMap<>();

        for (Book bookLibraryA : booksLibraryA) {
            bookLibraryB = new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(bookLibraryA.getAuthor(),bookLibraryA.getTitle(), bookLibraryA.getPublicationYear());
            bookSignature = new BookSignature(bookLibraryA.getSignature());
            books.put(bookSignature, bookLibraryB);
        }
        return medianPublicationYear(books);
    }
}