package com.zte.jb.test;

import com.sun.javafx.collections.MappingChange;
import com.zte.jb.entity.Post;
import com.zte.jb.service.PostService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.rowset.serial.SerialBlob;
import javax.swing.text.html.HTMLDocument;
import java.io.UnsupportedEncodingException;
import java.sql.Blob;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) throws SQLException, UnsupportedEncodingException {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-dao.xml");
        PostService postService =(PostService)context.getBean(PostService.class);
        //String转byte[]
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sdf.format(new Date());
        String text = "姜恒毅大菜逼";
        byte[] bytes = text.getBytes("utf-8");
        Post post = new Post(1,bytes,null,dateTime);
        System.out.println(post);
        postService.addPost(post);*/
        //        Blob blob = new SerialBlob(text.getBytes());

        //byte[]转String
        /*Post post = postService.findPostByPId(2);
        String string = new String(post.getpContent(),"utf-8");
        System.out.println(post);*/

        /*String string = "今天天气真好！";
        byte[] bytes = string.getBytes();
        System.out.println(bytes);
        String str = new String(bytes);
        System.out.println(str);*/

        List<Post> posts = postService.findAllPosts();
        Iterator iterator = posts.iterator();
        while (iterator.hasNext()){
            Map map = (Map) iterator.next();
            String string = new String((byte[]) map.get("pContent"),"utf-8");
//            System.out.println(string);
//            String string = new String(blob.getBytes((long)1,(int)blob.length()));
        }
        System.out.println(posts);

//        System.out.println(postService.login("15268672289"));
    }
}
