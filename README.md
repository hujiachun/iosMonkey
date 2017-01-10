# iosMonkey

1、准备macaca环境
#安装命令行工具和驱动模块
$ npm i -g macaca-cli macaca-ios
#安装成功后命令行显示类似于：
/Users/xxxxx/.nvm/versions/node/v6.0.0/lib
├── macaca-cli@1.1.21 
└── macaca-ios@1.0.53
记录一下macaca-ios地址：/Users/xxxxx/.nvm/versions/node/v6.0.0/lib/macaca-ios

#安装usbmuxd
$ brew install usbmuxd

#安装ios_webkit_debug_proxy
$ brew install ios_webkit_debug_proxy

#安装ios-deploy
$ brew install ios-deploy

#安装ideviceinstaller
$ brew install ideviceinstaller

#安装carthage
$ brew install carthage

#检测macaca环境
$ macaca doctor

2、打包WDA

3、执行iosMonkey
$ java -jar [iosMonkey.jar Path] -u [设备的UDID] -b [测试App的BundleID]

