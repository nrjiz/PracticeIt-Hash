public void retainAll(HashIntSet other) {
    for (Node front : elementData) {
	Node current = front;
	while (current != null) {
	    if (!other.contains(current.data))
		remove(current.data);

	    current = current.next;
	}
    }
}
