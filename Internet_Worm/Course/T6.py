import requests
web="https://img9.doubanio.com/view/subject/s/public/s34283794.jpg"
request=requests.get(web)
for i in range(1,20):
    with open("\Pythons Files\imgs\imgs{}.jpg".format(i),"wb") as file:
        file.write(request.content)