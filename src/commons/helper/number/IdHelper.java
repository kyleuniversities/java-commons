package commons.helper.number;

import commons.util.number.MockIdGenerator;

public class IdHelper {
    /**
     * Creates a mock id
     */
    public static String nextMockId() {
        return MockIdGenerator.newInstance().nextId();
    }

    /**
     * Private Constructor to prevent instantiation
     */
    private IdHelper() {
        super();
    }
}
