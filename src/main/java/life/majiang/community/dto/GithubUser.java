package life.majiang.community.dto;

import lombok.Data;

/**
 * @author Lenovo
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
