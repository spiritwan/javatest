package sample.crawler;

public class GoogleCrawler implements ICrawler {

    @Override
    public String run() {
        return this.getClass().getName() + " running.";
    }

}
