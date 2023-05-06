public interface MyObservable {
    /**
     * Interface that represents the implementation od adding and observer
     * Removing an observer
     * Update notify method
     * @param o
     */
    void addObserver(MyObserver o);
    void removeObserver(MyObserver o);
    void notifyUpdates();
}
