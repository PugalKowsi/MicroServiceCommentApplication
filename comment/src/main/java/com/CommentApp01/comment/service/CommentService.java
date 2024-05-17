package com.CommentApp01.comment.service;

import com.CommentApp01.comment.entity.Comment;

import java.util.List;

public interface CommentService {
    Comment saveComment(Comment comment);

    List<Comment> getAllCommentByPostId(String postId);
}
