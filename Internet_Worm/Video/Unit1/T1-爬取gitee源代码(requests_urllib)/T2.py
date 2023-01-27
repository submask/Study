#使用requests库爬取gitee网站首页：https://www.gitee.com/
import requests
url="https://www.gitee.com/"
resp=requests.get(url=url)
resp.encoding='utf-8'
with open("gitee网站2.html",mode='w+',encoding='utf-8') as fp:
    fp.write(resp.text)
fp.close()
resp.close()