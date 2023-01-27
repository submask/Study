import requests
for i in range(0,226,25):
    web="https://movie.douban.com/top250?start={}&filter=".format(i)
    header={
        "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36 Edg/105.0.1343.53"
    }
    request=requests.get(web,headers=header)
    with open("context.txt".format(i),"a+",encoding="utf-8") as file:
        print("{}的响应状态码是{}".format(request.url,request.status_code))
        file.write(request.text)
    
