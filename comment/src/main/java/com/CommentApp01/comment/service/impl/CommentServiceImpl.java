package com.CommentApp01.comment.service.impl;

import com.CommentApp01.comment.config.RestTemplateConfig;
import com.CommentApp01.comment.entity.Comment;
import com.CommentApp01.comment.payload.Post;
import com.CommentApp01.comment.repository.CommentRepository;
import com.CommentApp01.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private RestTemplateConfig restTemplateConfig;

      @Override
    public Comment saveComment(Comment comment) {
        Post post = restTemplateConfig.getRestTemplate().getForObject
                ("http://PostApplication/api/posts/" + comment.getPostId(), Post.class);

        if(post!=null){
            //"!="  it's mean Not equal.
            String commentId = UUID.randomUUID().toString();
            comment.setCommentId(commentId);
            Comment comment1 =commentRepository.save(comment);
            return comment1;
        }else {
        return null;
        }
    }
    @Override
    public List<Comment> getAllCommentByPostId(String postId) {
        List<Comment> comments = commentRepository.findByPostId(postId);
    return comments;
    }
}
