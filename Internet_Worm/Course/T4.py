import requests
web="https://www.douban.com/"
header={
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36 Edg/105.0.1343.53",
    "Cookie": "bid=0fMwaUg8VcE; ll=`118204`; _pk_ses.100001.8cb4=*; __utma=30149280.1923210622.1664522649.1664522649.1664522649.1; __utmc=30149280; __utmz=30149280.1664522649.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utmt=1; __utmb=30149280.1.10.1664522649; dbcl2=`263232953:PE9GA0uLha0`; ck=s0OQ; ap_v=0,6.0; __yadk_uid=KoaDxmWCejPHviKsqIRhAsWPFW9xlPRA; __gads=ID=2a2553cc661019bc-22b1dcf3bed60047:T=1664522836:RT=1664522836:S=ALNI_MbscBKwwa76OcO0QkI3SYGPBqopLw; __gpi=UID=00000a10abf72006:T=1664522836:RT=1664522836:S=ALNI_MbhazwV3memlA7WcMzDeGI8baE7mA; _pk_id.100001.8cb4=4f8a9834d91e8206.1664522628.1.1664522836.1664522628."
}
request=requests.get(web,headers=header)
print(request.text)