package com.unnati.blog.service;

import com.unnati.blog.model.Comment;

import java.util.List;

public interface CommentService {

    public Comment createComment(Long postId, String postedBy, String content);
    public List<Comment> getCommentByPostId(Long postId);
}
