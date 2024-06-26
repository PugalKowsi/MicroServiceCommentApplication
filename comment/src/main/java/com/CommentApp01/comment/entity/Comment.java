package com.CommentApp01.comment.entity;
//push 26/06/2024
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="comments")
public class Comment {
    @Id
    private String commentId;
    private String name;
    private String email;
    private String body;
    private String postId;
}
