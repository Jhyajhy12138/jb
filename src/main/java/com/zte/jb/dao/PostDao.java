package com.zte.jb.dao;

import com.zte.jb.entity.Post;
import com.zte.jb.entity.User;

import java.util.List;
import java.util.Map;

public interface PostDao {
    void insertPost(Post post);
//    Post selectPostByPId(Integer pId);
    List<Post> selectAllPosts();

//    User login(String uTel);

}
