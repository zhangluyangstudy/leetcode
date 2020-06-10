package com.algorithm.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangluyang
 * @2020/4/13 10:08
 */
public class LeetCode_355 {
    //关注map
    private Map<Integer,List<Integer>> followerMap=new HashMap<>();
    //tweet list
    private List<Info> allTweets=new ArrayList<>();

    class Info{
        private Integer userId;
        private Integer tweetId;

        public Info(Integer userId, Integer tweetId) {
            this.userId = userId;
            this.tweetId = tweetId;
        }

    }

    public LeetCode_355() {

    }

    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        allTweets.add(new Info(userId,tweetId));
    }

    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> list = followerMap.get(userId);
        if(list==null){
            list=new ArrayList<>();
        }
        list.add(userId);
        List<Integer> result=new ArrayList<>();
        int i=0;
        for(int j=allTweets.size()-1;j>=0;j--){
            if(i>9){
                break;
            }
            if(list.contains(allTweets.get(j).userId)){
                result.add(allTweets.get(j).tweetId);
                i++;
            }
        }
        return result;
    }

    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if(followerId==followeeId){
            return;
        }
        List<Integer> list = followerMap.get(followerId);
        if(list==null){
            list=new ArrayList<>();
            followerMap.put(followerId,list);
        }
        list.add(followeeId);
    }

    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        List<Integer> list = followerMap.get(followerId);
        if(list!=null){
            list.remove(Integer.valueOf(followeeId));
        }
    }

    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<>();
////        list.add(1);
//
//        System.out.println(list.remove(Integer.valueOf(2)));

        LeetCode_355 twitter = new LeetCode_355();

// 用户1发送了一条新推文 (用户id = 1, 推文id = 5).
        twitter.postTweet(1, 5);

// 用户1的获取推文应当返回一个列表，其中包含一个id为5的推文.
        twitter.getNewsFeed(1);

// 用户1关注了用户2.
        twitter.follow(1, 2);

// 用户2发送了一个新推文 (推文id = 6).
        twitter.postTweet(2, 6);

// 用户1的获取推文应当返回一个列表，其中包含两个推文，id分别为 -> [6, 5].
// 推文id6应当在推文id5之前，因为它是在5之后发送的.
        twitter.getNewsFeed(1);

// 用户1取消关注了用户2.
        twitter.unfollow(1, 2);

// 用户1的获取推文应当返回一个列表，其中包含一个id为5的推文.
// 因为用户1已经不再关注用户2.
        twitter.getNewsFeed(1);








    }
}
