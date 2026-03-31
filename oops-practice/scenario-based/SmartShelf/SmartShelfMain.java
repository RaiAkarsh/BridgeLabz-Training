class SmartShelfMain {
    public static void main(String[] args) {
        SmartShelFunc ss = new SmartShelFunc();
        ss.addBook("The Great Gatsby");
        ss.addBook("The alchemist");
        ss.addBook("The GodFather");

        ss.displayBooks();
        ss.removeBook("The alchemist");
        ss.updateBook("The GodFather", "The GodFather - Updated Edition");
        ss.displayBooks();

    }
}