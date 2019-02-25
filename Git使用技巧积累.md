#Git使用技巧积累

####git add  添加操作
####git  commit 提交操作

####git revert 版本号   #回退掉一个版本 此时也是一个commit 需要push到远端才行

####git push origin master

####git reset 版本号 #删除掉某个版本号的commit，但是代码的修改还在 

#####git reset head~   删除上一个commit,代码的修改还在
#####git reset HEAD~ --hard #删除掉上一个commit,同时代码的修改也不在了

####git checkout .

####git log 

####git diff 

####git pull -r origin master

####git stash (储藏)
当你进行pull 操作的时候 或者checkout操作的时候  不想修改本地的修改，可以先stash你要的代码

git stash list #查看 stash的列表
git stash apply stash${0} #切换到你的stash里面


####如何把master上的一个commit移动到development上
1、首先把 master上的commit移除掉  git  reset  head~ (移动到上一次提交)
2、再把移除的commit stash起来  git stash
3、再checkout出development分支  git checkout development
4、再拉取development中的最新代码  git pull -r
5. 再把stash的代码 拿出来  git stash pop
6、git add .你的代码
7.git commit  
8.git push   


#### git commit --amend 提交本次代码 到上一次提交
https://blog.csdn.net/u010164190/article/details/78121718
