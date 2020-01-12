package life.majiang.community.dto;

import lombok.Data;

/**
 * @author Lenovo
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
