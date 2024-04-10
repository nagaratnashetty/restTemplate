package com.example.restTemplate.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@FieldDefaults(level= AccessLevel.PRIVATE)//lowest priority
public class ArticleResponse {

    String author;
    String title;
    String description;
}
