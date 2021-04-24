<p>
	<img src="https://img.shields.io/badge/Maven-green.svg" ></img>
	<a target="_blank" href="https://www.oracle.com/technetwork/java/javase/downloads/index.html">
		<img src="https://img.shields.io/badge/JDK-1.8+-blue.svg" ></img>
	</a>
	<img src="https://img.shields.io/badge/SpringBoot-2-green.svg" ></img>
	<img src="https://img.shields.io/badge/MySQL-8-red.svg" ></img>
  <img src="https://img.shields.io/badge/Mybatis-3.5-green.svg" ></img>
	<img src="https://img.shields.io/badge/Shiro-1.7-red.svg" ></img>
	<img src="https://img.shields.io/badge/Druid-1.2-yellow.svg" ></img>
	<img src="https://img.shields.io/badge/Thymeleaf-3.0-blue.svg" ></img>
</p>

# dynasty
## 平台简介
dynasty可以用于所有的Web应用程序，如网站管理后台，网站会员中心，CMS，CRM，OA。所有前端后台代码封装过后十分精简易上手，出错概率低。同时支持移动客户端访问。系统会陆续更新一些实用功能。
dynasty是一套全部开源的快速开发平台。


## 内置功能
1.  用户管理：用户是系统操作者，该功能主要完成系统用户配置。
2.  部门管理：配置系统组织机构（公司、部门、小组），树结构展现支持数据权限。
3.  岗位管理：配置系统用户所属担任职务。
4.  菜单管理：配置系统菜单，操作权限，按钮权限标识等。
5.  角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
6.  字典管理：对系统中经常使用的一些较为固定的数据进行维护。
7.  参数管理：对系统动态配置常用参数。
8.  通知公告：系统通知公告信息发布维护。
9.  操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
10. 登录日志：系统登录日志记录查询包含登录异常。
11. 在线用户：当前系统中活跃用户状态监控。
12. 定时任务：在线（添加、修改、删除)任务调度包含执行结果日志。
13. 代码生成：前后端代码的生成（java、html、xml、sql）支持CRUD下载 。
14. 系统接口：根据业务代码自动生成相关的api接口文档。
15. 服务监控：监视当前系统CPU、内存、磁盘、堆栈等相关信息。
16. 缓存监控：对系统的缓存查询，删除、清空等操作。
17. 在线构建器：拖动表单元素生成相应的HTML代码。
18. 连接池监视：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。

## 主要特性
完全响应式布局（支持电脑、平板、手机等所有主流设备）。<br>
强大的一键生成功能（包括控制器、模型、视图、菜单等）。<br>
支持多数据源，简单配置即可实现切换。<br>
支持按钮及数据权限，可自定义部门数据权限。<br>
对常用js插件进行二次封装，使js代码变得简洁，更加易维护。<br>
完善的XSS防范及脚本过滤，彻底杜绝XSS攻击。<br>
Maven多项目依赖，模块及插件分项目，尽量松耦合，方便模块升级、增减模块。<br>
国际化支持，服务端及客户端支持。<br>
完善的日志记录体系简单注解即可实现<br>
支持服务监控，数据监控，缓存监控功能。<br>

## 技术选型
1、系统环境<br>
Java EE 8<br>
Servlet 3.0<br>
Apache Maven 3<br>

2、主框架<br>
Spring Boot 2.2.x<br>
Spring Framework 5.2.x<br>
Apache Shiro 1.7<br>

3、持久层<br>
Apache MyBatis 3.5.x<br>
Hibernate Validation 6.0.x<br>
Alibaba Druid 1.2.x<br>

4、视图层<br>
Bootstrap 3.3.7<br>
Thymeleaf 3.0.x<br>

## 项目结构
com.dynasty <br>    
├── common            ---工具类<br>
│       └──---- annotation                    ----自定义注解<br>
│       └──---- config                        ---------全局配置<br>
│       └──---- constant                      ------通用常量<br>
│       └──---- core                          -----------核心控制<br>
│       └──---- enums                         --------通用枚举<br>
│       └──---- exception                     -----通用异常<br>
│       └──---- json                          -----------JSON数据处理<br>
│       └──---- utils                         -----------通用类处理<br>
│       └──---- xss                           ------------XSS过滤处理<br>
├── framework         ---框架核心<br>
│       └──---- aspectj                       --------注解实现<br>
│       └──---- config                        ---------系统配置<br>
│       └──---- datasource                    ----数据权限<br>
│       └──---- interceptor                   ----拦截器<br>
│       └──---- manager                       ------异步处理<br>
│       └──---- shiro                         ----------权限控制<br>
│       └──---- web                           -----------前端控制<br>
├── dynasty-generator   ----代码生成（不用可移除）<br>
├── dynasty-quartz      --------定时任务（不用可移除）<br>
├── dynasty-system      -------系统代码<br>
├── dynasty-admin       --------后台服务<br>
