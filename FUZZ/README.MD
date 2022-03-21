# FUZZ

- httpx
- ffuf

## 域名爆破 
  - domain-extension.txt 根域名爆破 eg:www.baidu.FUZZ
  - subnames.txt 二级域名爆破 eg: FUZZ.baidu.com
  - subnames-full.txt 二级域名爆破(大字典) eg: FUZZ.baidu.com
 ### 用例：
  ```
  wget -q -O - "https://raw.githubusercontent.com/weujieytt/SrcCommon/main/FUZZ/subnames.txt"| sed 's/FUZZ/baidu.com/g' | httpx -sc -title -location -t 100
  ```
 ![image](https://user-images.githubusercontent.com/70327097/145672111-e1f94b68-6cdd-4c00-bb47-a02ddaa576f5.png)
 
## 403Bypass
  - 403BypassDirgener.py  恶意目录生成
  - Spring-actuaorFUZZ.txt /actuator/env 生成实例，总共1020条目录
### 用例
 ```
  ffuf -w target.txt:URL -w Spring-actuaorFUZZ.txt:FUZZ -u URLFUZZ  -of csv -o result.csv -fc 301
 ```
  注意：
     如果确定了存在路径/api，指令可以换成 -u URL/apiFUZZ


