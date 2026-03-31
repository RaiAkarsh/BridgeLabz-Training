import java.util.*;

public class ImplementCustomHashMapFunc<K, V> {

    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private int capacity;
    private Node<K, V>[] table;

    public ImplementCustomHashMapFunc() {
        capacity = 10;
        table = (Node<K, V>[]) new Node[capacity];
    }

    private int hashFunction(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        int index = hashFunction(key);
        Node<K, V> head = table[index];

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = table[index];
        table[index] = newNode;
    }

    public V get(K key) {
        int index = hashFunction(key);
        Node<K, V> curr = table[index];

        while (curr != null) {
            if (curr.key.equals(key)) {
                return curr.value;
            }
            curr = curr.next;
        }
        return null;
    }

    public V remove(K key) {
        int index = hashFunction(key);
        Node<K, V> curr = table[index];
        Node<K, V> prev = null;

        while (curr != null) {
            if (curr.key.equals(key)) {
                break;
            }
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) {
            return null;
        }

        if (prev == null) {
            table[index] = curr.next;
        } else {
            prev.next = curr.next;
        }

        return curr.value;
    }
}
