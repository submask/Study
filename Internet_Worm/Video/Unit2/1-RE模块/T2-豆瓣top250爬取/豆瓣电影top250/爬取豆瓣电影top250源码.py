import random
import re
import time
import requests
import csv
import pymongo
headers={
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36 Edg/110.0.1587.41"
}
for i in range(0,226,25):
    url="http://movie.douban.com/top250?start="+str(i)
    resp=requests.get(url=url,headers=headers)
    content=resp.text
    cpe=re.compile('<div class="item">.*?<span class="title">(?P<name>.*?)'
                           '</span>.*?<p class="">.*?<br>(?P<year>.*?)&nbsp;/&nbsp;(?P<country>.*?)&nbsp;.*?<span class="rating_num" property="v:average">(?P<score>.*?)</span>.*?<span>(?P<person>.*?)</span>'
                           '',re.S)
    result=cpe.finditer(content)
    f = open('douban_movicetop250.csv', mode='a+')
    csvwriters = csv.writer(f)
    for item in result:
        dict=item.groupdict()
        dict['year']=dict['year'].strip()
        client=pymongo.MongoClient(host='127.0.0.1',port=27017)
        db=client['douban']
        collection=db['movices']
        collection.insert_one(dict)
        csvwriters.writerow(dict.values())
    print("已爬取{}内容".format(i))
f.close()
print("OK")