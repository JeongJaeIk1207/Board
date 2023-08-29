package com.sparta.board.dto;


import com.sparta.board.entity.Board;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;
//    private String password;
    private LocalDateTime createAt;
    private LocalDateTime modifiedAt;

    public BoardResponseDto(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.author = board.getAuthor();
//        this.password = board.getPassword();
        this.createAt = board.getCreatedAt();
        this.modifiedAt = board.getModifiedAt();
    }

//    public MemoResponseDto(Long id, String username, String contents) {
//        this.id = id;
//        this.title = username;
//        this.content = contents;
//    }
}