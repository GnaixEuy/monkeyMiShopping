# 猴米商城🐒

---

> ### **本项目由北京动力节点的ssm实战项目修改而成｜ jsp修改为试用thymeleaf ssm修改为springboot ** 

### **开发日志**

* 2021年10年21日： 重新引用了项目框架，导入了css和JavaScript等项目资源文件，使用mybatis Generator逆向工程逆向了数据库
* 2021年10月24日：引入了MD5加密类，引入了mybatis、druid、完成了mybatis的配置和charset filter的配置、迁移了部分jsp页面至thymeleaf
* 2021年10月25日：完成了基本管理员登入功能，修复了页面错误，修复了MybatisGenerator错误配置文件生成不可用mapper的错误，修复mybatis和springboot的版本冲突问题
* 2021年10月26日：修复了大量thymeleaf用法错误，基本构建了product功能，引入pagehelper插件
* 2021年10月27日：pageHelper存在bug 待排查错误
* 2021年10月29，30日：修复了分页查询的thymeleaf bug，完善了部分分页查询功能
* 2021年10月31日：修复了页面的商品类型选项(优化thymeleaf正确写法) 更新配置文件(文件上传部分配置)，完善分页功能 商品类型通过监听器加载
* 2021年11月7日：完成添加商品功能