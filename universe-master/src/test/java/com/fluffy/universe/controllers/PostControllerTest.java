package com.fluffy.universe.controllers;

import io.javalin.Javalin;
import org.junit.jupiter.api.Test;
import io.javalin.http.Context;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
class PostControllerTest {
    //protected final Javalin application = mock(Javalin.class);
    private Context context; private Javalin application;

    @Test
    void indexPage_shouldRedirectToHomePage() {
        // Mock the context object
        context = mock(Context.class);
        application = mock(Javalin.class);
        // Call the method being tested
        PostController postController = new PostController(application);
        postController.indexPage(context);

        // Verify that the redirect method was called with the expected argument
        verify(context).redirect("/");
    }


}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme