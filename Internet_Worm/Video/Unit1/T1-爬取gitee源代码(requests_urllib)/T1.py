#使用urllib库爬取gitee网站首页：https://www.gitee.com/
from urllib.request import * #导入urlopen模块
url="http://www.gitee.com/"#设置url
resp=urlopen(url=url) #使用urlopen打开网址
with open("gitee网站1.html",mode='w+',encoding='utf-8') as fp:
    fp.write(resp.read().decode("utf-8"))
fp.close()
resp.close()
print("OK")