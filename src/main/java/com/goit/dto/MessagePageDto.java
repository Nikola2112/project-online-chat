package com.goit.dto;

import com.fasterxml.jackson.annotation.JsonView;

import com.goit.entity.Message;
import com.goit.entity.Views;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@JsonView(Views.FullMessage.class)
public class MessagePageDto {
    private List<Message> messages;
    private int currentPage;
    private int totalPages;

}
