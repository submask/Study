import re
import requests
import csv
import pymongo
import pymysql
header={
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36 Edg/110.0.1587.46"
}
for i in range(1,25):
    url="https://shenzhen.qfang.com/newhouse/list/n{}".format(i)
    req=requests.get(url,headers=header)
    content=req.text
    cpe=re.compile('<div class="list-main" data-v-903de2dc>.*?<h3 class="title" data-v-903de2dc>(?P<name>.*?)</h3>'
                   '.*?<p class="meta-items region" data-v-903de2dc><!---->(?P<add>.*?)</p>'
                   '.*?<p class="meta-items" data-v-903de2dc>(?P<type>.*?)</p>'
                   '.*?<span class="con" data-v-903de2dc>(?P<area>.*?)</span>'
                   '.*?<a .*?>(?P<addr>.*?)</a>'
                   '.*?<span class="amount" data-v-903de2dc>(?P<Price>.*?)</span>',re.S)
    result=cpe.finditer(content)

    f=open("q租房新房信息.csv", mode='a+')
    csvwrite=csv.writer(f)
    for item in result:
        dict=item.groupdict()
        dict['add']=dict['add'].strip()
        dict['addr'] = dict['addr'].strip()
        dict['type']=dict['type'].strip()
        dict['area']=dict['area'].strip()
        dict['Price'] = dict['Price']+"元"
        try:
            csvwrite.writerow(dict.values())
        except:
            continue
        client = pymongo.MongoClient(host='127.0.0.1', port=27017)
        db=client['baidu']
        collection=db['QrentHouse']
        collection.insert_one(dict)
    print("正在爬取第"+str(i)+"页数据")
print("ok")