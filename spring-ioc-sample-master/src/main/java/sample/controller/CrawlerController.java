package sample.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sample.crawler.*;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CrawlerController {

    @RequestMapping(value = "/crawler/BaiduCrawler/run", method = RequestMethod.GET)
    public String run() {
        ICrawler crawler = new BaiduCrawler();
        return crawler.run();
    }

    @RequestMapping(value = "/crawler/GoogleCrawler/run", method = RequestMethod.GET)
    public String run2() {
        ICrawler crawler = new GoogleCrawler();
        return crawler.run();
    }
    @RequestMapping(value = "/crawler/BingCrawler/run", method = RequestMethod.GET)
    public String run3() {
        ICrawler crawler = new BingCrawler();
        return crawler.run();
    }
    @RequestMapping(value = "/crawler/SoGouCrawler/run", method = RequestMethod.GET)
    public String run4() {
        ICrawler crawler = new SoGouCrawler();
        return crawler.run();
    }

}