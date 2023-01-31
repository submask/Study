import re
iter=re.finditer(r'\d+','我的电话是：10897，她的电话是：10887')
for i in iter:
    print(i.group())