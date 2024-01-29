package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(Objects.requireNonNull(firstQueue.poll()));
        deque.add(Objects.requireNonNull(secondQueue.poll()));
        ArrayDeque<Integer> firstDeque = new ArrayDeque<>(firstQueue);
        ArrayDeque<Integer> secondDeque = new ArrayDeque<>(secondQueue);
        while (!firstDeque.isEmpty() || !secondDeque.isEmpty()) {
            if (!firstDeque.isEmpty()) {
                firstDeque.addLast(Objects.requireNonNull(deque.poll()));
                deque.add(Objects.requireNonNull(firstDeque.poll()));
                deque.add(Objects.requireNonNull(firstDeque.poll()));
            }
            if (!secondDeque.isEmpty()) {
                secondDeque.addLast(Objects.requireNonNull(deque.poll()));
                deque.add(Objects.requireNonNull(secondDeque.poll()));
                deque.add(Objects.requireNonNull(secondDeque.poll()));
            }
        }
        return deque;
    }
}
