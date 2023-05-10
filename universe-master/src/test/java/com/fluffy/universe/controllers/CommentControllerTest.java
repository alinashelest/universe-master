package com.fluffy.universe.controllers;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;

import com.fluffy.universe.models.Comment;
import com.fluffy.universe.models.Post;
import io.javalin.Javalin;
import io.javalin.http.Context;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CommentControllerTest {
    private Javalin application;
    private CommentController commentController;
    private Context context;
    private Comment comment;

    @Before
    public void init() {
        this.commentController = mock(CommentController.class);
        this.application = mock(Javalin.class);
        this.context = mock(Context.class);
        this.comment = mock(Comment.class);

    }

    //@Test
    public void testStore() throws Exception {
        Integer postId = 123;
        comment.setPostId(postId);
        commentController.store(context);
        verify(context).redirect("/posts/dood");
    }

    @Test
    public void testRegisterRoutes() throws Exception {
        commentController.registerRoutes(application);
    }

    @Test
    public void testRender() throws Exception {
        commentController.render(context, "filePath");
    }

    @Test
    public void testDisableCaching() throws Exception {
        commentController.disableCaching(context);
    }
}