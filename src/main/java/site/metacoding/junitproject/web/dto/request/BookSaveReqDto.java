package site.metacoding.junitproject.web.dto.request;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.junitproject.domain.Book;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter // Controller 에서 Setter 가 호출되면서 Dto 값이 채워짐
public class BookSaveReqDto {

    @Size(min = 1, max = 50)
    @NotBlank
    private String title;

    @Size(min = 2, max = 20)
    @NotBlank
    private String author;

    public Book toEntity() {
        return Book.builder()
                .title(title)
                .author(author)
                .build();
    }
}
