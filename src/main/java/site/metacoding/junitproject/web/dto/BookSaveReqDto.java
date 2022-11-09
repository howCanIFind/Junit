package site.metacoding.junitproject.web.dto;

import lombok.Getter;
import site.metacoding.junitproject.domain.Book;

@Getter // Controller 에서 Setter 가 호출되면서 Dto 값이 채워짐
public class BookSaveReqDto {
    private String title;
    private String author;

    public Book toEntity() {
        return Book.builder()
                .title(title)
                .author(author)
                .build();
    }
}