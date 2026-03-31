public class BrowserMain {
    public static void main(String[] args) {

        BrowserLogic browser = new BrowserLogic();

        browser.visit("google.com");
        browser.visit("github.com");
        browser.visit("stackoverflow.com");

        browser.back();       // github
        browser.back();       // google
        browser.forward();    // github

        browser.closeTab();   // close github
        browser.showCurrent();// google

        browser.reopenTab();  // github
        browser.showCurrent();
    }
}
