import requests
values={
    'name':"小小",
    'password':'i_See_us',
    'remember':'true'
}
url="https://accounts.douban.com/j/mobile/login/basic"
request=requests.post(url,data=values)
print("对象输出类型：{}".format(type(request)))
print("对象输出的url：{}".format(request.url))
print("对象输出的状态码：{}".format(request.status_code))
print("对象输出的请求头:{}".format(request.headers))