#使用request爬取豆瓣的数据
import requests
url="https://www.douban.com/"
web=requests.get(url)
print("web爬取的响应类型{}".format(type(web)))
print("web爬取的url{}".format(web.url))
print("web爬取的状态码{}".format(web.status_code))
print("web爬取的请求头{}".format(web.headers))
