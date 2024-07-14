package org.example.httpserver.todo;

import lombok.*;
import org.example.httpserver.annotations.Domain;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Domain
public class Todo {
    private Long id;
    private String title;
    private String description;
    private Long userId;
    private boolean done;
    private Priority priority;
    private Date createdAt;
}
