## 本项目为ZTuo数字资产交易平台钱包RPC端，仅供学习交流。

- ## [English](README-EN.md)
---
# 捐赠:
#### 您的捐赠是我们开源最大的动力
- BTC/USDT(比特币/USDT)：1Dwwqhw9pV9iSSQwuJc8nAygda7XfahaoW
- ETH/USDT(以太坊/USDT)：0x4f1ea0f10aa99f608f31f70b4d3119f6928693ed
- LTC(莱特币)：LXr4TMtDhCSpdAo98vg2sbvX3UXDVPQvMa

## 加入我们
    为方便大家交流和学习，请各位小伙伴加入QQ交流群：
	*区块链交易所技术知识交流群【QQ群：735446452】

#### 项目介绍
支持各个币种的RPC,RPC的部署及测试都需要有相关钱包节点的支撑
(缺失jar包在jar文件夹中)


####
模块说明

1.act

* act币种RPC

2.bitcoin

* BTC币种RPC

3.ect

* ect币种RPC

4.erc-token

* 基于以太坊的token
* 部署时，eth模块必须先部署
* 如果有多个token，修改配置文件中的coin.name，coin.unit再部署一个

5.eth

* 以太坊相关RPC

6.eth-support

* 对以太坊及其token提供支持

7.rpc-common

* 公共模块

8.usdt

* usdt币种RPC