package com.fluffy.universe.models;

import com.fluffy.universe.models.Comment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CommentTest {
    Comment comment;
    @BeforeEach
    void setUp() {
        comment =  new Comment();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getId() {
        Integer id = 123;
        comment.setId(id);
        assertEquals(comment.getId(),id);
    }

    @Test
    void setId() {
        Integer newId = 123;
        comment.setId(newId);
        assertEquals(comment.getId(),newId);
        newId = 456;
        comment.setId(newId);
        assertEquals(comment.getId(),newId);
    }

    @Test
    void getParentId() {
        Integer parentId = 123;
        comment.setParentId(parentId);
        assertEquals(comment.getParentId(),parentId);
    }

    @Test
    void setParentId() {
        Integer parentId = 123;
        comment.setParentId(parentId);
        assertEquals(comment.getParentId(),parentId);
        parentId = 456;
        comment.setParentId(parentId);
        assertEquals(comment.getParentId(),parentId);
    }

    @Test
    void getUserId() {
        Integer userId = 123;
        comment.setUserId(userId);
        assertEquals(comment.getUserId(),userId);
    }

    @Test
    void setUserId() {
        Integer parentId = 123;
        comment.setParentId(parentId);
        assertEquals(comment.getParentId(),parentId);
        parentId = 456;
        comment.setParentId(parentId);
        assertEquals(comment.getParentId(),parentId);
    }

    @Test
    void getPostId() {
        Integer postId = 123;
        comment.setPostId(postId);
        assertEquals(comment.getPostId(),postId);
    }

    @Test
    void setPostId() {
        Integer postId = 123;
        comment.setPostId(postId);
        assertEquals(comment.getPostId(),postId);
        postId = 456;
        comment.setPostId(postId);
        assertEquals(comment.getPostId(),postId);
    }

    @Test
    void getDescription() {
        String description = "123";
        comment.setDescription(description);
        assertEquals(comment.getDescription(),description);
    }

    @Test
    void setDescription() {
        String description = "123";
        comment.setDescription(description);
        assertEquals(comment.getDescription(),description);
        description = "456";
        comment.setDescription(description);
        assertEquals(comment.getDescription(),description);
    }

    @Test
    void getPublicationDateTime() {
        String publicationDateTime = "123";
        comment.setPublicationDateTime(publicationDateTime);
        assertEquals(comment.getPublicationDateTime(),publicationDateTime);
    }

    @Test
    void setPublicationDateTime() {
        String publicationDateTime = "123";
        comment.setPublicationDateTime(publicationDateTime);
        assertEquals(comment.getPublicationDateTime(),publicationDateTime);
        publicationDateTime = "456";
        comment.setPublicationDateTime(publicationDateTime);
        assertEquals(comment.getPublicationDateTime(),publicationDateTime);
    }

    @Test
    void testSetPublicationDateTime() {
        LocalDateTime publicationDateTime = LocalDateTime.parse("2011-12-03T10:15:30");
        comment.setPublicationDateTime(publicationDateTime);
        assertEquals(comment.getPublicationDateTime(),publicationDateTime.toString());
    }
}