import re
search=re.search('\d+','我的电话是：10897，她的电话是：10887')
print(search.group())