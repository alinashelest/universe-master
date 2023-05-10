package com.fluffy.universe.models;

import com.fluffy.universe.models.Comment;
import com.fluffy.universe.models.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {
    Post post;
    @BeforeEach
    void setUp() {
        post =  new Post();
    }

    @Test
    void getId() {
        Integer id = 123;
        post.setId(id);
        assertEquals(post.getId(),id);
    }

    @Test
    void setId() {
        Integer newId = 123;
        post.setId(newId);
        assertEquals(post.getId(),newId);
        newId = 456;
        post.setId(newId);
        assertEquals(post.getId(),newId);
    }

    @Test
    void getUserId() {
        Integer userId = 123;
        post.setUserId(userId);
        assertEquals(post.getUserId(),userId);
    }

    @Test
    void setUserId() {
        Integer userId = 123;
        post.setUserId(userId);
        assertEquals(post.getUserId(),userId);
        userId = 456;
        post.setUserId(userId);
        assertEquals(post.getUserId(),userId);
    }

    @Test
    void getTitle() {
        String title = "123";
        post.setTitle(title);
        assertEquals(post.getTitle(),title);
    }

    @Test
    void setTitle() {
        String title = "123";
        post.setTitle(title);
        assertEquals(post.getTitle(),title);
        title = "456";
        post.setTitle(title);
        assertEquals(post.getTitle(),title);
    }

    @Test
    void getDescription() {
        String description = "123";
        post.setDescription(description);
        assertEquals(post.getDescription(),description);
    }

    @Test
    void setDescription() {
        String description = "123";
        post.setDescription(description);
        assertEquals(post.getDescription(),description);
        description = "456";
        post.setDescription(description);
        assertEquals(post.getDescription(),description);
    }

    @Test
    void getPublicationDateTime() {
        String publicationDateTime = "123";
        post.setPublicationDateTime(publicationDateTime);
        assertEquals(post.getPublicationDateTime(),publicationDateTime);
    }

    @Test
    void setPublicationDateTime() {
        String publicationDateTime = "123";
        post.setPublicationDateTime(publicationDateTime);
        assertEquals(post.getPublicationDateTime(),publicationDateTime);
        publicationDateTime = "456";
        post.setPublicationDateTime(publicationDateTime);
        assertEquals(post.getPublicationDateTime(),publicationDateTime);
    }

    @Test
    void testSetPublicationDateTime() {
        LocalDateTime publicationDateTime = LocalDateTime.parse("2011-12-03T10:15:30");
        post.setPublicationDateTime(publicationDateTime);
        assertEquals(post.getPublicationDateTime(),publicationDateTime.toString());
    }
}