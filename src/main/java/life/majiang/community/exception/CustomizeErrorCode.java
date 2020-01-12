package life.majiang.community.exception;

/**
 * @author Lenovo
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {
    /**
     *
     */
    QUESTION_NOT_FOUND("你找到的问题不在了，换个问题试试?");

    private String message;


    CustomizeErrorCode(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
