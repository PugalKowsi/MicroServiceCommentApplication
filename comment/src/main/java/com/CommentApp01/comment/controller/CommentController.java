package com.CommentApp01.comment.controller;

import com.CommentApp01.comment.entity.Comment;
import com.CommentApp01.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping
    public ResponseEntity<Comment>saveComment(@RequestBody Comment comment){
    Comment comment1=commentService.saveComment(comment);
    return new ResponseEntity<>(comment1, HttpStatus.CREATED);
    }
    @GetMapping("/{postId}")
    public ResponseEntity<Comment> getAllCommentByPostId(@PathVariable(value = "postId") String postId){
    List<Comment> comment = commentService.getAllCommentByPostId(postId);
    return new ResponseEntity(comment,HttpStatus.OK);
    }
}
