import re
resp=re.compile("^[A-Za-z0-9]+@\w+\.\w+")
list=['3056762376@qq.com','wea@qq.com','yh3056762376_@163.com']
for i in list:
    result1=resp.findall(i)
    if result1==[]:
        continue
    print(result1)
print("-------------使用finditer--------------")
for i in list:
    result2=resp.finditer(i)
    for j in result2:
        print(j.group())
print("-------------使用re.search-------------")
for i in list:
    result3=resp.search(i)
    print(result3.group())
print("------------使用match函数练习-----------")
for i in list:
    result4=re.match(".*",i)
    print(result4.group())