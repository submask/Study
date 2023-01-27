import requests
keywords=input("请输入要查询的内容")
con={
 "kw":"{}".format(keywords)
}
url="https://fanyi.baidu.com/sug"
req=requests.post(url=url,data=con)
with open("./results/{}.html".format(keywords),mode='w+') as fp:
 for i in range(0,len(req.json()['data'])):
  print(req.json()['data'][i]['k']+" "* 5+req.json()['data'][i]['v'])
  fp.write(str(req.json()))
print('OK')
req.close()