package com.unnati.blog.service;

import com.unnati.blog.model.Post;
import com.unnati.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface PostService {
    Post savePost(Post post);

    List<Post> getAllPosts();

    Post getPostsById(Long postId);

    public void likePost(Long postId);

    public List<Post> searchByName(String name);

}
