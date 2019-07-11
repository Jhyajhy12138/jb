package com.zte.jb.service.impl;

import com.zte.jb.dao.PostDao;
import com.zte.jb.entity.Post;
import com.zte.jb.entity.User;
import com.zte.jb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Author:helloboy
 * Date:2019-07-04 11:04
 * Description:<描述>
 */
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostDao postDao;

    public void addPost(Post post){
        postDao.insertPost(post);
    }

//    public Post findPostByPId(Integer pId){
//        return postDao.selectPostByPId(pId);
//    }

    public List<Post> findAllPosts(){
        return postDao.selectAllPosts();
    }

//    public User login(String uTel){
//        return postDao.login(uTel);
//    }
}
