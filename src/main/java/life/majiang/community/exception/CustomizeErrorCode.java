package life.majiang.community.exception;

/**
 * @author Lenovo
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {
    /**
     *
     */
    QUESTION_NOT_FOUND(2001,"你找到的问题不在了，换个问题试试?"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或评论进行恢复"),
    NO_LOGIN(2003,"当前操作需要登录，请登录后重试"),
    SYSTEM_ERROR(2004,"服务器冒烟了，要不稍后试试？"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006,"回复的评论不存在了，要不换个试试？")

    ;

    private String message;

    private Integer code;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }
}
