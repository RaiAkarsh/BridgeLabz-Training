import java.util.Stack;

class Page {
    String url;
    Page prev;
    Page next;

    Page(String url) {
        this.url = url;
    }
}

public class BrowserLogic {

    private Page current;
    private Stack<Page> closedTabs = new Stack<>();

    // Visit new page
    public void visit(String url) {
        Page newPage = new Page(url);

        if (current != null) {
            current.next = newPage;
            newPage.prev = current;
        }

        current = newPage;
        System.out.println("Visited: " + url);
    }

    // Go back
    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        } else {
            System.out.println("No previous page");
        }
    }

    // Go forward
    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        } else {
            System.out.println("No forward page");
        }
    }

    // Close current tab
    public void closeTab() {
        if (current != null) {
            closedTabs.push(current);
            System.out.println("Closed: " + current.url);

            if (current.prev != null) {
                current = current.prev;
                current.next = null;
            } else {
                current = null;
            }
        }
    }

    // Reopen last closed tab
    public void reopenTab() {
        if (!closedTabs.isEmpty()) {
            Page reopened = closedTabs.pop();
            System.out.println("Reopened: " + reopened.url);
            current = reopened;
        } else {
            System.out.println("No closed tabs");
        }
    }

    // Show current page
    public void showCurrent() {
        if (current != null) {
            System.out.println("Current Page: " + current.url);
        } else {
            System.out.println("No page open");
        }
    }
}
