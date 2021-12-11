 # 请将文件内的FUZZ去除
 eg
 
 ## httpx
```bash
wget -qO "https://raw.githubusercontent.com/weujieytt/SrcCommon/main/FUZZ/subnames.txt" | sed 's/FUZZ/yourDomain.com/g' | httpx -title -status-code -location -t 200 
```
