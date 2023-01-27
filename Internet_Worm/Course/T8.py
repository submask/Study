import requests
import chardet
web="https://www.sina.com.cn/"
request=requests.get(web)
print(request.encoding)#检测网页编码
print(chardet.detect(request.content))#网页编码返回的编码类型
typer=chardet.detect(request.content)["encoding"]#选中网页的encoding
print(request.content.decode(typer))#输出网页解码后的内容