package com.CommentApp01.comment.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    private String PostId;
    private String description;
    private String content;
    private String title;
}