package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {

        // Given
        Book book1 = new Book ("GG", "Title1", 2001, "Sig1");
        Book book2 = new Book ("GG", "Title2", 2002, "Sig2");
        Book book3 = new Book ("GG", "Title3", 2003, "Sig3");
        Set<Book> booksLibraryA = new HashSet<>();
        booksLibraryA.add(book1);
        booksLibraryA.add(book2);
        booksLibraryA.add(book3);

       MedianAdapter libraryAdapter = new MedianAdapter();

        // When
        int publicationYearMedian = libraryAdapter.publicationYearMedian(booksLibraryA);

        // Then
        assertEquals(2002, publicationYearMedian);
    }
}
