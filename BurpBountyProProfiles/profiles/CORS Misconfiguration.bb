[
  {
    "ProfileName": "CORS Misconfiguration",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@weujieytt",
    "Payloads": [
      "true,http://www.cors.eval.com"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,Access-Control-Allow-Credential: true",
      "true,Or,Access-Control-Allow-Origin: http://www.cors.eval.com",
      "true,Or,Access-Control-Allow-Origin: null",
      "true,Or,www.cors.eval.com"
    ],
    "Tags": [
      "All",
      "CORS"
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
    "OnlyHTTP": true,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": true,
    "sequence": false,
    "NewHeaders": [
      "Origin"
    ],
    "MatchType": 1,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 0,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "CORS Misconfiguration",
    "IssueSeverity": "Low",
    "IssueConfidence": "Firm",
    "IssueDetail": "https://github.com/swisskyrepo/PayloadsAllTheThings/tree/master/CORS%20Misconfiguration\n\n\u003cbr/\u003e\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e\n\u003cbr/\u003e\u003cbr/\u003e\n- GREP: \u003cbr/\u003e\u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      64,
      72,
      78
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]