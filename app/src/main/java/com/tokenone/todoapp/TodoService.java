package com.tokenone.todoapp;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

public interface TodoService {
    @GET("/todos")
    Call<List<Todo>> listTodos();
}
