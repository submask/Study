import requests
header={
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36 Edg/109.0.1518.69"
}
word=input("请输入查询信息")
url="https://www.sogou.com/web?query={}".format(word)
resp=requests.get(url=url,headers=header)
resp.encoding='utf-8'

with open("./pages/{}.html".format(word),mode='w+',encoding='utf-8') as fp:
    fp.write(resp.text)
    fp.close()
resp.close()
print("OK")