package org.example.springdayproject.service;

import org.example.springdayproject.entity.Todo;
import org.example.springdayproject.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    // 전체 조회
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    // 단건 조회
    public Optional<Todo> findById(Long id) {
        return todoRepository.findById(id);
    }

    // 생성
    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    // 수정
    public Optional<Todo> update(Long id, Todo updatedTodo) {
        return todoRepository.findById(id).map(todo -> {
            todo.setTitle(updatedTodo.getTitle());
            todo.setContent(updatedTodo.getContent());
            todo.setMemberId(updatedTodo.getMemberId());

            // null 포인트 익셉션 방지
            if (updatedTodo.getUsername() != null) {
                todo.setUsername(updatedTodo.getUsername());
            }

            return todoRepository.save(todo);
        });
    }


    // 삭제
    public boolean delete(Long id) {
        return todoRepository.findById(id).map(todo -> {
            todoRepository.delete(todo);
            return true;
        }).orElse(false);
    }
}
