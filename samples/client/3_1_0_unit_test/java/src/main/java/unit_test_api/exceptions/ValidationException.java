package unit_test_api.exceptions;

@SuppressWarnings("serial")
public class ValidationException extends BaseException {
    public ValidationException(String s) {
        super(s);
    }
}