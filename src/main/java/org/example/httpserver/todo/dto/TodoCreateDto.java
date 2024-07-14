package org.example.httpserver.todo.dto;


import org.example.httpserver.todo.Priority;

public record TodoCreateDto(String title, String description, Long userId, Priority priority) {
}
