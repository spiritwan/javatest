package sample.crawler;

public class SoGouCrawler implements ICrawler {
    @Override
    public String run() {
        return this.getClass().getName()+" running.";
    }
}
