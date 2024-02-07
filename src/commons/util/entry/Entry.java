package commons.util.entry;

/**
 * Utility key-value pair interface
 */
public interface Entry<K, V> {
    public K getKey();

    public V getValue();
}
