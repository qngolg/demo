1、git  merge VS git rebase 的区别

```shell
#相同点
git merge 和 git rebase 同样都是用于从一个分支获取并且合并到当前分支

#merge 合并，两个分支进行合并

#rebase 变基 可以吧本地未push的分支提交历史整理成直线，
#目的似的我们查看历史提交的变化时会更容易
#可以将本地commit的代码放置在远端代码的最前面

#git pull 拉取代码的时候 会默认把远端的代码分支merge到本地分支，这个时候就会产生一个merge commit.

#git pull --rebase 拉取代码的时候，会将你的commit 自动附加到 远端的commit结尾，这样就不会产生一个无意义的merge commit

git pull --rebase #会让commit看起来很自然
```

2、git stash 的作用

```shell
-- stash 储藏
将本地代码 存储在本地仓库
```

```jshelllanguage
#java 读取yml配置文件  snakeyml
https://www.baeldung.com/java-snake-yaml
```


3、Git pre-push 的作用和目的

4、spring Test 和 Spock

5、Spring Data (jpa、mongoDb)

6、书籍 《scrum》 《看板》  

7、什么是CI、什么是CD

8、git 操作文档


