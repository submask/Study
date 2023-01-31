import re
# match=re.match('\d+','我是来自xx5班xxx我的学号是23412')
match=re.match('\d+','5班xxx我的学号是23412')
print(match.group())