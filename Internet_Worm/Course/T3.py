import requests
dicts={
    'q':'word'
}
web="https://www.douban.com/search"
request=requests.get(web,params=dicts)
print(request.url)