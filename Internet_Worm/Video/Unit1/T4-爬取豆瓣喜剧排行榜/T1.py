import requests
url='https://movie.douban.com/j/chart/top_list'
headers={
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36 Edg/109.0.1518.69"
}
page=0
for i in range(0,1000):
    datas={
        "type": "24",
        "interval_id": "100:90",
        "action":"",
        "start": "{}".format(i),
        "limit": "20"
    }
    resp=requests.get(url=url,params=datas,headers=headers)
    resp.encoding='utf-8'
    with open('./results/豆瓣电影喜剧评分90-100.json',mode='a+',encoding='utf-8') as fp:
        fp.write(str(resp.json()))
    print("已经爬取{}个内容".format(page))
    page+=20
print("OK")