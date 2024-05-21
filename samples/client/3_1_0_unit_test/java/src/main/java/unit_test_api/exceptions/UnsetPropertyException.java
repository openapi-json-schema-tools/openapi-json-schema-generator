package unit_test_api.exceptions;

@SuppressWarnings("serial")
public class UnsetPropertyException extends BaseException {
    public UnsetPropertyException(String s) {
        super(s);
    }
}