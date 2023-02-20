import re
res=re.compile(r'\d+')
# cpe=res.finditer('我的电话是：10897，她的电话是：10887')
# for i in cpe:
#     print(i.group())
# '''
# 结果：
# 10897
# 10887
# '''
# cpe=res.findall('我的电话是：10897，她的电话是：10887')
# print(cpe)
# '''
# 结果：
# ['10897', '10887']
# '''
# cpe=res.search('我的电话是：10897，她的电话是：10887')
# print(cpe)
# print(cpe.group())
# print(cpe.group())
# '''
# 结果：
# <re.Match object; span=(6, 11), match='10897'>
# 10897
# 10897
# '''
'''
cpe=res.match('我的电话是：10897，她的电话是：10887')
print(cpe)
print(cpe.group())
结果：
Traceback (most recent call last):
  File "D:/Study_Files/Internet_Worm/Video/Unit2/T1-RE模块的基本使用/T5-re模块complie练习.py", line 29, in <module>
    print(cpe.group())
AttributeError: 'NoneType' object has no attribute 'group'
显示匹配开头信息必须要满足正则表达式，否则回报以上错误
'''
# cpe=res.match('10897，她的电话是：10887')
# print(cpe)
# print(cpe.group())
# print(cpe.group())
# '''
# 结果：
# <re.Match object; span=(0, 5), match='10897'>
# 10897
# 10897
# '''