package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.SocialPublisher;

public class User {
    private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sharePost() {
        socialPublisher.share();
    }

    public void setPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
