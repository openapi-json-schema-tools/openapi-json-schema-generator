package unit_test_api.servers;

public interface ServerProvider<T> {
    Server getServer(T serverIndex);
}

