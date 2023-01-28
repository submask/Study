import requests
url='https://movie.douban.com/j/chart/top_list'
headers={
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36 Edg/109.0.1518.69"
}
for first in range(0,101,10):
    for i in range(0,1000,20):
        datas={
            "type": "24",
            "interval_id": "{}:{}".format(first+10,first),
            "action":"",
            "start": "{}".format(i),
            "limit": "20"
        }
        if(first>100 or first+10==100):
            break
        resp=requests.get(url=url,params=datas,headers=headers)
        resp.encoding='utf-8'
        with open('./results/豆瓣电影喜剧评分{}-{}.json'.format(first+10,first),mode='a+',encoding='utf-8') as fp:
            fp.write(str(resp.json()))
        print("正在爬取豆瓣评分{}-{}喜剧电影,已经爬取{}个内容".format(first+10,first,i))
fp.close()
resp.close()
print(resp.request.headers)
print("OK")