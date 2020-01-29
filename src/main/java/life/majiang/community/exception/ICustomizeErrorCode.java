package life.majiang.community.exception;


public interface ICustomizeErrorCode {
        /**
         * to get error message.
         * @return error message.
         */
        String getMessage();

        Integer getCode();
}
