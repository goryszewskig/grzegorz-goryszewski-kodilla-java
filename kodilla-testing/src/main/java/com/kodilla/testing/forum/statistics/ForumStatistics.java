package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
    Statistics statistics;
    int quantityOfUsers;
    int quantityOfPosts;
    int quantityOfComments;
    double averagePostPerUser;
    double averageCommentPerUser;
    double averageCommentPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        List<String> usersList = statistics.usersNames();
        this.quantityOfUsers = usersList.size();
        this.quantityOfPosts = statistics.postsCount();
        this.quantityOfComments = statistics.commentsCount();

        if (quantityOfUsers != 0 && quantityOfPosts != 0) {
            this.averagePostPerUser = (double) quantityOfPosts / quantityOfUsers;

        } else {
            this.averagePostPerUser = 0;
        }

        if ((quantityOfUsers != 0 && quantityOfComments != 0)) {
            this.averageCommentPerUser = (double) quantityOfComments / quantityOfUsers;
        } else {
            this.averageCommentPerUser = 0;
        }

        if (quantityOfComments != 0 && quantityOfPosts != 0) {
            this.averageCommentPerPost = (double) quantityOfComments / quantityOfPosts;
        } else {
            this.averageCommentPerPost = 0;
        }
    }
}
