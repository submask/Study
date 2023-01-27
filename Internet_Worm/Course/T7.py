import chardet
str="网络爬虫练习".encode("utf-8")
print(str)
print(type(str))
print(chardet.detect(str))
str_dec=str.decode("utf-8")
print(str_dec)
print(type(str_dec))