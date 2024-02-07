package commons.helper;

import commons.util.entry.Entry;
import commons.util.entry.OrdinaryValueEntry;

/**
 * Helper class for Entry Operations
 */
public class EntryHelper {
    /**
     * Creates a new Entry
     */
    public static <K, V> Entry<K, V> newEntry(K key, V value) {
        return OrdinaryValueEntry.newInstance(key, value);
    }

    /**
     * Private Constructor to prevent instantiation
     */
    private EntryHelper() {
        super();
    }
}
