# Spring IOC基础测试

## 考察点和要求

- spring ioc 基础

- spring bean 注解

- Java继承多态

- 两个小时内完成,做多少算多少

- 代码提交git fork之后提交到自己的仓库


## 验收标准

- 参照现有代码实现 BingCrawler/SoGouCrawler 两个类

- 访问"localhost:8080/crawler/{crawlerName}/run" 即可调用对应的Crawler.run方法返回XXX running,例如 crawlerName的值为BaiduCrawler时调用 BaiduCrawler实例的run方法返回数据给浏览器

- 注意: {crawlerName} 替换成对应的爬虫类名,如: BaiduCrawler/Googlerawler/BingCrawler

- 调用不同的Crawler时不允许使用if else或者switch case语句,请参考Ioc/spring容器相关资料实现


## 其他说明

- JDK1.8 + maven + spring boot

- [localhost:8080/crawler/BaiduCrawler/run](localhost:8080/crawler/{爬虫名称:如BaiduCrawler}/run) Web API 已实现,启动即可使用

- vs code 环境直接 debug启动Application.java 即可

- IDEA 环境直接启动 Application.java main方法

- maven 命令行可使用 "mvn spring-boot:run" 启动.
