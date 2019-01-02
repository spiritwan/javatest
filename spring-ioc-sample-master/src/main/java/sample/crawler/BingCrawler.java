package sample.crawler;

public class BingCrawler implements ICrawler {
    @Override
    public String run() {
        return this.getClass().getName() + " running.";
    }
}
