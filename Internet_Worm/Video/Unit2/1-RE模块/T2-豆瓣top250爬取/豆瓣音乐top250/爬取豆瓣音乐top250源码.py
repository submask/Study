import re
import requests
import csv
import pymongo
header={
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36 Edg/110.0.1587.46"
}
for i in range(0,226,25):
    url="https://music.douban.com/top250?start={}".format(i)
    req=requests.get(url=url,headers=header)
    content=req.text
    cpe=re.compile('<div class="pl2">.*?title="(?P<author>.*?) - (?P<name>.*?)".*?<span class="rating_nums">(?P<score>.*?)</span>',re.S)
    result=cpe.finditer(content)
    f=open("douban_musictop250.csv", mode='a+')
    csvwrite=csv.writer(f)
    for books in result:
            dict=books.groupdict()
            csvwrite.writerow(dict.values())
    f.close()
    print("正在爬取第{}页".format(i))
print("ok")
