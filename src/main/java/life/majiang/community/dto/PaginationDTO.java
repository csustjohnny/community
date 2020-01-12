package life.majiang.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PaginationDTO {
    public static final Integer HALF_PAGE_SIZE = 2;
    private List<QuestionDTO> questions;
    private Boolean showPrevious;
    private Boolean showFirstPage;
    private Boolean showNext;
    private Boolean showEndPage;

    private Integer page;
    private List<Integer> pages;
    private Integer totalPage;

    public PaginationDTO(){
        pages = new ArrayList<>();
    }
    public void setPagination(Integer totalCount, Integer page, Integer size) {

        if (totalCount % size == 0) {
            totalPage = totalCount / size;
        } else {
            totalPage = totalCount / size + 1;
        }
        if(page<1){
            page=1;
        }
        if(page>totalPage){
            page = totalPage;
        }
        this.page = page;

        pages.add(page);

        for (int i = 1; i <= HALF_PAGE_SIZE+1; i++) {
            if (page - i > 0) {
                pages.add(0, page - i);
            }
            if (page + i <= totalPage) {
                pages.add(page + i);
            }
        }
        showPrevious = page != 1;
        showNext = !page.equals(totalPage);
        showFirstPage = !pages.contains(1);
        showEndPage = !pages.contains(totalPage);
    }
}
