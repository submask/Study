import json

import requests
url="http://www.xinfadi.com.cn/getPriceData.html"
list=[]
for i in range(1,10):
    headers={
        "current":i
    }
    resp=requests.post(url,data=headers)
    for item in range(0,len(resp.json()['list'])):
        resp.json()['list'][item]['prodName']+","+resp.json()['list'][item]['prodCat']+","+resp.json()['list'][item]['lowPrice']+","+resp.json()['list'][item]['highPrice']+","+resp.json()['list'][item]['avgPrice']+","+resp.json()['list'][item]['place']
