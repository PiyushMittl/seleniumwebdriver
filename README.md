# Seleniumwebdriver buy product on Mi website automation


Setup webdriver client on mac:

![Throughput Graph](https://github.com/PiyushMittl/seleniumwebdriver/blob/master/configure_driver_im1.png)

#### Goto Safari->Preferences
![Throughput Graph](https://github.com/PiyushMittl/seleniumwebdriver/blob/master/configure_driver_im2.png)

#### Check “Show Develop menu in menu bar”
![Throughput Graph](https://github.com/PiyushMittl/seleniumwebdriver/blob/master/configure_driver_im3.png)

#### Develop->Allow Remote Automation
![Throughput Graph](https://github.com/PiyushMittl/seleniumwebdriver/blob/master/configure_driver_im4.png)

-----

below are some screenshot with their respective commands:

```java
//open site
 driver.get("http://www.mi.com/in/index.html");
```
![Throughput Graph](https://github.com/PiyushMittl/seleniumwebdriver/blob/master/opensite.png)
```java
//click on Signin (here we have already filled username and password but we will fill it programatically through webdriver)
driver.findElement(By.xpath("//*[@id=\"J_signEntries\"]/ul/li[1]")).click();
```
![Throughput Graph](https://github.com/PiyushMittl/seleniumwebdriver/blob/master/username.png)
```java
//fill upername and password username
Thread.currentThread().sleep(2000);
driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("9358909659");
```
![Throughput Graph](https://github.com/PiyushMittl/seleniumwebdriver/blob/master/password.png)
![Throughput Graph](https://github.com/PiyushMittl/seleniumwebdriver/blob/master/signin.png)



![sample video link](https://github.com/PiyushMittl/seleniumwebdriver)
