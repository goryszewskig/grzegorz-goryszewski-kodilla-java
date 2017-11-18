package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public  Forum(){
        userList.add(new ForumUser(1,"gg1",'M', LocalDate.of(1990,1,1),3));
        userList.add(new ForumUser(2,"gg2",'F',LocalDate.of(1981, 12,2),1));
        userList.add(new ForumUser(3,"gg3",'M', LocalDate.of(2015,5,3),3));
        userList.add(new ForumUser(4,"ewa1",'M', LocalDate.of(1990,2,4),0));
        userList.add(new ForumUser(5,"ewa2",'M', LocalDate.of(1995,11,22),33));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }

}
