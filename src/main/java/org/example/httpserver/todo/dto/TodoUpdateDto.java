package org.example.httpserver.todo.dto;


import org.example.httpserver.todo.Priority;

public record TodoUpdateDto(Long id, String title, String description, Priority priority, Boolean completed) {
}
