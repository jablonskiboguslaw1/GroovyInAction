package com.therealdanvega

@groovy.transform.ToString
class Tweet {


    String post
    String username
    Date postDateTime


    private List favorites = []
    private List retweets = []

    private List mention = []
    private List hashtags = []

    void favorite(String username) {
        favorites << username
    }

    List getFavorites() {
        favorites
    }

    void retweet(String username) {
        retweets << username
    }

    List getRetweets() {
        retweets
    }

    List getMentions() {
        String pattern = /\B@[a-z0-9_-]+/
        post.findAll(pattern)

    }

    List getHashTag() {
        def list = []

        def split = post.split(' ')
        for (part in split) {
            if (part.contains('#')) {

                list << part
            }
        }
        list
    }


    static void main(String[] args) {

        Tweet tweet = new Tweet(post: "This Groovy Course by @therealdanvega is Awesome! #Java #Groovy", username: "@bogu", postDateTime: new Date())

        println tweet

        tweet.favorite('@ApacheGroovy')
        tweet.retweet('@ApacheGroovy')

        println tweet.getRetweets()
        println tweet.getFavorites()
        println tweet.getMentions()
        println tweet.getHashTag()
    }

}
