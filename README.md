# Login Sytem

![img.png](img.png)
<img src="https://img.shields.io/badge/Java-1.8.0-blue.svg" alt="Java">
<img src="https://img.shields.io/badge/Version-0.0.1-blue.svg" alt="Version">
<img src="https://img.shields.io/badge/Status-Ready-blue.svg" alt="Status">

# Description

 - This is a super safe login system this use a [RCZ Encrypt System](https://github.com/Halqq/RCZEncryptationKT), it is hard to crack the password and user.

# How to use

- put this package in your project.
- in dev/halq/login/sendrequest/WebHookUtil in line 26, put your discord web hook, this is for send the data to discord.


example:

![img_1.png](img_1.png)

- in dev/halq/login/verifylogin/GetInfos in line 18, put your server ip, this is for send the data to server (you can use pastebin but is not safe).


example:

![img_2.png](img_2.png)

- add the code in your main class

```java
Frame.mainUI();
````

- to you add users in database, the user need send request, user can press in register button


![img_3.png](img_3.png)

- after user press in register button, you will receive a request in discord


![img_4.png](img_4.png)


- if you want add user in database, you need copy encoded user and pass and put it in database
- example encoded user : RCZ-,89前今67前今79前今88前今:84前今66前今67前今67前今

- after you add user in database, the user can be login pressing in login button




