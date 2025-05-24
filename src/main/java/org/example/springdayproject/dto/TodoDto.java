package org.example.springdayproject.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class TodoDto {

    @NotBlank(message = "제목은 필수입니다.")
    private String title;

    private String content;

    @NotNull(message = "ID는 필수입니다.")
    private Long memberId;

    @NotBlank(message = "작성자명은 필수입니다.")
    private String username;


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Long getMemberId() {
        return memberId;
    }
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
