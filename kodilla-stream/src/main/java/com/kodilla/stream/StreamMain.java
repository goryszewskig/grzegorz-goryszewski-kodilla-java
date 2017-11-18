package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

        public static void main(String[] args) {
            ExpressionExecutor expressionExecutor = new ExpressionExecutor();

            System.out.println("Calculating expressions with lambdas");
            expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
            expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
            expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
            expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

            System.out.println("Calculating expressions with method references");
            expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
            expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
            expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
            expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

            PoemBeautifier poemBeautifier = new PoemBeautifier();

            poemBeautifier.beautify("Test1", (t) -> t.toUpperCase());
            poemBeautifier.beautify("Test2", (t) -> "ABC" + t);
            poemBeautifier.beautify("Test2", (t) -> t + "ABC");
            poemBeautifier.beautify(" Test2 Mine ", (t) -> t.trim());
            poemBeautifier.beautify("Test2 Mine 2", (t) -> t.toLowerCase());

            //7.2
            System.out.println("Using Stream to generate even numbers from 1 to 20");
            NumbersGenerator.generateEven(20);

            //7.3
            People.getList().stream()
                    .forEach(System.out::println);

            People.getList().stream()
                    .map(s -> s.toUpperCase())
                    .forEach(System.out::println);

            People.getList().stream()
                    .map(String::toUpperCase)
                    .forEach(s -> System.out.println(s));

            People.getList().stream()
                    .filter(s -> s.length() > 11)
                    .forEach(System.out::println);

            People.getList().stream()
                    .map(String::toUpperCase)
                    .filter(s -> s.length() > 11)
                    .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                    .filter(s -> s.substring(0, 1).equals("M"))
                    .forEach(System.out::println);

//            BookDirectory theBookDirectory = new BookDirectory();
//            theBookDirectory.getList().stream()
//                    .filter(book -> book.getYearOfPublication() > 2005)
//                    .forEach(System.out::println);

//            BookDirectory theBookDirectory = new BookDirectory();
//            List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                    .filter(book -> book.getYearOfPublication() > 2005)
//                    .collect(Collectors.toList());
//
//            System.out.println("# elements: " + theResultListOfBooks.size());
//            theResultListOfBooks.stream()
//                    .forEach(System.out::println);


//            BookDirectory theBookDirectory = new BookDirectory();
//
//            Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                    .filter(book -> book.getYearOfPublication() > 2005)
//                    .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//            System.out.println("# elements: " + theResultMapOfBooks.size());
//            theResultMapOfBooks.entrySet().stream()
//                    .map(entry -> entry.getKey() + ": " + entry.getValue())
//                    .forEach(System.out::println);

            BookDirectory theBookDirectory = new BookDirectory();
            String theResultStringOfBooks = theBookDirectory.getList().stream()
                    .filter(book -> book.getYearOfPublication() > 2005)
                    .map(Book::toString)
                    .collect(Collectors.joining(",\n", "<<", ">>"));

            System.out.println(theResultStringOfBooks);


            //7.3 Zadanie
            Forum forum = new Forum();

            Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                    .filter(a -> a.getSex() == 'M')
                    .filter(a -> Period.between(a.getBirthDate(), LocalDate.now()).getYears() > 20)
                    .filter(a -> a.getPostQuantity() >= 1)
                    .collect(Collectors.toMap(ForumUser::getIdUser, a -> a));

            System.out.println("Selected : " + theResultMapOfUsers.size());
            theResultMapOfUsers.entrySet().stream()
                    .map(entry -> entry.getKey() + ": " + entry.getValue())
                    .forEach(System.out::println);


        }
}
