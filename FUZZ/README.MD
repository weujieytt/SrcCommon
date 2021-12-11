 # 请将文件内的FUZZ去除
 eg
 
 ## httpx
```bash
wget -q -O - "https://raw.githubusercontent.com/weujieytt/SrcCommon/main/FUZZ/subnames.txt"| sed 's/FUZZ/baidu.com/g' | httpx -sc -title -location -t 100
```
![image](https://user-images.githubusercontent.com/70327097/145672111-e1f94b68-6cdd-4c00-bb47-a02ddaa576f5.png)
