package Chap2;

import java.util.LinkedList;

public class TwoQueueImpStack_9 {
	LinkedList<Integer> queue1 = new LinkedList<>();
	LinkedList<Integer> queue2 = new LinkedList<>();

	public void push(int node) {
		if (queue1.isEmpty()) {
			queue1.offer(node);
		} else {
			queue2.offer(node);
		}
	}

	public int pop() {
		if (queue1.isEmpty() && queue2.isEmpty()) {
			throw new RuntimeException();
		} else if (queue1.isEmpty()) {
			int size = queue2.size();
			for (int i = 0; i < size - 1; i++) {
				queue1.offer(queue2.poll());
			}
			return queue2.poll();
		} else {
			int size = queue1.size();
			for (int i = 0; i < size - 1; i++) {
				queue2.offer(queue1.poll());
			}
			return queue1.poll();
		}
	}
}
