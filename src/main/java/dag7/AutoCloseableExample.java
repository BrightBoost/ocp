package dag7;

public class AutoCloseableExample implements AutoCloseable {

    @Override
    public void close() throws CustomException {
        throw new CustomException();
    }
}
