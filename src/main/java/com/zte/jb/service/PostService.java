package com.zte.jb.service;

import com.zte.jb.entity.Post;
import com.zte.jb.entity.User;

import java.util.List;
import java.util.Map;

/**
 * Author:helloboy
 * Date:2019-07-04 11:03
 * Description:<描述>
 */
public interface PostService {
    void addPost(Post post);
//    Post findPostByPId(Integer pId);
    List<Post> findAllPosts();

//    User login(String uTel);
}
