import requests
web="https://www.douban.com/"
try:
    request=requests.get(web,timeout=0.1)
except requests.Timeout:
    print("超时")
else:
    print(request.status_code)